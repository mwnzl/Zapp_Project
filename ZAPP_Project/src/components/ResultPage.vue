<template>
  <div id="app">
    <NavBar />
    <div class="page">
      <main>
        <h2>Dein Ergebnis</h2>
        <div class="result-container">
          <div class="result-left">
            <h3>Beruf mit der meisten Zustimmung</h3>
            <p>{{ topMatch }} ({{ topMatchPercentage }}%)</p>
            <router-link :to="`/beruf/${topMatch.toLowerCase().replace(/\s+/g, '')}`" class="zapp-button">Mehr über {{ topMatch }} erfahren</router-link>
          </div>
          <div class="result-right">
            <h3>Beruf mit der zweitmeisten Zustimmung</h3>
            <p>{{ secondMatch }} ({{ secondMatchPercentage }}%)</p>
            <router-link :to="`/beruf/${secondMatch.toLowerCase().replace(/\s+/g, '')}`" class="zapp-button">Mehr über {{ secondMatch }} erfahren</router-link>
          </div>
        </div>
        <p>Das klingt garnicht nach dir? Wie wäre es mit anderen Berufen:</p>
        <router-link to="/beruf" class="zapp-button">Andere Berufe entdecken</router-link>
        <router-link to="/" class="zapp-button">Zurück zur Startseite</router-link>
      </main>
    </div>
  </div>
</template>

<script setup>
import NavBar from "@/components/NavBar.vue";
import { onMounted, ref } from "vue";
import { useRoute } from "vue-router";
import { useResizeWatcher } from "@/composables/useResizeWatcher";
import axios from 'axios';

const route = useRoute();
const topMatch = ref("");
const topMatchPoints = ref(0);
const topMatchPercentage = ref(0);
const secondMatch = ref("");
const secondMatchPoints = ref(0);
const secondMatchPercentage = ref(0);

onMounted(() => {
  const punkte = JSON.parse(route.query.punkte || '{}');
  const totalPoints = Object.values(punkte).reduce((sum, value) => sum + value, 0);
  const sortedBerufe = Object.entries(punkte).sort(([, a], [, b]) => b - a);

  if (sortedBerufe.length > 0) {
    topMatch.value = sortedBerufe[0][0];
    topMatchPoints.value = sortedBerufe[0][1];
    topMatchPercentage.value = ((sortedBerufe[0][1] / totalPoints) * 100).toFixed(2);
  }

  if (sortedBerufe.length > 1) {
    secondMatch.value = sortedBerufe[1][0];
    secondMatchPoints.value = sortedBerufe[1][1];
    secondMatchPercentage.value = ((sortedBerufe[1][1] / totalPoints) * 100).toFixed(2);
  }

  console.log(punkte)
  sendAnswersToBackend(punkte)
});

const sendAnswersToBackend = async (punkte) => {
  const data2send = {
      'userId': null,
      'professionScores': punkte
  }
  try {
    const response = await axios.post(
        "/api/results", data2send);
    console.log('Antwort erfolgreich gesendet:', response.data);
  } catch (error) {
    console.error('Fehler beim Senden der Antwort:', error);
  }
};

const handleAnswerSelection = (selectedAnswer) => {
  sendAnswerToBackend(selectedAnswer);
};

useResizeWatcher();
</script>

<style scoped>
@import url('https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap');

.page {
  font-family: 'Poppins', sans-serif;
  background-color: #f9f9f9;
  text-align: center;
  min-height: 100vh;
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  position: relative;
  padding-top: 60px;
}

.result-container {
  display: flex;
  justify-content: space-between;
  margin: 20px 0;
}

.result-left, .result-right {
  flex: 1;
  margin: 0 10px;
  padding: 20px;
  background-color: #ffffff;
  border: 1px solid #ddd;
  border-radius: 8px;
  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
  display: flex;
  flex-direction: column;
  align-items: center;
}

.zapp-button {
  display: inline-block;
  margin: 10px;
  padding: 12px 24px;
  font-size: 16px;
  font-weight: bold;
  background-color: #007833;
  color: white;
  text-decoration: none;
  border-radius: 8px;
  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
  transition: all 0.3s ease;
}

.zapp-button:hover {
  background-color: #005d27;
  transform: translateY(-2px);
  box-shadow: 0 6px 8px rgba(0, 0, 0, 0.15);
}

.zapp-button:active {
  transform: translateY(0);
  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
}

@media (max-width: 480px) {
  .page {
    padding: 10px;
    text-align: center;
  }

  h2 {
    font-size: 24px;
    margin-bottom: 10px;
  }

  .result-container {
    flex-direction: column;
    align-items: center;
  }

  .result-left, .result-right {
    width: 100%;
    margin: 10px 0;
    padding: 15px;
  }

  .zapp-button {
    width: 100%;
    padding: 10px;
    font-size: 14px;
  }
}
</style>

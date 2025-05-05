<template>
  <div id="app">
    <NavBar />
    <div class="page">
      <main>
        <h2>Dein Ergebnis</h2>
        <div class="result-container">
          <div class="result-left">
            <h3>Beruf mit der meisten Zustimmung</h3>
            <p>{{ topMatch }} ({{ topMatchPoints }} Punkte)</p>
            <router-link :to="topMatchRoute" class="zapp-button">Mehr über {{ topMatch }} erfahren</router-link>
          </div>
          <div class="result-right">
            <h3>Beruf mit der zweitmeisten Zustimmung</h3>
            <p>{{ secondMatch }} ({{ secondMatchPoints }} Punkte)</p>
            <router-link :to="secondMatchRoute" class="zapp-button">Mehr über {{ secondMatch }} erfahren</router-link>
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

// Mock data for demonstration purposes
const topMatch = "Industriemechaniker";
const topMatchPoints = 85;
const secondMatch = "Elektroniker";
const secondMatchPoints = 75;

// Dynamically determine the routes based on the matches
const topMatchRoute = `/beruf/${topMatch.toLowerCase()}`;
const secondMatchRoute = `/beruf/${secondMatch.toLowerCase()}`;
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
  padding-top: 60px; /* Prevent NavBar overlap */
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
</style>

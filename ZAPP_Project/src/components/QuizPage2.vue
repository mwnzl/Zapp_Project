<template>
  <div id="app">
    <NavBar />
    <div class="quiz-page">
      <main v-if="fragen && fragen.length">
        <h2>Frage {{ currentStep + 1 }} von {{ fragen.length }}</h2>
        <p>{{ aktuelleFrage.text }}</p>
        <form @submit.prevent="naechsteFrage">
          <div v-for="(option, index) in aktuelleFrage.options" :key="index">
            <label>
              <input type="radio" :value="option" v-model="selected" />
              {{ option }}
            </label>
          </div>
          <button type="submit">Weiter</button>
        </form>
      </main>

      <div v-else-if="fehlermeldung">
        <p style="color:red">Fehler: {{ fehlermeldung }}</p>
      </div>

      <div v-else>
        <p>Lade Fragen...</p>
      </div>
    </div>
  </div>
</template>

<script>
import NavBar from "@/components/NavBar.vue";

export default {
  components: {
    NavBar
  },
  data() {
    return {
      fragen: null, // Wird mit den Backend-Fragen gefüllt
      currentStep: 0,
      selected: null,
      fehlermeldung: '',
    };
  },
  computed: {
    aktuelleFrage() {
      return this.fragen ? this.fragen[this.currentStep] : null;
    }
  },
  mounted() {
    this.ladeDaten();
  },
  methods: {
    async ladeDaten() {
      try {
        const response = await fetch('data/questions.json');
        if (!response.ok) {
          throw new Error('Fehler beim Abrufen der Daten vom Backend');
        }
        const data = await response.json();
        this.fragen = data;
      } catch (error) {
        this.fehlermeldung = error.message;
        console.error(error);
      }
    },
    naechsteFrage() {
      if (this.selected !== null) {
        this.selected = null; // Zurücksetzen für die nächste Frage
        if (this.currentStep < this.fragen.length - 1) {
          this.currentStep++;
        } else {
          this.$router.push("/result"); // Navigation am Ende
        }
      } else {
        alert("Bitte eine Antwort auswählen!");
      }
    }
  }
};
</script>

<style scoped>
.quiz-page {
  font-family: 'Roboto', sans-serif;
  background-color: #f9f9f9;
  text-align: center;
  min-height: 100vh;
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  position: relative;
  padding-top: 60px; /* Prevent NavBar overlap */
}

h2 {
  margin-top: 30px;
  color: #333;
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

<template>
    <div class="quiz-page">
      <header class="zapp-header">
        <img src="@/assets/zapp-logo.jpeg" alt="ZAPP Logo" class="logo" />
      </header>
  
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
  </template>
  
  <script>
  export default {
    data() {
      return {
        fragen: null,            // Wird mit den Backend-Fragen gefüllt
        currentStep: 0,
        selected: null,
        fehlermeldung: '',
      };
    },
    computed: {
      aktuelleFrage() {
        return this.fragen[this.currentStep];
      }
    },
    mounted() {
      this.ladeDaten();
    },
    methods: {
      async ladeDaten() {
        try {
          const response = await fetch('http://192.168.64.1:8080/api/questions');
          if (!response.ok) {
            throw new Error('Fehler beim Abrufen der Daten');
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
            this.$router.push("/ergebnis"); // Navigation am Ende
          }
        } else {
          alert("Bitte eine Antwort auswählen!");
        }
      }
    }
  };
  </script>
  
  <style scoped>
  /* Dein CSS bleibt gleich */
  </style>
  
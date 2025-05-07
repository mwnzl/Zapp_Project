<template>
  <div id="app">
    <NavBar />
    <div class="quiz-page">
      <main v-if="fragen && fragen.length">
        <div class="progress-bar">
          <div class="progress" :style="{ width: ((currentStep + 1) / fragen.length) * 100 + '%' }"></div>
        </div>
        <h2>Frage {{ currentStep + 1 }} von {{ fragen.length }}</h2>
        <p class="question-text">{{ aktuelleFrage.text }}</p>
        <form @submit.prevent="naechsteFrage">
          <div class="options" v-for="(option, index) in aktuelleFrage.options" :key="index">
            <label class="option-label">
              <input type="radio" :value="option.text" v-model="selected" />
              <span class="option-text">{{ option.text }}</span>
            </label>
          </div>
          <button class="zapp-button" type="submit">Weiter</button>
        </form>
      </main>

      <div v-else-if="fehlermeldung">
        <p class="error-message">Fehler: {{ fehlermeldung }}</p>
      </div>

      <div v-else>
        <p class="loading-message">Lade Fragen...</p>
      </div>
    </div>
  </div>
</template>

<script>
import NavBar from "@/components/NavBar.vue";
import { ref, onMounted, onBeforeUnmount } from "vue";
import { useResizeWatcher } from "@/composables/useResizeWatcher";

export default {
  components: {
    NavBar
  },
  data() {
    return {
      fragen: null, 
      currentStep: 0,
      selected: null,
      fehlermeldung: '',
      berufPunkte: {
        Industriemechaniker: 0,
        Elektroniker: 0,
        Verfahrenstechnologe: 0,
        Werkstoffpruefer: 0,
        Werkzeugmechaniker: 0,
        Zerspannungsmechaniker: 0
      }
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
        const response = await fetch(
            '/questions'
        );
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
        const selectedOption = this.aktuelleFrage.options.find(option => option.text === this.selected);
        if (selectedOption && selectedOption.points) {
          for (const [beruf, punkte] of Object.entries(selectedOption.points)) {
            this.berufPunkte[beruf] += punkte;
          }
        }

        this.selected = null; 
        if (this.currentStep < this.fragen.length - 1) {
          this.currentStep++;
        } else {
          this.$router.push({
            path: "/result",
            query: {
              punkte: JSON.stringify(this.berufPunkte)
            }
          }); 
        }
      } else {
        alert("Bitte eine Antwort auswählen!");
      }
    }
  },
  setup() {
    const { screenWidth } = useResizeWatcher();
    return { screenWidth };
  }
};
</script>

<style scoped>
.quiz-page {
  font-family: 'Roboto', sans-serif;
  background: #f0f0f0; 
  text-align: center;
  min-height: 100vh;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  padding: 20px;
  background-size: cover;
  background-attachment: fixed;
}

.progress-bar {
  width: 100%;
  height: 10px;
  background-color: #e0e0e0;
  border-radius: 5px;
  overflow: hidden;
  margin-bottom: 20px;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
}

.progress {
  height: 100%;
  background: linear-gradient(90deg, #007833, #00c853);
  transition: width 0.3s ease;
}

h2 {
  margin-top: 20px;
  color: #333;
  font-size: 24px;
  text-shadow: 1px 1px 2px rgba(0, 0, 0, 0.2);
}

.question-text {
  font-size: 20px;
  margin: 20px 0;
  color: #555;
  line-height: 1.5;
}

.options {
  margin: 10px 0;
}

.option-label {
  display: block;
  margin: 10px 0;
  font-size: 18px;
  color: #333;
  cursor: pointer;
  transition: transform 0.2s ease, background-color 0.2s ease;
  padding: 10px;
  border-radius: 8px;
  background-color: #f9f9f9;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
}

.option-label:hover {
  background-color: #e0f7fa;
  transform: scale(1.02);
}

.option-label input {
  margin-right: 10px;
}

.zapp-button {
  display: inline-block;
  margin: 20px;
  padding: 12px 24px;
  font-size: 16px;
  font-weight: bold;
  background: linear-gradient(135deg, #007833, #00c853);
  color: white;
  text-decoration: none;
  border-radius: 8px;
  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
  transition: all 0.3s ease;
}

.zapp-button:hover {
  background: linear-gradient(135deg, #005d27, #009624);
  transform: translateY(-2px);
  box-shadow: 0 6px 8px rgba(0, 0, 0, 0.15);
}

.zapp-button:active {
  transform: translateY(0);
  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
}

.error-message {
  color: red;
  font-size: 16px;
  font-weight: bold;
}

.loading-message {
  font-size: 16px;
  color: #555;
  font-style: italic;
}
</style>

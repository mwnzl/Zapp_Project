<template>
  <div id="app">
    <NavBar />
    <div class="quiz-page">
      <main v-if="currentQuestionIndex < questions.length">
        <div class="progress-bar">
          <div class="progress" :style="{ width: ((currentQuestionIndex + 1) / questions.length) * 100 + '%' }"></div>
        </div>
        <h2>Frage {{ currentQuestionIndex + 1 }} von {{ questions.length }}</h2>
        <p class="question-text">{{ questions[currentQuestionIndex].text }}</p>
        <form @submit.prevent="checkAnswer">
          <div class="options" v-for="(answer, i) in questions[currentQuestionIndex].answers" :key="i">
            <label class="option-label">
              <input type="checkbox" :value="i" v-model="userAnswers" />
              <span class="option-text">{{ answer.text }}</span>
            </label>
          </div>
          <button class="zapp-button" type="submit">Überprüfen</button>
        </form>
      </main>

      <div v-else>
        <p class="results">Du hast {{ correctAnswers }} von {{ questions.length }} Fragen richtig beantwortet!</p>
        <p v-if="correctAnswers > 7">Super!</p>
        <p v-else-if="correctAnswers > 4">Toll!</p>
        <p v-else>Schade!</p>
        <button class="zapp-button" @click="$router.push('/')">Zur Startseite</button>
        <button class="zapp-button" @click="$router.push('/beruf/werkstoffprüfer')">Zurück zum Werkstoffprüfer</button>
      </div>

      <div v-if="feedback" class="feedback">
        <p>{{ feedback }}</p>
        <button v-if="currentQuestionIndex < questions.length" class="zapp-button" @click="nextQuestion">Nächste Frage</button>
      </div>
    </div>
  </div>
</template>

<script>
import NavBar from "@/components/NavBar.vue";
import { useResizeWatcher } from "@/composables/useResizeWatcher";

export default {
  name: 'QuizPageWerkstoffprüfer',
  components: {
    NavBar
  },
  data() {
    return {
      questions: [
        {
          text: 'Was ist die Hauptaufgabe eines/einer Werkstoffprüfer*in?',
          answers: [
            { text: 'Materialien auf Qualität prüfen', correct: true },
            { text: 'Autos reparieren', correct: false },
            { text: 'Häuser bauen', correct: false },
            { text: 'Computer programmieren', correct: false }
          ]
        },
        {
          text: 'Welche Werkzeuge benutzt ein/e Werkstoffprüfer*in häufig?',
          answers: [
            { text: 'Hammer und Nägel', correct: false },
            { text: 'Messgeräte und Mikroskope', correct: true },
            { text: 'Pinsel und Farben', correct: false },
            { text: 'Stifte und Papier', correct: false }
          ]
        },
        {
          text: 'In welcher Branche arbeiten Werkstoffprüfer*innen hauptsächlich?',
          answers: [
            { text: 'Gesundheitswesen', correct: false },
            { text: 'Bauwesen', correct: false },
            { text: 'Materialprüfung', correct: true },
            { text: 'Landwirtschaft', correct: false }
          ]
        },
        {
          text: 'Was gehört zu den Aufgaben eines/einer Werkstoffprüfer*in?',
          answers: [
            { text: 'Materialproben entnehmen', correct: true },
            { text: 'Patienten behandeln', correct: false },
            { text: 'Bücher schreiben', correct: false },
            { text: 'Lebensmittel verkaufen', correct: false }
          ]
        },
        {
          text: 'Welche Ausbildung benötigt man, um Werkstoffprüfer*in zu werden?',
          answers: [
            { text: 'Studium', correct: false },
            { text: 'Berufsausbildung', correct: true },
            { text: 'Praktikum', correct: false },
            { text: 'Selbststudium', correct: false }
          ]
        },
        {
          text: 'Welche Materialien bearbeitet ein/e Werkstoffprüfer*in?',
          answers: [
            { text: 'Holz', correct: false },
            { text: 'Verschiedene Werkstoffe', correct: true },
            { text: 'Glas', correct: false },
            { text: 'Kunststoff', correct: false }
          ]
        },
        {
          text: 'Was ist ein typisches Arbeitsumfeld für Werkstoffprüfer*innen?',
          answers: [
            { text: 'Labor', correct: true },
            { text: 'Autowerkstatt', correct: false },
            { text: 'Krankenhaus', correct: false },
            { text: 'Schule', correct: false }
          ]
        },
        {
          text: 'Welche Prüfmethoden verwenden Werkstoffprüfer*innen?',
          answers: [
            { text: 'Röntgenprüfung', correct: true },
            { text: 'Nähmaschinen', correct: false },
            { text: 'Druckmaschinen', correct: false },
            { text: 'Kaffeemaschinen', correct: false }
          ]
        },
        {
          text: 'Welche Sicherheitsausrüstung tragen Werkstoffprüfer*innen?',
          answers: [
            { text: 'Schutzbrille und Handschuhe', correct: true },
            { text: 'Hammer und Helm', correct: false },
            { text: 'Kochlöffel und Messer', correct: false },
            { text: 'Anzug und Krawatte', correct: false }
          ]
        },
        {
          text: 'Welche Fähigkeiten sind für Werkstoffprüfer*innen wichtig?',
          answers: [
            { text: 'Kreativität', correct: false },
            { text: 'Analytisches Denken', correct: true },
            { text: 'Musikalisches Talent', correct: false },
            { text: 'Sprachkenntnisse', correct: false }
          ]
        }
      ],
      currentQuestionIndex: 0,
      userAnswers: [],
      correctAnswers: 0,
      feedback: ''
    };
  },
  methods: {
    checkAnswer() {
      if (this.userAnswers.length === 0) {
        this.feedback = 'Bitte wähle mindestens eine Antwort aus.';
        return;
      }

      const correctAnswers = this.questions[this.currentQuestionIndex].answers
        .map((answer, index) => answer.correct ? index : null)
        .filter(index => index !== null);

      const isCorrect = correctAnswers.length === this.userAnswers.length &&
        this.userAnswers.every(answer => correctAnswers.includes(answer));

      if (isCorrect) {
        this.correctAnswers++;
        this.feedback = 'Richtig!';
      } else {
        this.feedback = 'Falsch!';
      }
    },
    nextQuestion() {
      this.feedback = '';
      this.userAnswers = [];
      this.currentQuestionIndex++;
    }
  },
  setup() {
    useResizeWatcher();
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

.results {
  margin-top: 20px;
  font-weight: bold;
}

.feedback {
  margin-top: 20px;
  font-weight: bold;
}
</style>
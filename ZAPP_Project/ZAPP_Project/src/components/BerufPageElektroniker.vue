<template>
  <div id="app">
    <NavBar />
    <div class="page">
      <main>
        <div class="content">
          <div class="text">
            <div class="image">
              <img src="@/assets/Labor-1.jpg" alt="Labor" />
            </div>
            <h2>Elektroniker</h2>
            <p>
              Elektroniker sind Experten für elektrische und elektronische Systeme. Sie planen, installieren und warten Anlagen und Geräte, die in der Industrie, im Handwerk oder in der Gebäudetechnik eingesetzt werden.
            </p>
            <div class="highlight">
              <h3>Elektroniker – Die Architekten der Elektrizität</h3>
              <p>
                Elektroniker sorgen dafür, dass Strom fließt und Technik funktioniert. Ob in der Automatisierungstechnik, Energieversorgung oder Kommunikationstechnik – sie sind unverzichtbar.
              </p>
            </div>
            <div class="section">
              <h4>Der Beruf im Überblick</h4>
              <ul>
                <li>Planung und Installation von elektrischen Anlagen</li>
                <li>Fehlersuche und Reparatur</li>
                <li>Arbeiten mit Schaltplänen</li>
                <li>Kenntnisse in Steuerungstechnik</li>
              </ul>
            </div>
            <div class="section">
              <h4>Was macht den Beruf besonders?</h4>
              <p>
                Der Beruf des Elektronikers ist vielseitig und zukunftssicher. Man arbeitet an spannenden Projekten und trägt dazu bei, dass moderne Technik reibungslos funktioniert.
              </p>
            </div>
            <div class="section">
              <h4>Der Weg dorthin: Ausbildung und Wissen</h4>
              <p>
                Die Ausbildung dauert dreieinhalb Jahre und vermittelt Kenntnisse in Elektrotechnik, Elektronik und Programmierung. Praktische Erfahrungen im Betrieb ergänzen die Theorie.
              </p>
              <img src="@/assets/Gabelstapler.JPG" alt="Gabelstapler" class="inline-image" />
            </div>
            <div class="quiz">
              <h4>Quiz: Was macht ein Elektroniker?</h4>
              <p>Welche dieser Aufgaben gehört nicht zu den Tätigkeiten eines Elektronikers?</p>
              <ul>
                <li>Schaltpläne lesen</li>
                <li>Software entwickeln</li>
                <li>Elektrische Anlagen warten</li>
              </ul>
            </div>
            <div class="section">
              <button class="zapp-button" @click="$router.push('/quiz-elektroniker')">Teste dein Wissen</button>
            </div>
          </div>
          <div class="navigation-buttons">
            <router-link to="/" class="zapp-button">Zurück zur Startseite</router-link>
            <router-link to="/beruf" class="zapp-button">Zurück zur Berufsauswahl</router-link>
          </div>
        </div>
      </main>
    </div>
  </div>
</template>

<script setup>
import NavBar from "@/components/NavBar.vue";
import { useResizeWatcher } from "@/composables/useResizeWatcher";

useResizeWatcher();
</script>

<style scoped>
.page {
  font-family: 'Roboto', sans-serif;
  background-color: #f9f9f9;
  text-align: center;
  min-height: 100vh;
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  position: relative;
  padding-top: 60px;
}

.content {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: 20px;
}

.text {
  text-align: left;
  max-width: 800px;
}

.image {
  float: right;
  margin: 0 0 20px 20px;
}

.image img {
  max-width: 300px;
  height: auto;
  border-radius: 8px;
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

.highlight {
  background-color: #e8f5e9;
  padding: 15px;
  border-radius: 8px;
  margin-bottom: 20px;
}

.section {
  margin-bottom: 20px;
}

.inline-image {
  max-width: 50%;
  height: auto;
  margin-top: 10px;
  border-radius: 8px;
}

.quiz {
  background-color: #fff3e0;
  padding: 15px;
  border-radius: 8px;
  margin-top: 20px;
}

.navigation-buttons {
  display: flex;
  justify-content: space-between;
  margin-top: 20px;
}

@media (max-width: 768px) {
  .page {
    padding-top: 50px;
  }

  .content {
    padding: 10px;
  }

  .text {
    text-align: center;
    max-width: 100%;
  }

  .image {
    float: none;
    margin: 0 auto 20px;
  }

  .image img {
    max-width: 100%;
    height: auto;
  }

  h2 {
    font-size: 1.5rem;
  }

  .zapp-button {
    font-size: 14px;
    padding: 10px 20px;
  }

  .inline-image {
    max-width: 100%;
  }

  .navigation-buttons {
    flex-direction: column;
    gap: 10px;
  }
}
</style>
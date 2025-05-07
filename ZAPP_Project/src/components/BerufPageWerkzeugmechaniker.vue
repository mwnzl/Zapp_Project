<template>
  <div id="app">
    <NavBar />
    <div class="page">
      <main>
        <div class="content">
          <div class="text">
            <div class="image">
              <img src="@/assets/Greifarm.JPG" alt="Greifarm" />
            </div>
            <h2>Werkzeugmechaniker</h2>
            <p>
              Werkzeugmechaniker sind Experten für die Herstellung und Wartung von Werkzeugen, Formen und Vorrichtungen, die in der industriellen Produktion eingesetzt werden.
            </p>
            <div class="highlight">
              <h3>Werkzeugmechaniker – Die Präzisionskünstler der Industrie</h3>
              <p>
                Sie arbeiten mit höchster Präzision und stellen sicher, dass Werkzeuge und Formen perfekt funktionieren, um hochwertige Produkte herzustellen.
              </p>
            </div>
            <div class="section">
              <h4>Der Beruf im Überblick</h4>
              <ul>
                <li>Herstellung von Präzisionswerkzeugen</li>
                <li>Wartung und Reparatur</li>
                <li>Arbeiten mit CNC-Maschinen</li>
                <li>Kenntnisse in Metallbearbeitung</li>
              </ul>
            </div>
            <div class="section">
              <h4>Was macht den Beruf besonders?</h4>
              <p>
                Der Beruf des Werkzeugmechanikers erfordert ein hohes Maß an Genauigkeit und handwerklichem Geschick. Jeder Tag bringt neue Herausforderungen und spannende Projekte.
              </p>
            </div>
            <div class="section">
              <h4>Der Weg dorthin: Ausbildung und Wissen</h4>
              <p>
                Die Ausbildung dauert dreieinhalb Jahre und umfasst theoretische und praktische Inhalte. Werkzeugmechaniker lernen, wie man Werkzeuge herstellt und wartet.
              </p>
              <img src="@/assets/Fraesen-1.jpg" alt="Fräsen" class="inline-image" />
            </div>
            <div class="quiz">
              <h4>Quiz: Was macht ein Werkzeugmechaniker?</h4>
              <p>Welche dieser Aufgaben gehört nicht zu den Tätigkeiten eines Werkzeugmechanikers?</p>
              <ul>
                <li>Werkzeuge herstellen</li>
                <li>Formen warten</li>
                <li>Software entwickeln</li>
              </ul>
            </div>
            <div class="section">
              <button class="zapp-button" @click="$router.push('/quiz-werkzeugmechaniker')">Teste dein Wissen</button>
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
  padding-top: 60px; /* Prevent NavBar overlap */
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
</style>
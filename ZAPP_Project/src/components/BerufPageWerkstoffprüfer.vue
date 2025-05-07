<template>
  <div id="app">
    <NavBar />
    <div class="page">
      <main>
        <div class="content">
          <div class="text">
            <div class="image">
              <img src="@/assets/Tauchzuege.jpg" alt="Tauchzüge" />
            </div>
            <h2>Werkstoffprüfer</h2>
            <p>
              Werkstoffprüfer sind Spezialisten für die Qualitätssicherung von Materialien. Sie untersuchen Werkstoffe auf ihre Eigenschaften und prüfen, ob sie den Anforderungen entsprechen.
            </p>
            <div class="highlight">
              <h3>Werkstoffprüfer – Die Wächter der Materialqualität</h3>
              <p>
                Werkstoffprüfer sorgen dafür, dass nur einwandfreie Materialien in die Produktion gelangen. Sie sind die Experten für Materialtests und Analysen.
              </p>
            </div>
            <div class="section">
              <h4>Der Beruf im Überblick</h4>
              <ul>
                <li>Prüfung von Werkstoffen</li>
                <li>Durchführung von Materialtests</li>
                <li>Analyse von Prüfergebnissen</li>
                <li>Kenntnisse in Chemie und Physik</li>
              </ul>
            </div>
            <div class="section">
              <h4>Was macht den Beruf besonders?</h4>
              <p>
                Der Beruf des Werkstoffprüfers ist anspruchsvoll und abwechslungsreich. Man arbeitet mit modernster Technik und trägt zur Qualitätssicherung bei.
              </p>
            </div>
            <div class="section">
              <h4>Der Weg dorthin: Ausbildung und Wissen</h4>
              <p>
                Die Ausbildung dauert dreieinhalb Jahre und umfasst theoretische und praktische Inhalte. Werkstoffprüfer lernen, wie man Materialien analysiert und Prüfverfahren anwendet.
              </p>
              <img src="@/assets/Labor-1.jpg" alt="Labor" class="inline-image" />
            </div>
            <div class="quiz">
              <h4>Quiz: Was macht ein Werkstoffprüfer?</h4>
              <p>Welche dieser Aufgaben gehört nicht zu den Tätigkeiten eines Werkstoffprüfers?</p>
              <ul>
                <li>Materialtests durchführen</li>
                <li>Prüfergebnisse analysieren</li>
                <li>Software entwickeln</li>
              </ul>
            </div>
            <div class="section">
              <button class="zapp-button" @click="$router.push('/quiz-werkstoffpruefer')">Teste dein Wissen</button>
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
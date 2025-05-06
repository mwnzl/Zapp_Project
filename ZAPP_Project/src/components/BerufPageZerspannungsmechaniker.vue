<template>
  <div id="app">
    <NavBar />
    <div class="page">
      <main>
        <div class="content">
          <div class="text">
            <div class="image">
              <img src="@/assets/Fraesen-1.jpg" alt="Fräsen" />
            </div>
            <h2>Zerspanungsmechaniker</h2>
            <p>
              Zerspanungsmechaniker sind Spezialisten für die Bearbeitung von Werkstücken durch spanende Verfahren wie Drehen, Fräsen oder Schleifen. Sie arbeiten mit hochpräzisen Maschinen und Werkzeugen.
            </p>
            <div class="highlight">
              <h3>Zerspanungsmechaniker – Die Präzisionshandwerker</h3>
              <p>
                Sie sorgen dafür, dass Werkstücke mit höchster Genauigkeit gefertigt werden, und sind unverzichtbar in der industriellen Fertigung.
              </p>
            </div>
            <div class="section">
              <h4>Der Beruf im Überblick</h4>
              <ul>
                <li>Bearbeitung von Werkstücken</li>
                <li>Arbeiten mit CNC-Maschinen</li>
                <li>Programmierung von Maschinen</li>
                <li>Kenntnisse in Metallbearbeitung</li>
              </ul>
            </div>
            <div class="section">
              <h4>Was macht den Beruf besonders?</h4>
              <p>
                Der Beruf des Zerspanungsmechanikers erfordert ein hohes Maß an Präzision und technisches Verständnis. Jeder Tag bringt neue Herausforderungen und spannende Projekte.
              </p>
            </div>
            <div class="section">
              <h4>Der Weg dorthin: Ausbildung und Wissen</h4>
              <p>
                Die Ausbildung dauert dreieinhalb Jahre und umfasst theoretische und praktische Inhalte. Zerspanungsmechaniker lernen, wie man Maschinen programmiert und Werkstücke bearbeitet.
              </p>
              <img src="@/assets/Gabelstapler.JPG" alt="Gabelstapler" class="inline-image" />
            </div>
            <div class="quiz">
              <h4>Quiz: Was macht ein Zerspanungsmechaniker?</h4>
              <p>Welche dieser Aufgaben gehört nicht zu den Tätigkeiten eines Zerspanungsmechanikers?</p>
              <ul>
                <li>Werkstücke bearbeiten</li>
                <li>Maschinen programmieren</li>
                <li>Software entwickeln</li>
              </ul>
            </div>
            <div class="section">
              <button class="zapp-button" @click="$router.push('/quiz-zerspannungsmechaniker')">Teste dein Wissen</button>
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
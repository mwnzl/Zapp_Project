<template>
  <div id="app">
    <NavBar />
    <div class="page">
      <main>
        <div class="content">
          <div class="text">
            <div class="image">
              <img src="@/assets/Maschine-1.jpeg" alt="Maschine" />
            </div>
            <h2>Industriemechaniker</h2>
            <p>
              Industriemechaniker sind Fachkräfte, die in der Herstellung, Instandhaltung und Überwachung von technischen Systemen tätig sind. Sie arbeiten in der Regel in der Industrie und sind für die Montage, Wartung und Reparatur von Maschinen und Anlagen verantwortlich.
            </p>
            <div class="highlight">
              <h3>Industriemechaniker – Die stillen Helden der Maschinenwelt</h3>
              <p>
                Hast du dich schon einmal gefragt, wie es möglich ist, dass riesige Maschinen tagtäglich zuverlässig arbeiten, Produkte in Sekundenschnelle entstehen und Fabriken rund um die Uhr laufen, als wären sie lebendig? Die Antwort darauf liegt oft verborgen – hinter dicken Metalltüren, in Werkshallen und Werkstätten: Dort arbeiten Industriemechanikerinnen und Industriemechaniker.
              </p>
            </div>
            <div class="section">
              <h4>Der Beruf im Überblick</h4>
              <ul>
                <li>Aufbau und Wartung von Maschinen</li>
                <li>Reparatur bei Störungen</li>
                <li>Arbeiten mit modernen CNC-Maschinen</li>
                <li>Kenntnisse in Hydraulik, Pneumatik und Elektronik</li>
              </ul>
            </div>
            <div class="section">
              <h4>Was macht den Beruf besonders?</h4>
              <p>
                Der Beruf des Industriemechanikers ist eine Mischung aus Handwerk, Technik und Köpfchen. Man arbeitet mit den Händen, aber auch mit dem Verstand. Jeder Tag bringt neue Herausforderungen mit sich – sei es ein unerwarteter Maschinenstillstand oder der Aufbau einer neuen Produktionslinie.
              </p>
            </div>
            <div class="section">
              <h4>Der Weg dorthin: Ausbildung und Wissen</h4>
              <p>
                Der Weg zum Industriemechaniker führt über eine dreieinhalbjährige duale Ausbildung, die im Betrieb und in der Berufsschule stattfindet. Dort lernt man alles, was man später braucht: Feilen, Drehen, Fräsen, Schweißen, Montieren, Programmieren und noch vieles mehr.
              </p>
              <img src="@/assets/Fraesen-1.jpg" alt="Fräsen" class="inline-image" />
            </div>
            <div class="quiz">
              <h4>Quiz: Was macht ein Industriemechaniker?</h4>
              <p>Welche dieser Aufgaben gehört nicht zu den Tätigkeiten eines Industriemechanikers?</p>
              <ul>
                <li>Maschinen warten</li>
                <li>Technische Zeichnungen lesen</li>
                <li>Software entwickeln</li>
              </ul>
            </div>
            <div class="section">
              <button class="zapp-button" @click="$router.push('/quiz-industriemechaniker')">Teste dein Wissen</button>
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
</style>

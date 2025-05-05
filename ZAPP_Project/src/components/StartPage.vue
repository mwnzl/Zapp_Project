<template>
  <div id="app">
    <NavBar />
    <div class="page">
      <main>
        <div class="button-wrapper">
          <router-link to="/quiz" class="zapp-button">Zum Quiz starten</router-link>
          <router-link to="/beruf" class="zapp-button">Beruf auswählen</router-link>
        </div>

        <div class="content-wrapper">
          <section class="text-section">
            <p>Starte deine Zukunft – Technik, die zu dir passt!</p>
            <p>Willkommen in deiner Berufsorientierungs-App!</p>
            <p>Du interessierst dich für Technik, willst wissen, wie Dinge funktionieren – oder sie am liebsten gleich selbst bauen? Dann bist du hier genau richtig.</p>
            <p>Ob IT, Maschinenbau, Elektronik oder neue Energien: In der Welt der Technik warten spannende Berufe auf dich. Hier kannst du herausfinden, was zu dir passt, deine Stärken testen und technische Berufe entdecken, die du vielleicht noch gar nicht kennst.</p>
            <p>Lerne Berufe kennen, die die Welt von morgen gestalten – und vielleicht bald auch deine Welt.</p>
            <p>Jetzt loslegen und deine berufliche Zukunft in die Hand nehmen!</p>
          </section>

          <div class="image-section">
            <div class="image-wrapper">
              <img src="@/assets/Maschine-1.jpeg" alt="Maschine" class="photo" />
              <router-link to="/maschine-1" class="hover-button">Mehr erfahren</router-link>
            </div>
          </div>

        </div>

        <div class="logo-bottom-right">
          <img src="@/assets/zapp-logo.jpeg" alt="ZAPP Logo" class="logo" />
        </div>
      </main>
    </div>
  </div>
</template>

<script setup>
import NavBar from "@/components/NavBar.vue";
</script>

<style scoped>
@import url('https://fonts.googleapis.com/css2?family=Roboto:wght@400;600&display=swap');

.page {
  font-family: 'Roboto', sans-serif;
  background-color: white;
  color: #333;
  text-align: center;
  min-height: 100vh;
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  position: relative;
  padding-top: 60px; /* Prevent NavBar overlap */
}

h2 {
  font-size: 2.5rem;
  font-weight: bold;
  margin-bottom: 20px;
}

p {
  font-size: 1.2rem;
  line-height: 1.6;
  margin-bottom: 20px;
}

.button-wrapper {
  display: flex;
  justify-content: center;
  margin-top: 20px;
}

.content-wrapper {
  display: flex;
  justify-content: space-between;
  align-items: flex-start;
  flex-grow: 1;
  padding: 20px;
  position: relative;
  gap: 20px; /* Add spacing between text and image */
}

.text-section {
  background: rgba(255, 255, 255, 0.9);
  padding: 20px;
  border-radius: 12px;
  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
  color: #333;
  width: 50%;
  text-align: left;
  margin-top: 0; /* Align text with buttons */
}

.image-section {
  width: 50%;
  display: flex;
  justify-content: center;
  align-items: flex-start;
}

.image-wrapper {
  position: relative;
  display: inline-block;
}

.photo {
  max-width: 100%;
  border-radius: 12px;
  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
  transition: opacity 0.3s ease;
}

.image-wrapper:hover .photo {
  opacity: 0.8;
}

.hover-button {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  display: none;
  padding: 10px 20px;
  background-color: #007833;
  color: white;
  text-decoration: none;
  border-radius: 8px;
  font-weight: bold;
  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
  transition: all 0.3s ease;
}

.image-wrapper:hover .hover-button {
  display: block;
}

.logo-bottom-right {
  position: absolute;
  bottom: 20px;
  right: 20px;
  background-color: rgba(255, 255, 255, 0.8);
  padding: 10px;
  border-radius: 50%;
  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
}

.logo {
  height: 50px;
  object-fit: cover;
}

.zapp-button {
  display: inline-block;
  margin: 10px;
  padding: 12px 24px;
  font-size: 16px;
  font-weight: bold;
  background-color: white;
  color: #007833;
  text-decoration: none;
  border-radius: 8px;
  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
  transition: all 0.3s ease;
}

.zapp-button:hover {
  background-color: #f0f0f0;
  transform: translateY(-2px);
  box-shadow: 0 6px 8px rgba(0, 0, 0, 0.15);
}

.zapp-button:active {
  transform: translateY(0);
  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
}
</style>

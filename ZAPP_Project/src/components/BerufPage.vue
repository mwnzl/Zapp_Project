<template>
  <div id="app">
    <NavBar />
    <div class="page">
      <main>
        <div class="content-wrapper">
          <div class="image-carousel">
            <div class="image-wrapper">
              <transition name="fade">
                <img :src="images[currentImageIndex]" :alt="imageAlts[currentImageIndex]" class="photo" key="currentImageIndex" />
              </transition>
              <router-link v-if="currentImageIndex === 0" to="/fraesen-1" class="hover-button">Mehr erfahren</router-link>
              <router-link v-if="currentImageIndex === 1" to="/labor-1" class="hover-button">Mehr erfahren</router-link>
              <router-link v-if="currentImageIndex === 2" to="/entwicklung" class="hover-button">Mehr erfahren</router-link>
              <router-link v-if="currentImageIndex === 3" to="/gabelstapler" class="hover-button">Mehr erfahren</router-link>
              <router-link v-if="currentImageIndex === 4" to="/greifarm" class="hover-button">Mehr erfahren</router-link>
            </div>
            <button class="arrow-button" @click="nextImage">&#8594;</button>
          </div>
          <div class="button-section">
            <h2>Beruf auswählen</h2>
            <p>Wähle deinen Beruf aus, um fortzufahren.</p>
            <div class="button-grid">
              <router-link to="/beruf/industriemechaniker" class="zapp-button">
                Industriemechaniker
                <span class="tooltip">Industriemechaniker: Präzision und Technik vereint – Baue und warte Maschinen, die die Welt bewegen!</span>
              </router-link>
              <router-link to="/beruf/elektroniker" class="zapp-button">
                Elektroniker
                <span class="tooltip">Elektroniker: Meister der Schaltkreise – Bring Energie und Technik zum Leben!</span>
              </router-link>
              <router-link to="/beruf/verfahrenstechnologe" class="zapp-button">
                Verfahrenstechnologe
                <span class="tooltip">Verfahrenstechnologe: Optimiere Prozesse und erschaffe Materialien für die Zukunft!</span>
              </router-link>
              <router-link to="/beruf/zerspannungsmechaniker" class="zapp-button">
                Zerspannungsmechaniker
                <span class="tooltip">Zerspannungsmechaniker: Präzise Fertigung von Bauteilen – Millimeterarbeit mit Hightech!</span>
              </router-link>
              <router-link to="/beruf/werkzeugmechaniker" class="zapp-button">
                Werkzeugmechaniker
                <span class="tooltip">Werkzeugmechaniker: Forme die Werkzeuge, die die Industrie antreiben!</span>
              </router-link>
              <router-link to="/beruf/werkstoffpruefer" class="zapp-button">
                Werkstoffprüfer
                <span class="tooltip">Werkstoffprüfer: Garant für Qualität – Teste Materialien auf Herz und Nieren!</span>
              </router-link>
            </div>
            <router-link to="/" class="zapp-button back-button">Zurück zur Startseite</router-link>
          </div>
        </div>
      </main>
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue';
import NavBar from "@/components/NavBar.vue";
import { useResizeWatcher } from "@/composables/useResizeWatcher";

const images = [
  new URL("@/assets/Fraesen-1.jpg", import.meta.url).href,
  new URL("@/assets/Labor-1.jpg", import.meta.url).href,
  new URL("@/assets/Entwicklung.jpg", import.meta.url).href,
  new URL("@/assets/Gabelstapler.JPG", import.meta.url).href,
  new URL("@/assets/Greifarm.JPG", import.meta.url).href
];

const imageAlts = [
  "Fräsen",
  "Labor",
  "Entwicklung",
  "Gabelstapler",
  "Greifarm"
];

const currentImageIndex = ref(0);

function nextImage() {
  currentImageIndex.value = (currentImageIndex.value + 1) % images.length;
}

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
  justify-content: center; 
  align-items: center; 
  padding: 20px;
}

main {
  max-width: 1200px;
  width: 100%;
  display: flex;
  flex-direction: column;
  align-items: center;
  gap: 20px; 
}

.content-wrapper {
  display: flex;
  justify-content: space-between;
  align-items: flex-start;
  gap: 40px;
  width: 100%;
}

.image-carousel {
  position: relative;
  display: flex;
  align-items: center;
  width: 50%; 
}

.arrow-button {
  background: none;
  border: none;
  font-size: 2rem;
  cursor: pointer;
  color: #007833;
  margin-left: 10px;
  transition: color 0.3s ease;
}

.arrow-button:hover {
  color: #005d27;
}

.button-section {
  display: flex;
  flex-direction: column;
  align-items: flex-start;
  flex-grow: 1;
  width: 50%; 
}

.button-grid {
  display: grid;
  grid-template-columns: repeat(2, 1fr);
  gap: 15px; 
  width: 100%;
  align-items: start; 
}

.image-wrapper {
  position: relative;
  display: inline-block;
}

.photo {
  width: 500px;
  height: 400px;
  border-radius: 12px;
  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
  transition: opacity 0.3s ease;
  object-fit: cover;
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

.zapp-button {
  display: inline-block;
  padding: 10px 20px; 
  font-size: 14px; 
  font-weight: bold;
  background-color: #007833;
  color: white;
  text-decoration: none;
  border-radius: 8px;
  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
  transition: all 0.3s ease;
  text-align: center;
  position: relative; 
}

.zapp-button:hover {
  background-color: #005d27;
  transform: translateY(-2px);
  box-shadow: 0 6px 8px rgba(0, 0, 0, 0.15);
  margin-bottom: 40px; /* Bei drüber Hovern andere Buttons nach unten drücken*/
}

.zapp-button:active {
  transform: translateY(0);
  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
}

.zapp-button:hover .tooltip {
  display: block;
}

.tooltip {
  display: none;
  position: absolute;
  bottom: -30px;
  left: 50%;
  transform: translateX(-50%);
  background-color: white; 
  color: black; 
  padding: 5px 10px;
  border-radius: 4px;
  font-size: 12px;
  white-space: nowrap; 
  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
}

.back-button {
  align-self: center;
  margin-top: 20px;
}

.fade-enter-active, .fade-leave-active {
  transition: opacity 0.5s;
}

.fade-enter-from, .fade-leave-to {
  opacity: 0;
}

/* Ab hier für Handy */

@media (max-width: 768px) {
  .beruf-page {
    padding: 10px;
  }

  .beruf-list {
    flex-direction: column;
    gap: 15px;
  }

  .beruf-item {
    font-size: 14px;
    padding: 10px;
  }
}

@media (max-width: 480px) {
  .page {
    padding: 10px;
  }

  main {
    flex-direction: column;
    gap: 15px;
  }

  .content-wrapper {
    flex-direction: column;
    gap: 20px;
    align-items: center;
  }

  .image-carousel {
    width: 100%;
  }

  .photo {
    width: 100%;
    height: auto;
  }

  .button-section {
    width: 100%;
    align-items: center;
  }

  .button-grid {
    grid-template-columns: 1fr;
    gap: 10px;
  }

  .zapp-button {
    font-size: 12px;
    padding: 8px 15px;
  }

  .tooltip {
    font-size: 10px;
    padding: 4px 8px;
  }

  .back-button {
    margin-top: 15px;
  }
}
</style>

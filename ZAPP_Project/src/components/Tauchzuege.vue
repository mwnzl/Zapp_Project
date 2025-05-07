<template>
  <div class="tauchzuege-page">
    <NavBar />
    <div class="content">
      <h1>Tauchzüge</h1>
      <p>Tauchzüge sind faszinierende Maschinen, die in der Metallverarbeitung und Beschichtung eingesetzt werden. Sie ermöglichen es, Werkstücke gleichmäßig und präzise zu behandeln, was in der Produktion von hoher Qualität unerlässlich ist. Ihre Funktionsweise zeigt die perfekte Kombination aus Ingenieurskunst und Chemie.</p>
    </div>
  </div>
</template>

<script setup>
import NavBar from "@/components/NavBar.vue";
import { ref, onMounted, onBeforeUnmount } from "vue";
import { useResizeWatcher } from "@/composables/useResizeWatcher";

// Bildschirmgröße überwachen
const screenWidth = ref(window.innerWidth);

function handleResize() {
  screenWidth.value = window.innerWidth;
  adjustLayout(screenWidth.value);
}

function adjustLayout(width) {
  const root = document.documentElement;
  const logoElement = document.querySelector(".logo-bottom-right");

  if (width < 768) {
    root.style.setProperty("--content-gap", "10px");
    root.style.setProperty("--text-width", "90%");
    root.style.setProperty("--image-width", "90%");
    if (logoElement) {
      logoElement.style.display = "none"; // Logo ausblenden
    }
  } else {
    root.style.setProperty("--content-gap", "20px");
    root.style.setProperty("--text-width", "50%");
    root.style.setProperty("--image-width", "50%");
    if (logoElement) {
      logoElement.style.display = "block"; // Logo einblenden
    }
  }
}

</script>

<style scoped>
.tauchzuege-page {
  font-family: 'Roboto', sans-serif;
  background-color: white;
  color: #333;
  min-height: 100vh;
  display: flex;
  flex-direction: column;
}

.content {
  padding: 20px;
  text-align: center;
}

h1 {
  font-size: 2.5rem;
  font-weight: bold;
  margin-bottom: 20px;
}

p {
  font-size: 1.2rem;
  line-height: 1.6;
  margin-bottom: 20px;
}
</style>
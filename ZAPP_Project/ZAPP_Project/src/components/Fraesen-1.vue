<template>
  <div class="fraesen-page">
    <NavBar />
    <div class="content">
      <h1>Fräsen</h1>
      <p>
        Fräsen ist ein spanendes Fertigungsverfahren, bei dem Material von einem Werkstück entfernt wird, um die gewünschte Form zu erzeugen. Es wird häufig in der Metall- und Kunststoffbearbeitung eingesetzt und ermöglicht die Herstellung präziser und komplexer Bauteile.
      </p>
      <p>
        Moderne Fräsmaschinen sind oft computergesteuert (CNC) und bieten eine hohe Genauigkeit und Effizienz. Sie sind ein unverzichtbarer Bestandteil der industriellen Fertigung und tragen zur Entwicklung innovativer Produkte bei.
      </p>
    </div>
  </div>
</template>

<script setup>
import NavBar from "@/components/NavBar.vue";
import { useResizeWatcher } from "@/composables/useResizeWatcher";

useResizeWatcher();
</script>

<style scoped>
.fraesen-page {
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
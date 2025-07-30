<template>
  <div class="labor-page">
    <NavBar />
    <div class="content">
      <h1>Labor</h1>
      <p>
        Ein Labor ist ein Ort, an dem wissenschaftliche Experimente, Forschungen und Analysen durchgeführt werden. Es ist mit speziellen Geräten und Instrumenten ausgestattet, die es ermöglichen, präzise Messungen und Tests durchzuführen.
      </p>
      <p>
        Labore spielen eine entscheidende Rolle in der Entwicklung neuer Technologien, Medikamente und Materialien. Sie sind ein Zentrum für Innovation und Fortschritt in vielen wissenschaftlichen und industriellen Bereichen.
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
.labor-page {
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
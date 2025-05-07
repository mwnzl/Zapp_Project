<template>
  <div class="gabelstapler-page">
    <NavBar />
    <div class="content">
      <h1>Gabelstapler</h1>
      <p>Der Gabelstapler ist ein unverzichtbares Werkzeug in der Logistik und Lagerhaltung. Mit seiner Fähigkeit, schwere Lasten zu heben und zu transportieren, sorgt er für Effizienz und Sicherheit in der Materialwirtschaft. Seine Entwicklung zeigt, wie Technik den Arbeitsalltag erleichtert und Prozesse beschleunigt.</p>
    </div>
  </div>
</template>

<script setup>
import NavBar from "@/components/NavBar.vue";
import { useResizeWatcher } from "@/composables/useResizeWatcher";

useResizeWatcher();
</script>

<style scoped>
.gabelstapler-page {
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
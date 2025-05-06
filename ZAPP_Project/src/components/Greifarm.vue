<template>
  <div class="greifarm-page">
    <NavBar />
    <div class="content">
      <h1>Greifarm</h1>
      <p>Der Greifarm ist ein Symbol für die Automatisierung und Robotik in der modernen Industrie. Mit seiner Präzision und Vielseitigkeit wird er in zahlreichen Anwendungen eingesetzt, von der Montage bis zur Logistik. Er zeigt, wie Maschinen menschliche Fähigkeiten ergänzen und repetitive Aufgaben effizienter gestalten können.</p>
    </div>
  </div>
</template>

<script setup>
import NavBar from "@/components/NavBar.vue";
</script>

<style scoped>
.greifarm-page {
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
<template>
  <div class="halle18luft-page">
    <NavBar />
    <div class="content">
      <h1>Halle 18 Luft</h1>
      <p>Halle 18 ist ein beeindruckender Ort, an dem modernste Technologien und innovative Maschinen aufeinandertreffen. Hier werden komplexe Produktionsprozesse optimiert und neue Maßstäbe in der Fertigung gesetzt. Die Halle bietet nicht nur einen Einblick in die Welt der Technik, sondern zeigt auch, wie Ingenieurskunst und Präzision zusammenwirken, um die Herausforderungen der Industrie zu meistern.</p>
    </div>
  </div>
</template>

<script setup>
import NavBar from "@/components/NavBar.vue";
</script>

<style scoped>
.halle18luft-page {
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
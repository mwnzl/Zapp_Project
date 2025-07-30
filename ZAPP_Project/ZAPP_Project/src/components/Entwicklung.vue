<template>
  <div class="entwicklung-page">
    <NavBar />
    <div class="content">
      <h1>Entwicklung</h1>
      <p>Die Entwicklung ist das Herzstück jeder Innovation. Hier entstehen neue Ideen, werden Prototypen gebaut und Technologien getestet. Dieser Bereich zeigt, wie Kreativität und technisches Know-how zusammenkommen, um die Produkte und Lösungen von morgen zu schaffen.</p>
    </div>
  </div>
</template>

<script setup>
import NavBar from "@/components/NavBar.vue";
import { useResizeWatcher } from "@/composables/useResizeWatcher";

useResizeWatcher();
</script>

<style scoped>
.entwicklung-page {
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
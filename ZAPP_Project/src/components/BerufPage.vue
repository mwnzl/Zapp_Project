<template>
  <div id="app">
    <NavBar />
    <div class="page">
      <main>
        <h2>Beruf auswählen</h2>
        <p>Wähle deinen Beruf aus, um fortzufahren.</p>
        <router-link to="/beruf/industriemechaniker" class="zapp-button">Industriemechaniker</router-link>
        <router-link to="/beruf/elektroniker" class="zapp-button">Elektroniker</router-link>
        <router-link to="/beruf/verfahrenstechnologe" class="zapp-button">Verfahrenstechnologe</router-link>
        <router-link to="/beruf/zerspannungsmechaniker" class="zapp-button">Zerspannungsmechaniker</router-link>
        <router-link to="/beruf/werkzeugmechaniker" class="zapp-button">Werkzeugmechaniker</router-link>
        <router-link to="/beruf/werkstoffprüfer" class="zapp-button">Werkstoffprüfer</router-link>
      </main>
    </div>
  </div>
</template>

<script setup>
import NavBar from "@/components/NavBar.vue";
</script>

<style scoped>
.page {
  font-family: 'Roboto', sans-serif;
  background-color: #f9f9f9;
  text-align: center;
  min-height: 100vh;
  display: flex;
  flex-direction: column;
  justify-content: center; /* Center content vertically */
  align-items: center; /* Center content horizontally */
  padding: 20px;
}

main {
  max-width: 800px;
  width: 100%;
  display: flex;
  flex-direction: column;
  align-items: center;
  gap: 20px; /* Add spacing between elements */
}

h2 {
  font-size: 2rem;
  color: #333;
  margin-bottom: 10px;
}

p {
  font-size: 1.2rem;
  color: #555;
  margin-bottom: 20px;
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
  transform: translateY(-2px); /* Slight lift effect */
  box-shadow: 0 6px 8px rgba(0, 0, 0, 0.15);
}

.zapp-button:active {
  transform: translateY(0); /* Reset lift effect */
  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
}
</style>

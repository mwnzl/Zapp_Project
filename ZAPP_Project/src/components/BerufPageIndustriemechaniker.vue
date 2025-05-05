<template>
  <div id="app">
    <NavBar />
    <div class="page">
      <main>
        <h2>Industriemechaniker</h2>
        <p>Informationen über den Beruf Industriemechaniker.</p>
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
  justify-content: space-between;
  position: relative;
  padding-top: 60px; /* Prevent NavBar overlap */
}

h2 {
  margin-top: 30px;
  color: #333;
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
  transform: translateY(-2px);
  box-shadow: 0 6px 8px rgba(0, 0, 0, 0.15);
}

.zapp-button:active {
  transform: translateY(0);
  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
}
</style>

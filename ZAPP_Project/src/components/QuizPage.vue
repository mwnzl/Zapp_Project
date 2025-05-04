<template>
  <div class="page">
    <header class="zapp-header">
      <img src="@/assets/zapp-logo.jpeg" alt="ZAPP Logo" class="logo" />
    </header>

    <main>
      <h2>Quiz starten</h2>
      <p>Hier kommen deine Fragen rein.</p>
      <!-- Beispielhafte Frage -->
      <button class="zapp-button">Antwort 1</button>
      <button class="zapp-button">Antwort 2</button>
      <!-- Button zu den Ergebnissen -->
      <router-link to="/ergebnis" class="zapp-button">Hier zu deinen Ergebnissen</router-link>
    </main>
  </div>
</template>

<style scoped>
@import url('https://fonts.googleapis.com/css2?family=Roboto:wght@400;600&display=swap');

.page {
  font-family: 'Roboto', sans-serif;
  background-color: #f9f9f9;
  text-align: center;
  min-height: 100vh;
}

.zapp-header {
  background-color: #007833;
  padding: 10px;
}

.logo {
  height: 60px;
}

h2 {
  margin-top: 30px;
  color: #333;
}

.zapp-button {
  display: block;
  margin: 15px auto;
  padding: 12px 24px;
  font-size: 16px;
  background-color: #007833;
  color: white;
  border: none;
  border-radius: 6px;
  cursor: pointer;
  transition: background-color 0.3s;
}

.zapp-button:hover {
  background-color: #005d27;
}
</style>

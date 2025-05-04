<template>
  <div class="page">
    <header class="zapp-header">
      <img src="@/assets/zapp-logo.jpeg" alt="ZAPP Logo" class="logo" />
    </header>

    <main>
      <h1>Willkommen bei ZAPP</h1>
      <router-link to="/quiz" class="zapp-button">Zum Quiz starten</router-link>
      <router-link to="/beruf" class="zapp-button">Beruf auswählen</router-link>
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
  object-fit: cover; /* Füllt die weißen Bereiche des Logos */
}

h1 {
  margin-top: 40px;
  font-size: 2rem;
  color: #333;
}

.zapp-button {
  display: inline-block;
  margin: 20px;
  padding: 12px 24px;
  font-size: 18px;
  background-color: #007833;
  color: white;
  text-decoration: none;
  border-radius: 8px;
  transition: background-color 0.3s ease;
}

.zapp-button:hover {
  background-color: #005d27;
}
</style>

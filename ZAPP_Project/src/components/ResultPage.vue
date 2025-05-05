<template>
  <div class="page">
    <header class="zapp-header">
      <img src="@/assets/zapp-logo.jpeg" alt="ZAPP Logo" class="logo" />
    </header>

    <main>
      <h2>Dein Ergebnis</h2>
      <p>Du hast X von Y Punkten erreicht.</p>
      <router-link to="/" class="zapp-button">Zurück zur Startseite</router-link>
    </main>
  </div>
</template>

<style scoped>
@import url('https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap');

.page {
  font-family: 'Poppins', sans-serif;
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
  display: inline-block;
  margin-top: 30px;
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

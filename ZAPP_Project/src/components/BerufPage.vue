<template>
    <div class="page">
      <header class="zapp-header">
        <img src="@/assets/zapp-logo.jpeg" alt="ZAPP Logo" class="logo" />
      </header>
  
      <main>
        <h2>Beruf auswählen</h2>
        <p>Wähle deinen Beruf aus, um fortzufahren.</p>
        <!-- Verlinkung zur Industriemechaniker-Seite -->
        <router-link to="/beruf/industriemechaniker" class="zapp-button">Industriemechaniker</router-link>
        <router-link to="/beruf/elektroniker" class="zapp-button">Elektroniker</router-link>
        <router-link to="/beruf/verfahrenstechnologe" class="zapp-button">Verfahrenstechnologe</router-link>
        <router-link to="/beruf/zerspannungsmechaniker" class="zapp-button">Zerspannungsmechaniker</router-link>
        <router-link to="/beruf/werkzeugsmechaniker" class="zapp-button">Werkzeugsmechaniker</router-link>
        <router-link to="/beruf/werkstoffprüfer" class="zapp-button">Werkstoffprüfer</router-link>
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
  
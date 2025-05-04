<template>
    <div class="page">
      <header class="zapp-header">
        <img src="@/assets/zapp-logo.jpeg" alt="ZAPP Logo" class="logo" />
      </header>
  
      <main>
        <h2>Industriemechaniker</h2>
        <p>Der Industriemechaniker ist ein Facharbeiter, der Maschinen und Produktionsanlagen installiert, wartet und repariert. Zu seinen Aufgaben gehören das Einstellen und Überwachen von Maschinen, das Beheben von Störungen und das Optimieren von Produktionsprozessen. Industriemechaniker arbeiten in verschiedenen Industriezweigen und sind für die Effizienz und Sicherheit der Produktionsanlagen verantwortlich.</p>
        
        <router-link to="/beruf" class="zapp-button">Zurück zur Berufsauswahl</router-link>
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
  
  p {
    font-size: 1.1rem;
    color: #555;
    max-width: 800px;
    margin: 20px auto;
  }
  
  .zapp-button {
    display: inline-block;
    margin-top: 30px;
    padding: 12px 24px;
    font-size: 16px;
    background-color: #007833;
    color: white;
    text-decoration: none;
    border-radius: 6px;
    transition: background-color 0.3s;
  }
  
  .zapp-button:hover {
    background-color: #005d27;
  }
  </style>
  
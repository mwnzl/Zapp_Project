<template>
    <header class="navbar-wrapper">
      <div class="navbar">
        <!-- Logo links -->
        <div class="logo">
          <router-link to="/">ZAPP</router-link>
        </div>
  
        <!-- Zentrale Navigation -->
        <nav class="menu">
          <a href="#">PRODUKTFORMEN</a>
          <a href="#">WERKSTOFFE</a>
          <a href="#">BRANCHEN</a>
          <a href="#">KARRIERE</a>
          <a href="#">VIRTUAL ZAPP</a>
          <a href="#">UNTERNEHMEN</a>
          <a href="#">KONTAKT</a>
        </nav>
  
        <!-- Icons rechts -->
        <div class="right-icons">
          <i class="fas fa-lock"></i>
          <i class="fas fa-calculator"></i>
          <a href="https://www.instagram.com/zappzubi" target="_blank" rel="noopener noreferrer">
            <i class="fab fa-instagram"></i>
          </a>
          <i class="fab fa-linkedin-in"></i>
          <span class="lang-select">DE ▾</span>
        </div>
      </div>
    </header>
  </template>
  
  <style scoped>
  .navbar-wrapper {
    position: fixed; /*Stellt sicher, dass die Navbar immer oben bleibt*/
    top: 0;
    left: 0;
    width: 100%;
    background-color: #7ed321;
    padding: 10px 20px;
    color: white;
    font-family: 'Roboto', sans-serif;
    z-index: 1000; /* Stellt sicher, dass NavBar über alle anderen Inhale liegt */
  }
  
  .navbar {
    display: flex;
    justify-content: space-between;
    align-items: center;
  }
  
  .logo span {
    font-weight: bold;
    font-size: 24px;
    color: #6d6e71;
    font-family: Arial, sans-serif;
  }
  
  .menu {
    display: flex;
    gap: 20px;
  }
  
  .menu a {
    color: white;
    text-decoration: none;
    font-weight: 500;
    font-size: 14px;
  }
  
  .menu a:hover {
    text-decoration: underline;
  }
  
  .right-icons {
    display: flex;
    align-items: center;
    gap: 12px;
    font-size: 16px;
  }
  
  .lang-select {
    cursor: pointer;
    font-weight: 500;
  }

  @media (max-width: 768px) {
    .navbar {
      flex-direction: row;
      justify-content: space-between;
      padding: 5px 10px;
    }
  
    .menu {
      display: flex;
      flex-wrap: wrap;
      justify-content: center;
      gap: 5px;
    }
  
    .menu a {
      font-size: 12px;
      padding: 3px 5px;
    }
  
    .right-icons {
      display: flex;
      justify-content: flex-end;
      gap: 5px;
    }
  }
  </style>

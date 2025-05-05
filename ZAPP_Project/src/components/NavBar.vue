<template>
    <header class="navbar-wrapper">
      <div class="navbar">
        <!-- Logo links -->
        <div class="logo">
          <span>ZAPP</span>
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
          <i class="fab fa-instagram"></i>
          <i class="fab fa-linkedin-in"></i>
          <span class="lang-select">DE ▾</span>
        </div>
      </div>
    </header>
  </template>
  
  <style scoped>
  .navbar-wrapper {
    position: fixed; /* Ensure the NavBar stays fixed at the top */
    top: 0;
    left: 0;
    width: 100%;
    background-color: #7ed321;
    padding: 10px 20px;
    color: white;
    font-family: 'Roboto', sans-serif;
    z-index: 1000; /* Ensure it stays above other elements */
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
  </style>

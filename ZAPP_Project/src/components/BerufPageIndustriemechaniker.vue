<template>
  <div id="app">
    <NavBar />
    <div class="page">
      <main>
        <div class="content">
          <div class="text">
            <h2>Industriemechaniker</h2>
            <p>
              Industriemechaniker sind Fachkräfte, die in der Herstellung, Instandhaltung und Überwachung von technischen Systemen tätig sind. Sie arbeiten in der Regel in der Industrie und sind für die Montage, Wartung und Reparatur von Maschinen und Anlagen verantwortlich. Zu ihren Aufgaben gehört es, technische Zeichnungen zu lesen, Bauteile zu fertigen und Maschinen zu programmieren. Industriemechaniker tragen wesentlich dazu bei, dass Produktionsprozesse reibungslos ablaufen und die Qualität der Produkte gewährleistet ist.
            </p>
          </div>
          <div class="image">
            <img src="@/assets/Maschine-1.jpeg" alt="Maschine" />
          </div>
        </div>
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

.content {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: flex-start;
  padding: 20px;
}

.text {
  flex: 1;
  margin-right: 20px;
  text-align: left;
}

.image {
  flex: 1;
  display: flex;
  justify-content: center;
  align-items: center;
}

.image img {
  max-width: 100%;
  height: auto;
  border-radius: 8px;
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

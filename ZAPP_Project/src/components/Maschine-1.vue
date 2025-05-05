<template>
  <div class="maschine-1-page">
    <NavBar />
    <div class="content">
      <h1>Maschinen</h1>
      <p>
        Maschinen sind technische Geräte, die entwickelt wurden, um mechanische Arbeit zu verrichten. Sie bestehen aus verschiedenen Komponenten wie Zahnrädern, Motoren und Steuerungssystemen, die zusammenarbeiten, um spezifische Aufgaben effizient auszuführen. Maschinen spielen eine zentrale Rolle in der modernen Industrie und sind in nahezu allen Bereichen des Lebens zu finden, von der Fertigung über die Landwirtschaft bis hin zur Medizin.
      </p>
      <p>
        Mit der Weiterentwicklung der Technologie werden Maschinen immer intelligenter und leistungsfähiger. Automatisierung und Robotik sind Beispiele für moderne Maschinen, die komplexe Prozesse steuern und die Produktivität erheblich steigern können. Sie sind ein wesentlicher Bestandteil der Industrie 4.0 und tragen dazu bei, die Welt von morgen zu gestalten.
      </p>
    </div>
  </div>
</template>

<script setup>
import NavBar from "@/components/NavBar.vue";
</script>

<style scoped>
.maschine-1-page {
  font-family: 'Roboto', sans-serif;
  background-color: white;
  color: #333;
  min-height: 100vh;
  display: flex;
  flex-direction: column;
}

.content {
  padding: 20px;
  text-align: center;
}

h1 {
  font-size: 2.5rem;
  font-weight: bold;
  margin-bottom: 20px;
}

p {
  font-size: 1.2rem;
  line-height: 1.6;
  margin-bottom: 20px;
}
</style>
<template>
  <div class="beruf-page">
    <header class="zapp-header">
      <img src="@/assets/zapp-logo.jpeg" alt="ZAPP Logo" class="logo" />
    </header>

    <main>
      <h2>Werkstoffprüfer</h2>
      <p>Informationen über den Beruf Werkstoffprüfer.</p>
    </main>
  </div>
</template>

<script>
export default {
  name: "BerufPageWerkstoffprüfer",
};
</script>

<style scoped>
.beruf-page {
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
</style>
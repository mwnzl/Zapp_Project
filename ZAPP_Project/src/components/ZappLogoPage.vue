<template>
  <div class="logo-page">
    <div class="logo-bottom-right">
      <img src="@/assets/zapp-logo.jpeg" alt="ZAPP Logo" class="logo" />
    </div>
  </div>
</template>

<script setup>
// No additional logic required for this static page
</script>

<style scoped>
.logo-page {
  position: relative;
  width: 100%;
  height: 100vh;
  background-color: #f9f9f9;
}

.logo-bottom-right {
  position: absolute;
  bottom: 20px; /* Adjusted to bring the logo higher */
  right: 20px;
  background-color: white;
  padding: 5px;
  border-radius: 50%;
  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
}

.logo {
  height: 40px;
  object-fit: cover;
}
</style>
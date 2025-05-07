<template>
  <div class="logo-page">
    <div class="logo-bottom-right">
      <img src="@/assets/zapp-logo.jpeg" alt="ZAPP Logo" class="logo" />
    </div>
  </div>
</template>

<script setup>
import { ref, onMounted, onBeforeUnmount } from "vue";
import { useResizeWatcher } from "@/composables/useResizeWatcher";

const screenWidth = ref(window.innerWidth);

function handleResize() {
  screenWidth.value = window.innerWidth;
  adjustLayout(screenWidth.value);
}

function adjustLayout(width) {
  const root = document.documentElement;
  const logoElement = document.querySelector(".logo-bottom-right");

  if (width < 768) {
    root.style.setProperty("--content-gap", "10px");
    root.style.setProperty("--text-width", "90%");
    root.style.setProperty("--image-width", "90%");
    if (logoElement) {
      logoElement.style.display = "none"; 
    }
  } else {
    root.style.setProperty("--content-gap", "20px");
    root.style.setProperty("--text-width", "50%");
    root.style.setProperty("--image-width", "50%");
    if (logoElement) {
      logoElement.style.display = "block";
    }
  }
}

onMounted(() => {
  window.addEventListener("resize", handleResize);
  adjustLayout(screenWidth.value); 
});

onBeforeUnmount(() => {
  window.removeEventListener("resize", handleResize);
});

useResizeWatcher();
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
  bottom: 20px;
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
import { ref, onMounted, onBeforeUnmount } from "vue";

export function useResizeWatcher() {
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
        logoElement.style.display = "none"; // Logo ausblenden
      }
    } else {
      root.style.setProperty("--content-gap", "20px");
      root.style.setProperty("--text-width", "50%");
      root.style.setProperty("--image-width", "50%");
      if (logoElement) {
        logoElement.style.display = "block"; // Logo einblenden
      }
    }
  }

  onMounted(() => {
    window.addEventListener("resize", handleResize);
    adjustLayout(screenWidth.value); // Initiales Layout anpassen
  });

  onBeforeUnmount(() => {
    window.removeEventListener("resize", handleResize);
  });

  return { screenWidth };
}
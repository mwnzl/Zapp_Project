import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'
import path from 'path'

export default defineConfig({
  server: {
    /*proxy: {
      '/api/questions': 'http://localhost:8080/api/questions',
      //'/questions': 'http://springboot-app:8080/api',
      //'/api/results': 'http://localhost:8080/api/results'
      //'/results': 'http://springboot-app:8080/api'
    }
     */
    proxy: {
      '/api': {
        target: 'http://localhost:8080', // dein Backend
        changeOrigin: true,
        //rewrite: path => path.replace(/^\/api/, '')
      }
    }
  },
  plugins: [vue()],
  resolve: {
    alias: {
      '@': path.resolve(__dirname, './src')
    }
  }
})

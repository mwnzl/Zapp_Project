import { createRouter, createWebHistory } from 'vue-router'
import StartPage from '@/components/StartPage.vue'
import QuizPage2 from '@/components/QuizPage2.vue'
import ResultPage from '@/components/ResultPage.vue'
import BerufPage from '@/components/BerufPage.vue' // Berufsauswahl-Seite
import BerufPageIndustriemechaniker from '@/components/BerufPageIndustriemechaniker.vue' // Industriemechaniker-Seite

const routes = [
  { path: '/', component: StartPage },
  { path: '/quiz', component: QuizPage2 },
  { path: '/ergebnis', component: ResultPage },
  { path: '/beruf', component: BerufPage }, // Berufsauswahl
  { path: '/beruf/industriemechaniker', component: BerufPageIndustriemechaniker }, // Industriemechaniker
  { path: '/beruf/elektoniker', component: BerufPageIndustriemechaniker }, // elektoniker
  { path: '/beruf/verfahrenstechnologe', component: BerufPageIndustriemechaniker }, // verfahrenstechnologe
  { path: '/beruf/zerspannungsmechaniker', component: BerufPageIndustriemechaniker }, // zerspannungsmechaniker
  { path: '/beruf/werkzeugmechaniker', component: BerufPageIndustriemechaniker }, // werkzeugmechaniker
  { path: '/beruf/werkstoffprüfer', component: BerufPageIndustriemechaniker } // werkstoffprüfer
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router

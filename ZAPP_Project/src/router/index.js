import { createRouter, createWebHistory } from 'vue-router';
import StartPage from '@/components/StartPage.vue';
import QuizPage2 from '@/components/QuizPage2.vue';
import BerufPage from '@/components/BerufPage.vue';
import ResultPage from '../components/ResultPage.vue';
import BerufPageIndustriemechaniker from '@/components/BerufPageIndustriemechaniker.vue';
import BerufPageElektroniker from '@/components/BerufPageElektroniker.vue';
import BerufPageVerfahrenstechnologe from '@/components/BerufPageVerfahrenstechnologe.vue';
import BerufPageZerspannungsmechaniker from '@/components/BerufPageZerspannungsmechaniker.vue';
import BerufPageWerkzeugmechaniker from '@/components/BerufPageWerkzeugmechaniker.vue';
import BerufPageWerkstoffprüfer from '@/components/BerufPageWerkstoffprüfer.vue';
import Maschine1 from '@/components/Maschine-1.vue';
import Fraesen1 from '@/components/Fraesen-1.vue';
import Labor1 from '@/components/Labor-1.vue';

const routes = [
  { path: '/', component: StartPage },
  { path: '/result', component: ResultPage },
  { path: '/quiz', component: QuizPage2 },
  { path: '/beruf', component: BerufPage },
  { path: '/beruf/industriemechaniker', component: BerufPageIndustriemechaniker },
  { path: '/beruf/elektroniker', component: BerufPageElektroniker },
  { path: '/beruf/verfahrenstechnologe', component: BerufPageVerfahrenstechnologe },
  { path: '/beruf/zerspannungsmechaniker', component: BerufPageZerspannungsmechaniker },
  { path: '/beruf/werkzeugmechaniker', component: BerufPageWerkzeugmechaniker },
  { path: '/beruf/werkstoffprüfer', component: BerufPageWerkstoffprüfer },
  { path: '/maschine-1', component: Maschine1 },
  { path: '/fraesen-1', component: Fraesen1 },
  { path: '/labor-1', component: Labor1 },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;

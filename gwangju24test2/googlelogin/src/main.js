import { createApp } from 'vue';
import vue3GoogleLogin from "vue3-google-login";

import 'bootstrap/dist/css/bootstrap.css';
import 'bootstrap-vue/dist/bootstrap-vue.css';

import { createRouter, createWebHistory } from 'vue-router';
import App from './App.vue';
import subPage from './components/subPage.vue';
import googTest from './components/googTest.vue';

const router = createRouter({
  history: createWebHistory(),
  routes: [
   
    {path: "/", component: googTest},
    { path: "/about", component: subPage }
  ]
});

const CLIENT_ID = "716095266829-e3i446sgc46d6nva6qkpdjipqpbpai0q.apps.googleusercontent.com";

createApp(App)
  .use(vue3GoogleLogin, {
    clientId: CLIENT_ID,
  })
  .use(router)
  .mount('#app');

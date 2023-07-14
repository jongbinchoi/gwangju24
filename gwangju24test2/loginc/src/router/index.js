// loginc 폴더의 src/router/index.js 파일

import Vue from 'vue';
import Router from 'vue-router';
import Page1 from '@/pages/Page1.vue';
import Page2 from '@/pages/Page2.vue';
import App from '@/loginc/src/App.vue';

Vue.use(Router);

export default new Router({
  routes: [
    {
      path: '/page1',
      name: 'Page1',
      component: Page1
    },
    {
      path: '/page2',
      name: 'Page2',
      component: Page2
    }
  ],
  mode: 'history',
  base: '/loginc/',
  fallback: true,
  component: App
});

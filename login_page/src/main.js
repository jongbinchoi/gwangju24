/* eslint-disable */
import { createApp } from 'vue';
import { createRouter, createWebHistory } from 'vue-router';
import App from './App.vue';
import vue3GoogleLogin from "vue3-google-login";
// import axios from 'axios'; //
import Myboard from './components/board/MyBoard.vue';
import MainPage from './components/MainPage.vue';
import EditProfile from './components/EditProfile';
import OldBoard from './components/board/OldBoard';
import BasicBoard from './components/board/BasicBoard';
import PregBoard from './components/board/PregBoard';
import LoginPage from './components/LoginPage.vue';
import SignupPage from './components/SignupPage.vue';
import 'bootstrap'
import 'bootstrap/dist/css/bootstrap.min.css'

const CLIENT_ID = "716095266829-e3i446sgc46d6nva6qkpdjipqpbpai0q.apps.googleusercontent.com"

// 각 컴포넌트로 통하는 라우터
const router = createRouter({
    history: createWebHistory(),
    routes: [
        {
            path: '/article/scrap',
            component: Myboard,
            meta: {authRequired: true},
        },
        {
            path: '/',
            component: MainPage
        }, 
        {
            path: '/login',
            component: LoginPage
        },
        {
            path: '/edit',
            component: EditProfile,
        }, 
        {
            path: '/sign',
            component: SignupPage
        },
        {
            path: '/article/oldmans-disables',
            component: OldBoard
        },
        {
            path: '/article/basic-recipients',
            component: BasicBoard
        },
        {
            path: '/article/pregnants',
            component: PregBoard
        },
       
       
    ]
})

router.beforeEach(function (to, from, next) {
    if (to.matched.some(function(routeInfo) {
      return routeInfo.meta.authRequired;
    })) {
      // 이동할 페이지에 인증 정보가 필요하면 경고 창을 띄우고 페이지 전환은 하지 않음
      alert('로그인이 필요한 페이지입니다.');
      router.push('/login')
    } else {
      console.log("routing success : '" + to.path + "'");
      next(); // 페이지 전환
    }
  });


createApp(App)
.use(vue3GoogleLogin,{
  clientId: CLIENT_ID,
})
.use(router)
.mount('#app');


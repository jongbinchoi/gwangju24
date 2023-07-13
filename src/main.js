import { createApp } from 'vue';
import { createRouter, createWebHistory } from 'vue-router';
import App from './App.vue';
import Myboard from './components/MyBoard.vue';
import MainPage from './components/MainPage.vue';
import EditProfile from './components/EditProfile';
import 'bootstrap'
import 'bootstrap/dist/css/bootstrap.min.css'

const router = createRouter({
    history: createWebHistory(),
    routes: [
        {
            path: '/board',
            component: Myboard
        },
        {
            path: '/',
            component: MainPage
        },
        {
            path: '/edit',
            component: EditProfile
        },
    ]
})

const app = createApp(App);

app.use(router);
app.mount('#app');



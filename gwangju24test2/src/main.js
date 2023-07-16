import { createApp } from 'vue'
import App from './App.vue'
import { createRouter, createWebHistory } from 'vue-router';
import Myboard from './components/MyBoard.vue';
import MainPage from './components/MainPage.vue';
import EditProfile from './components/EditProfile';
import OldBoard from './components/OldBoard';

import 'bootstrap/dist/css/bootstrap.css';
import 'bootstrap-vue/dist/bootstrap-vue.css';


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
        {
            path: '/oldboard',
            component: OldBoard
        },
    ]
})

const app = createApp(App);
const app = createApp(App){
    methods: {
        confirmInput() {
            this.$router.push('');
        }
    },
};

app.use(router);
app.mount('#app');

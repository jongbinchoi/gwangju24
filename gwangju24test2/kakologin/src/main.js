import { createApp } from 'vue'
import App from './App.vue'
import vue3GoogleLogin from "vue3-google-login";

const CLIENT_ID = "716095266829-e3i446sgc46d6nva6qkpdjipqpbpai0q.apps.googleusercontent.com"

import 'bootstrap/dist/css/bootstrap.css'
//import 'bootstrap-vue-3/dist/bootstrap-vue-3.css'

createApp(App)
.use(vue3GoogleLogin,{
    clientId: CLIENT_ID,
  })
.mount('#app')

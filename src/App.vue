<template>
  <div>
    <div v-if="loggedIn">
      <button @click="logout">Logout</button>
      <h2>The name is: {{ user.name }}</h2>
      <h2>The email is: {{ user.email }}</h2>
      <img :src="user.picture" alt="User Picture" />
    </div>

    <div v-else>
      <GoogleLogin :callback="callback" :prompt="'consent'" :auto-login="true" />
    </div>
  </div>
</template>

<script>
import { decodeCredential, googleLogout } from 'vue3-google-login';

export default {
  data() {
    return {
      loggedIn: false,
      user: null
    };
  },
  methods: {
    callback(response) {
      console.log('logged in');
      this.loggedIn = true;
      console.log(response);
      this.user = decodeCredential(response.credential);
    },
    logout() {
      googleLogout();
      this.loggedIn = false;
    }
  }
};
</script>

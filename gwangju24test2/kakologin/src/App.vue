<template>
  <div>
    <div v-if="loggedIn">
      <button @click="logout">로그아웃</button>
      <h2>이름: {{ user.name }}</h2>
    </div>

    <div v-else>
      <p>로그인이 필요합니다.</p>
      <router-link to="/login">로그인 페이지로 이동</router-link>
    </div>
  </div>
</template>

<script>
export default {
  computed: {
    loggedIn() {
      return this.$store.state.loggedIn; // Vuex 스토어에서 로그인 상태 가져오기
    },
    user() {
      return this.$store.state.user; // Vuex 스토어에서 사용자 정보 가져오기
    }
  },
  methods: {
    logout() {
      this.$store.commit('logout');
      this.$router.push('/login'); // 로그아웃 후 로그인 페이지로 이동
    }
  }
};
</script>
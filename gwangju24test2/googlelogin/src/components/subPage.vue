<template>
  <div>
    <div v-if="user && user.name">
      <p>{{ user.name }} 정보가 표시됩니다.</p>
      <button class="btn btn-primary" @click="logout">로그아웃</button>
    </div>
    <div v-else>
      <p>사용자 정보를 불러오는 중입니다...</p>
    </div>
  </div>
</template>

<script>
export default {
  created() {
    // 로그인 상태에 따라 사용자 정보를 가져올 수 있도록 작성해주세요.
    // 예를 들어, 로그인 시에 사용자 정보를 로컬 스토리지에 저장하고 여기서 해당 정보를 가져올 수 있습니다.
    this.user = JSON.parse(localStorage.getItem('user'));
  },
  data() {
    return {
      user: null
    };
  },
  methods: {
    logout() {
      // 로그아웃 처리 로직을 여기에 작성해주세요.
      // 로그아웃 후에는 loggedIn 데이터를 false로 설정하고 '/' 페이지로 이동합니다.
      this.$router.push('/');
    }
  }
};
</script>

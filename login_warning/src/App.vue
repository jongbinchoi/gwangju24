<template>
  <div>
    <button class="login-error-button" @click="showLoginWarning">Not_logged</button>
    <div class="alert-container" v-if="showLoginAlert">
      <span class="swal-title-custom">로그인이 필요한 서비스입니다.</span>
    </div>
  </div>
</template>

<script>
import Swal from 'sweetalert2';

export default {
  name: 'App',
  data() {
    return {
      showLoginAlert: false
    };
  },
  methods: {
    showLoginWarning() {
      Swal.fire({
        icon: 'warning',
        text: '로그인이 필요한 서비스입니다.',
        confirmButtonText: '확인',
        showCloseButton: true,
        showLoaderOnConfirm: true
      }).then((result) => {
        if (result.value) {
          // 확인 버튼을 클릭한 후의 로직을 추가
        }
      });
    }
  }
};
</script>

<style>
.alert-container {
  display: none;
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background-color: rgba(0, 0, 0, 0.5);
  z-index: 9999;
}

.alert-box {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  width: 300px;
  padding: 20px;
  background-color: #fff;
  border-radius: 4px;
  text-align: center;
}

.alert-message {
  margin-bottom: 20px;
}

.alert-button {
  padding: 10px 20px;
  background-color: #007bff;
  border: none;
  color: #fff;
  border-radius: 4px;
  cursor: pointer;
}
</style>
<template>
  <div>
    <div class="location">
      <div class="container-sm text-center" style="width: 30%">
        <h2>로그인</h2>
        <div class="form-floating mb-3 color">
          <input type="email" class="form-control id" id="floatingInput" placeholder="name@example.com">
          <label for="floatingInput">ID</label>
        </div>
        <div class="form-floating mb-3 color">
          <input type="password" class="form-control" id="floatingPassword" placeholder="Password">
          <label for="floatingPassword">Password</label>
        </div>
        <div class="mb-3">
          <button type="button" class="btn btn-primary">로그인</button>
        </div>
        <div class="d-grid gap-2 mar">
          <GoogleLogin :callback="callback" :prompt="'consent'" :auto-login="true">
            <template v-slot>
              <button class="btn btn-outline-secondary text-black" type="button" style="width: 100%" @click="goToLogin">
                <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Google_%22G%22_Logo.svg/800px-Google_%22G%22_Logo.svg.png" style="width: 14px; margin-bottom: 0.5%;" />
                Google 계정으로 가입하기
              </button>
            </template>
          </GoogleLogin>
          <button class="btn btn-outline-secondary" type="button" style="width: 100%"><i class="far fa-light fa-envelope evloctaion"></i> 이메일 계정으로 가입하기</button>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import { decodeCredential } from 'vue3-google-login';

export default {
  data() {
    return {
      loggedIn: false,
      user: null
    };
  },
  methods: {
    // 로그인 버튼 클릭 이벤트 처리
    login() {
      // 로그인 성공 처리
      const response = {
        // ... 로그인 응답 데이터
      };
      this.callback(response);
    },
    callback(response) {
      console.log('로그인됨');
      this.loggedIn = true;
      console.log(response);
      this.user = decodeCredential(response.credential);

      // 사용자 정보를 로컬 스토리지에 저장 (선택 사항)
      localStorage.setItem('user', JSON.stringify(this.user));

      // "/about" 페이지로 리디렉션
      this.$router.push({
        path: '/about',
        meta: { user: this.user } // 사용자 정보를 meta 필드에 첨부
      });
    }
  }
};

 </script>
 
 <style>
 *{ /* *전체 스타일에 적용하겠다. */
   margin: 0;
   padding: 0;
   box-sizing: border-box;
   }
   
   header{
     width: 100%;
     height: 100px;
     z-index: 100; /*쌓임 순서*/
     background-color: #fff; 
     box-shadow: 0 5px 2px rgba(0, 0, 0, 0.05), 0 1px 0 rgba(0, 0, 0, 0.05);
   }
   
   li{
     list-style: none;/*정렬 되지 않은 태그라서 앞에 점이 붙어서 없애주겠다.*/
   }
   
   a{
     text-decoration: none;/*a태그가 텍스트일 때 항상 밑줄이 붙어서 없애줘야함.*/
   }
   
   nav{
     float: right;
   }
   
   .logo{
     display:inline-block;/*inline-block 크기설정가능해짐*/
     height: 100px;
     margin: 12px 0 12px 50px;
   }
   
   .logo > img { height: 80px; }
   
   .nav-items > li {
     display: inline-block;
   }
   
   .nav-items > li > a {
     line-height: 100px;
     padding-right: 50px;
     color: rgba(0, 0, 0, 0.4);
     font-size:25px;
   }
   
   .nav-items > li > a:hover {/*a:ho*/
     color: rgba(0, 0, 0, 0.8);
   }
   
 .login{
   font-size: 50px;
   font-weight: bold;
   padding-top: 100px;
 
   position: relative;
   left: 750px;
 }
 
 .input-text{
   padding: 10px;
   font-size: 15px;
   background-color: #9EBDF8;
   border: 1.5px solid black;
   border-radius: 4px;
 }
 
 .location{
   position: relative;
   top: 150px;
   margin-top: 30px;
 }
 
 .color>input{
   background-color: rgba(158, 189, 248, 0.3);
   
 }
 
 .btn-primary{
   width: 100%;
   
 }
 
 .id{
   margin-top: 30px ;
 }
 .mar{
   margin-top:70px;
 }
 .hello{
   background-color: black;
   width: 100px;
   height: 100px;
 }
 </style>
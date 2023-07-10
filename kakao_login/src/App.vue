/* eslint-disable */
<template>
  <div id ="wrap">
    <header>
      <div>
    <button @click="kakaoLogin">카카오 로그인</button>
    <button @click="kakaoLogout">카카오 로그아웃.</button>
    </div>
      <a class="logo" href="App.vue">
        <img src="./assets/logo.png" height="100px">
      </a>
      <nav>
        <ul class="nav-items">
          <li><a href="#"><i class="fa-regular fa-user"></i></a></li>
        </ul>
      </nav>
    </header>

  </div>

  <body>
    <div class="location">
  <div class="container-sm text-center" style="width:30%">
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
  <button class="btn btn-outline-secondary" type="button "><i class="far fa-light fa-envelope evloctaion"></i> Google 계정으로 가입하기</button>
  <button class="btn btn-outline-secondary" type="button "><i class="far fa-light fa-envelope evloctaion"></i> Facebook 계정으로 가입하기</button>
  <button class="btn btn-outline-secondary" type="button "><i class="far fa-light fa-envelope evloctaion"></i> 이메일 계정으로 가입하기</button>

</div>
      </div>  
      
  </div>
</body>
</template>

<script>
/* eslint-disable */
export default {
  methods: {
    kakaoLogin() {
      window.Kakao.Auth.login({
        success: (response) => {
          // eslint-disable-next-line no-unused-vars
          window.Kakao.API.request({
            url: '/v2/user/me',
            success: (response) => {
              console.log(response)
            },
            fail: (error) => {
              console.log(error)
            },
          })
        },
        fail: (error) => {
          console.log(error)
        },
      })
    },
    kakaoLogout() {
      if (window.Kakao.Auth.getAccessToken()) {
        window.Kakao.API.request({
          url: '/v1/user/unlink',
          success: (response) => {
            console.log(response)
          },
          fail: (error) => {
            console.log(error)
          },
        })
        window.Kakao.Auth.setAccessToken(undefined)
      }
    }
  },
  mounted() {
    const script = document.createElement('script')
    script.src = "https://developers.kakao.com/sdk/js/kakao.js"
    script.onload = () => {
      window.Kakao.init('a1b47dbf380fda9fcea0c90dd438046a') // JavaScript Key
      console.log(window.Kakao.isInitialized())
    }
    document.head.appendChild(script)
  }
}
</script>

<style>
/* eslint-disable */
*{ /* *전체 스타일에 적용하겠다. */
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  }
  
  header{
    width: 100%;
    height: 100px;
    z-index: 2000; /*쌓임 순서*/
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
</style>
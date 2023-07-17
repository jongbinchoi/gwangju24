<template>

  <body>
    <div class="c">
    <div style="margin-top:50px">
      <div class="stepbar">
        <div class="step1">1. 실명확인</div>
        <div class="step2"></div>
        <div class="step2text">2. 실명확인</div>
      </div>
    </div>

    <div class="linetest"></div>
  </div>
    <div id="form-main" class="container-sm px-5 text-center">
      <form v-on:submit.prevent="submitForm" class="card1 mx-auto" style="background-color: rgba(218, 255, 251 ,0.2); width:70%;">
        <div class="row mb-3">
          <div class="col-sm-2"></div>
          <label for="emailInput" class=" col-form-label col-sm-2">이메일</label>
          <div class="col-sm-5">
            <input type="email" class="form-control" id="emailInput" placeholder="예) example@naver.com" v-model="email">
          </div>
          <div class="col-auto">
            <button @click="submitForm" type="submit" class="btn btn-primary mb-3">전송</button>
            
          </div>
        </div>
        </form>

        <form v-on:submit.prevent="submitForm" class="card2 mx-auto" style="background-color: rgba(218, 255, 251 ,0.2); width:70%;">
        <div class="row mb-3">
          <div class="col-sm-2"></div>
          <label for="verifyInput" class="col-form-label col-sm-2">인증번호</label>
          <div class="col-sm-5">
            <input type="text" class="form-control" id="verifyInput" v-model="verificationCode">
            </div>
            <div class="col-auto">
              <button v-if=!isVerified @click="emailnum" type="submit" class="btn btn-primary mb-3">확인</button>
              <button v-if=isVerified @click="emailnum" type="submit" class="btn btn-primary mb-3 disabled">확인됨</button>
              </div>
          </div>
       
      </form>

      <form v-on:submit.prevent="submitForm" class="card3 mx-auto" style="background-color: rgba(218, 255, 251 ,0.2); width:70%;">
        <div class="row mb-3 pb-3">
          <div class="col-sm-2"></div>
          <label for="nameInput" class="col-form-label col-sm-2">이름</label>
          <div class="col-sm-5">
            <input type="text" class="form-control" id="nameInput" placeholder="예) 홍길동" v-model="name">
          </div>
        </div>

        <div class="row mb-3 pb-3">
          <div class="col-sm-2"></div>
          <label for="pwInput" class="col-form-label col-sm-2">비밀번호</label>
          <div class="col-sm-5">
            <input type="password" class="form-control" id="pwInput" v-model="password">
          </div>
        </div>

        <div class="row mb-3 pb-3">
          <div class="col-sm-2"></div>
          <label for="pwInput" class="col-form-label col-sm-2">비밀번호 확인</label>
          <div class="col-sm-5">
            <input type="password" class="form-control" id="pwInput" v-model="confirmPassword">
          </div>
        </div>

        <div class="col-auto p-2">
          <button @click="signUp" type="submit" class="btn btn-primary mb-3">가입하기</button>
        </div>
      </form>

    </div>
    
  </body>
</template>


<script>
import axios from 'axios';

export default {
  data() {
    return {
      email: '',
      verificationCode: '', // 추가: 인증번호 입력 필드를 위한 변수
      name: '',
      password: '',
      confirmPassword: '',
      isVerified: false, // 추가: 인증 여부를 나타내는 변수

    };
  },
  methods: {
      submitForm() {
      axios
        .post('/signup/email-check', { email: this.email })
        .then(response => {
          console.log(response)
          alert("인증번호가 전송되었습니다")
        })
        .catch(error => {
          console.log(error)
        });
    },
    emailnum(){
      axios
        .post('/signup/email', { verificationCode: this.verificationCode })
        .then(response => {
          if(response.data===true){
            this.isVerified=true
          }else{
            this.isVerified=false
          }
        })
        .catch(error => {
          console.log(error)
        });
    },
    signUp() {
      // 회원 가입 처리 작업 수행
      // this.name, this.password 등의 정보 사용하여 회원 가입 로직 작성
      if(this.isVerified===true && this.password===this.confirmPassword){
      axios
        .post('/signup', {
          email: this.email,
          name: this.name,
          password: this.password,
        })
      
        .then(response => {
          console.log(response)
        })
        .catch(error => {
          console.log(error)
        });
      }else if(this.isVerified===false){
        alert("이메일 인증이 필요합니다.")
      }else{
        alert("비밀번호를 확인해주세요.")
      }
    },
    
  },
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
  

 .stepbar{
  position:relative;
  left : 550px;
  background-color: silver;
  width: 600px;
  height: 100px;
  top :120px;
  border-radius: 10px;
  z-index: 1;
 }
.step1{
  text-align: center;
  font-size: 30px;
  font-weight: bold;
  padding-top: 25px;
  background-color: #8392ED;
  width: 280px;
  height: 100px;
  border-radius: 10px;
  z-index: -1;
  position: absolute;
}
.step2{
  text-align: right;
  width: 0px;
  border-left: 65px solid #8392ED;
  border-top: 50px solid transparent;
  border-bottom: 50px solid transparent;
  position: relative;
  left: 274px;
}
.step2text{
  text-align: right;
  font-size: 30px;
  font-weight: bold;
  padding-bottom: 100px;
  padding-right: 50px;
  position: relative;
  bottom:75px;
}
.linetest{
  flex-wrap:wrap;
  border: solid 1px;
  width: 1000px;
  position: relative;
  top: 180px;
  left: 350px;
}
    .card1{
        color: black;
        text-shadow: 0px 1px 3px #000;
        font-family: 'Nanum Gothic', sans-serif;
        margin-top:230px;
        padding-top:10px;
        padding-bottom: 10px;
        
    }
    .card2{
        color: black;
        text-shadow: 0px 1px 3px #000;
        font-family: 'Nanum Gothic', sans-serif;
       
        padding-top:10px;
        padding-bottom: 10px;
        
    }
    .card3{
        color: black;
        text-shadow: 0px 1px 3px #000;
        font-family: 'Nanum Gothic', sans-serif;
        
        padding-top:10px;
        margin-bottom: 100px;
    }
    .btn{
      background-color: #176B87;
    }
</style>
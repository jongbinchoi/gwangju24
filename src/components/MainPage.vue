<template>

<!--배너-->
  <div class="conatiner banner">
    <img src="../assets/banner.png" alt="배너사진" class="banner-img">
  </div>

  <!-- 메인 화면 3가지 선택지 -->
    <div class="container main-center">
      <div class="row text-center">
        <div class="col" style="background-color: #9EBDF8; height: 200px;">
          <h4 class="main-text">대상자별 (혜택/복지)</h4>
        </div>
        <div class="col" style="position: relative;">
          <div class="card" style="width: 10rem; position:absolute; top: 40px; left: 100px;">
            <img src="../assets/old.png" class="card-img-top" alt="...">
            <div class="card-body">
              <h5 class="card-title">노인/장애인</h5>
            </div>
          </div>
        </div>
        <hr class="vr">
        <div class="col" style="position: relative;">
          <div class="card" style="width: 8rem; position:absolute; top: 20px; left: 100px;">
            <img src="../assets/basic-pay.png" class="card-img-top" alt="...">
            <div class="card-body">
              <h5 class="card-title">기초수급자</h5>
            </div>
          </div>
        </div>
        <hr class="vr">
        <div class="col" style="position: relative;"  >
          <div class="card" style="width: 8rem; position:absolute; top: 20px; left: 70px;">
            <img src="../assets/preg.png" class="card-img-top" alt="...">
            <div class="card-body">
              <h5 class="card-title">임산부</h5>
            </div>
          </div>
        </div>
      </div>
    </div>
      
    <!-- 슬라이드 바 -->
    <div class="side-bar">
      <ul class="side-items">
        <li><button @click="confirmInput" type="button" href="#" class="side-btn btn btn-outline-primary">나의 스크랩</button></li>
        <li><button type="button" href="#" class="side-btn btn btn-outline-primary"><router-link to="/oldboard">자유게시판</router-link></button></li>
        <li><i class="side-icon fa-solid fa-bars fa-rotate-270"></i></li>
      </ul>
    </div>



</template>

<script>
export default{
  methods: {
        confirmInput() {
            this.$router.push('');
        }
    },
}

</script>

<style scoped>
*{ /* *전체 스타일에 적용하겠다. */
margin: 0;
padding: 0;
box-sizing: border-box;
color: black;
    text-shadow: 0px 1px 3px #000;
    font-family: 'Nanum Gothic', sans-serif;
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

nav {
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



.banner{
  position: relative;
  width: 1550px;
  height: 250px;
  overflow: hidden;
}

.banner-img{
  top: 20px;
  left: 170px;
  position:absolute;
  width:  1150px;
}
/* 사이드바 */
.side-bar {
position: sticky;
bottom: 50px;
width:450px;
background-color: rgba(255, 255, 255, 0.7);
border-style: solid;
border-color: #9EBDF8;
padding: 10px;
margin-top: 300px;
z-index: 1500;
}

.side-items {
display: inline-flex;
list-style-type: none;
padding: 15px;
margin: 0;
}

.side-items > li {
margin-left: 20px;
}

.side-icon{
padding-top: 70px;
margin-left: 50px;
font-size: 25px;
color:#004ad3;
}


.side-bar ul > li:hover > a {
border-bottom: 1px solid #999;
}

.side-btn {
height: 100px;
border-width: 3px;
border-color: #9EBDF8;
}

/* 사이드 바 숨기기 */
.side-bar {
border-radius: 20px;
transform: translate(-320px, 0);  /* 가로 -320px 이동 세로 고정 */
transition: .5s;
}

/* 마우스 인식 시 원래의 위치로 이동 */
.side-bar:hover {
transform: translate(-20px, 0);   /* 둥근 모서리의 너비만큼 X축 이동, Y축 고정 */
}

/* 중앙 3가지 형식의 카드 */
.card{
  border-style: hidden;
}
.container {
  width: 1600px;
  max-width: none !important;
}

.vr{
  height: 100px;
  position: relative;
  top: 60px;
  width: 0px;
  border-right: 0px;
  padding: 4px;
  right: 40px;
}

.main-text{
  line-height: 200px;
}
</style>
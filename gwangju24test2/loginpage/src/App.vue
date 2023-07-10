<template>
  <div id ="wrap">
    <header>
      <a class="logo" href="App.vue">
        <img src="./assets/mainlogo.png" height="100px">
      </a>
      <nav>
        <ul class="nav-items">
          <li><a href="#"><i class="fa-regular fa-user"></i></a></li>
        </ul>
      </nav>
    </header>
  </div>

  <body>
  <div class="stpeline">
   <div class="stepbar">
    <div class="step1">1. 실명확인</div>
    <div class="step2"></div>
    <div class="step2text">2. 실명확인</div>

   </div>
  </div>

  <div class="line"></div>
</body>




</template>

<script>
export default {
  name: 'App',
  components: {
    
  }
}
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
  
  .steplin{
  position:absolute;
  top: 200px;
  }
 .stepbar{
  position:relative;
  left : 600px;
  background-color: silver;
  width: 600px;
  height: 150px;
  top :120px;
  border-radius: 10px;
  z-index: 1;
 }
.step1{
  text-align: center;
  font-size: 30px;
  font-weight: bold;
  padding-top: 50px;
  background-color: #8392ED;
  width: 280px;
  height: 150px;
  border-radius: 10px;
  z-index: 50;
  position: absolute;
}
.step2{
  text-align: right;
  width: 0px;
  border-left: 75px solid #8392ED;
  border-top: 75px solid transparent;
  border-bottom: 75px solid transparent;
  position: relative;
  left: 275px;
}
.step2text{
  text-align: right;
  font-size: 30px;
  font-weight: bold;
  padding-bottom: 500px;
  padding-right: 50px;
  position: relative;
  bottom:95px;
}
.line{
  flex-wrap:wrap;
  border: solid 1px;
  width: 1000px;
  position: relative;
  top: 150px;
  left: 400px;
}
 
</style>
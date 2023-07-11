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
      <span class="border-background">
        <div class="scrap-title-text"> 나의 스크랩 게시판</div>
        <div class="current-page">현재페이지 100/300</div>
        <span class="underline"></span>
      </span>
      <div type="text" style=""></div>
      <ul class="list-group m-2 p-3">
      <button type="button" class="list-group-item list-group-item-action first-button" aria-current="true">
        초기화면
      </button>
      <button type="button" class="list-group-item list-group-item-action">정보게시판</button>
      <button type="button" class="list-group-item list-group-item-action">추천게시판</button>
      <button type="button" class="list-group-item list-group-item-action">나의 스크랩</button>
      <button type="button" class="list-group-item list-group-item-action last-button">내 정보</button>
      </ul>
    </body>
 
</template>

<script>

export default {
  name: 'App',
}
</script>

<style>
*{ 
  /* *전체 스타일에 적용하겠다. */
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  }

  .steprow>li{
    /* steplow에 있는 li만 아래 적용하겠다. */
    display: inline-block;
  }
  
  header{
    flex-wrap: wrap;
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

  body{
    width: 1440px;
    overflow: visible;
  }
  .border-background {
  text-align: center;
  flex-wrap: wrap;
  z-index: -1;
  border: 2px solid;
  position: absolute;
  top: 200px;
  left: 90px; 
  width: 1260px;
  height: 100%;
  border-bottom: none;
  box-sizing: border-box;
  border-color: rgb(130, 130, 130);
  }
  /* 추가 */
  .underline::after {
    content: '';
    display: block;
    width: 920px;
    height: 2px;
    background: black;
    position: absolute;
    margin-bottom: 750px;
    margin-top: 10px;
    left: 50%;
    transform: translateX(-50%);
  }


.scrap-title-text{
  font-size: 250%;
  font-weight: 600;
  padding-top: 40px;
  padding-right: 580px;
}
.current-page{
  font-size: 70%;
  padding-left: 700px;
}
/* .border-underline{
  position: relative;
  text-align: center;
  z-index: 100;
  border-bottom: 2px solid black;
  width: 900px;  /* 너비를 900px로 변경 */
  /* height: 2px;
  margin: auto;  /* 가운데 정렬을 위해 마진을 자동으로 설정 */
  /*box-sizing: border-box;
} */ 


.list-group{
  border-radius: 30px;
  width: 180px; 
  position: fixed;
  top:40%;
  z-index: 100;
}

.list-group-item{
  text-align: center;
  background-color: #9EBDF8;
  height: 80px;
  font-weight: bold;
  font-size: large;
}

.first-button{
  height: 100px;
}

.last-button{
  height: 100px;
}

  </style>
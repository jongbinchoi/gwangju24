<template>
  <div id ="wrap">
  <header>
    <a class="logo" href="/">
      <img src="./assets/mainlogo.png" height="100px">
    </a>
    <nav>
      <ul class="nav-items">
        <li><a href="#"><i class="fa-regular fa-user"></i></a></li>
        <li class="nav-item dropdown">
          <a class="nav-link" data-bs-toggle="dropdown" href="#" role="button" aria-expanded="false"><i class="fa-solid fa-bars"></i></a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item"><router-link to="/Edit">나의 정보</router-link></a></li>
            <li><a class="dropdown-item" href="#">설정</a></li>
            <li><a class="dropdown-item" href="#">로그아웃</a></li>
          </ul>
        </li>
      </ul>
    </nav>
  </header>
</div>

<router-view></router-view>

</template>


<script>

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



.banner{
height: 300px;
width: 1000px;
margin-left:350px;
}

.bannersize{
  flex-wrap:wrap;
  margin-top: 20px;
  width: 1000px;
  height: 300px;
  padding-bottom: 13px;
}

/*bootstrap 이용*/

/*파란색 도형 */
.bmenubar{
  flex-wrap:wrap;
  height: 201px;
  width: 435px;
  background-color: #9EBDF8;
  border-top-right-radius: 10px;
  border-bottom-right-radius: 10px;
  z-index: 500;
  margin-bottom: 8px;
  text-align: center;
}

/*대상자별 폰트 및 위치조정 */
.bmenubartext{
font-size: 30px;
font-weight:bold;
margin-top: 75px;

}


.choicebox{
height:200px;
width: 1350px;;
background-color: #f0f4fafb;
position: relative;
left: 370px;
bottom: 207px;
}


.choiceimgside :hover{
transform: translate(0, -10px);
}

/*파란색칸, 회색칸 들어갈 섹션 */

.menubar{
  background-color:#9EBDF8;
  height:200px;
  width: 100%;
  border-top-right-radius: 10px; /*둥근모서리*/
  border-bottom-right-radius: 10px; /*둥근모서리*/
  z-index: 500;
  display: flex;
  justify-content: center; /*속성은 요소들을 가로축 정렬*/
  align-items:center; /*속성은 요소들을 세로축 정렬*/
}

.menubarfont{
font-size: 30px;
font-weight:bold;

}

.sectioncolumn{
flex-grow: 1;/*여백을 채워줌*/
display: flex;
flex-direction:column;
align-items: center;
}

.sectioncolumn img{
height: 135px; /*대상자별 이미지조정*/
}
.menutext{
text-align: center;
color: black;
font-weight:bold;
position: relative;
bottom: 25px;
}
.image-container{
display: flex;
justify-content: space-between;
align-items: center;
height: 100%;
width: 100%;
}

.image-container img {/*뒤에 img는 모든 이미지에 해당됨.*/
margin: 20px; /* 이미지 간격을 조정하려면 여기서 마진 값을 조정합니다 */
}

.vertical-line {
width: 0.08em;
height: 140px;
background-color: rgb(202, 201, 201); /* 구분선의 색상을 원하는 색으로 변경할 수 있습니다 */
margin-bottom: 20px;
}

/* 사이드바 */
.side-bar {
position: sticky;
bottom: 1500px;
width:450px;
background-color: rgba(167, 237, 231, 0.7);
padding: 10px;
margin-top: 700px;
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
}


.side-bar ul > li:hover > a {
border-bottom: 1px solid #999;
}

.side-btn {
height: 100px;
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



</style>
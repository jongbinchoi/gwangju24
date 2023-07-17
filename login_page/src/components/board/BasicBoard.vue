<template>
    <span class="border-background">
      <div class="scrap-title-text">기초수급자 정보 게시판</div>
      <div class="current-page">현재페이지 100/300</div>
      <span class="underline"></span>
<div class="table-container">
<table class="table table-striped">
  <thead>
    <tr>
    <th scope="col" class="number">번호</th>
    <th scope="col">스크랩</th>
    <th scope="col">제 목</th>
    <th scope="col">조회수</th>
  </tr>
</thead>
<tbody>
  <tr>
    <th scope="row" class = "number">1</th>
    <td class="star">
    <input type="checkbox" id="starCheckbox" onclick="toggleStarColor(this)">
    <label for="starCheckbox"></label>
    </td>
    <td class="board-title"></td>
    <td></td>

  </tr>
  <tr>
    <th scope="row" class="number">2</th>
    <td class="star">
    <input type="checkbox" id="starCheckbox" onclick="toggleStarColor(this)">
    <label for="starCheckbox"></label>
    </td>
    <td class="board-title"></td>
    <td></td>

  </tr>
  <tr>
    <th scope="row" class="number">3</th>
    <td class="star">
    <input type="checkbox" id="starCheckbox" onclick="toggleStarColor(this)">
    <label for="starCheckbox"></label>
    </td>
    <td class="board-title"></td>
    <td></td>
  </tr>
</tbody>
</table>
</div>
    </span>
    <div type="text" style=""></div>
    <ul class="list-group m-2 p-3">
    <button type="button" @click="confirmOld" class="list-group-item list-group-item-action first-button">노인게시판</button>
    <button type="button" @click="confirmBasic" class="list-group-item list-group-item-action">기초수급자</button>
    <button type="button" @click="confirmPreg" class="list-group-item list-group-item-action">임산부게시판</button>
    <button type="button" @click="confirmScrap" class="list-group-item list-group-item-action last-button">나의 스크랩</button>
    </ul>

</template>

<script>

export default{
  methods: {
        confirmOld() {
            this.$router.push('/article/oldmans-disables');
        },
        confirmBasic() {
            this.$router.push('/article/basic-recipients');
        },
        confirmPreg() {
            this.$router.push('/article/pregnants');
        },
        confirmScrap() {
            this.$router.push('/article/scrap');
        }
    },
}
// eslint-disable-next-line no-unused-vars
function toggleStarColor(checkbox) {
checkbox.checked = !checkbox.checked;
}


</script>

<style scoped>
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

.table-container{
  position: relative;
  top: 50px;
}
.table{
  margin: 0 auto;
  width: 75%;
  height: 30px;
  align-content: center;
  background-color: rgb(85, 85, 85);
}
.number{
  width: 60px;
}
.star {
position: relative;
width: 90px;
}

.star input[type="checkbox"] {
display: none;
}

.star label {
position: absolute;
top: 50%;
left: 50%;
transform: translate(-50%, -50%);
width: 15px;
height: 15px;
background-color: gray;
cursor: pointer;
clip-path: polygon(50% 0%, 61% 35%, 98% 35%, 68% 57%, 79% 91%, 50% 70%, 21% 91%, 32% 57%, 2% 35%, 39% 35%);
box-shadow: 0 2px 4px rgba(0, 0, 0, 0.3);
}

.star input[type="checkbox"]:checked + label {
background-color: yellow;
box-shadow: 0 2px 4px rgba(0, 0, 0, 0.5);
}

.board-title{
width: 700px;
}

.scrap-title-text{
font-size: 250%;
font-weight: 600;
padding-left: 150px;
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
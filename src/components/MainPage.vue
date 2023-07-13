<template>
    <!--배너-->
  <div class="banner" >
    <img src="../assets/banner.png" alt="배너사진" class="bannersize">
  </div>

<!--bootstrap 선택기능-->

  <div class="row align-items-center" >
   <div class="bmenubar" >
    <p class="bmenubartext">대상자별(혜택/복지)</p>
   </div>
  </div>


<div class="choicebox"><!--선택바-->
  <div class="row">

 <div class="image-container">

        <div class="sectioncolumn">
        <a style=" text-decoration: none" target="_self" href="#"> 
          <p class="choiceimgside">
          <img src="../assets/old.png" alt="노인/장애인"> 
        </p>
          <p class="menutext">노인/장애인</p>
        </a>
      </div>

        <div class="vertical-line"></div>

        <div class="sectioncolumn">
        <a style=" text-decoration: none" target="_self" href="#">
          <p class="choiceimgside">
            
          <img src="../assets/basic-pay.png" alt="기초수급자">
        </p>
          <p class="menutext">기초수급자</p>
        </a>
        </div>

        <div class="vertical-line"></div>

        <div class="sectioncolumn"> 
        <a style=" text-decoration: none" target="_self" href="#">
          <p class="choiceimgside">
          <img src="../assets/preg.png" alt="임산부">
        </p>
          <p class="menutext">임산부</p>
        </a>
        </div>
        
      </div>


</div>
</div>


<!--슬라이딩 바-->
<div class="side-bar">
      <ul class="side-items">
        <li><button type="button" href="#" class="side-btn btn btn-light">나의 스크랩</button></li>
        <li><button type="button" href="#" class="side-btn btn btn-light">자유게시판</button></li>
        <li><i class="side-icon fa-solid fa-bars fa-rotate-270"></i></li>
      </ul>
    </div>


</template>
<template>
  <div id ="wrap">
  <header>
    <a class="logo" href=""><router-link to="/"></router-link>
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
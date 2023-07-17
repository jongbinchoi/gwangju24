<template>
    <span class="border-background">
      <div class="scrap-title-text">임산부 정보 게시판</div>
      <div class="current-page"></div>
      <span class="underline"></span>
      <div class="listWrap">

        <div>
      <h2>게시물 상세</h2>
      <div class="detailWrap">

        <p>내용: {{ this.results.content}}</p>
      </div>
    </div>

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
export default {
	data() { //변수생성
		return{
      results: null,
		};
	}
	,mounted() { //페이지 시작하면은 자동 함수 실행
		this.loadExperiences();
	},
    methods: {
    loadExperiences() {

      let url = window.location.href;
      const arr = url.split('/')
      url = arr[arr.length-1]
      
      fetch(`/article/oldmans-disables/${url}`)
        .then((response) => {
          if (response.ok) {
            return response.json();
          }
        })
        .then((data) => {
          this.results = data.data.results
         
        });
    }, 
    }
  };
  </script>
  
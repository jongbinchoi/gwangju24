<template>
    <div id="form-main" class="container-sm px-5 text-center">
        <form class="card mx-auto" style="background-color: rgba(218, 255, 251 ,0.2);">
        <h2 class="p-3 m-4">정보수정</h2>

          <div class="row mb-3 pb-3">
            <div class="col-sm-2"></div>
             <label for="nameInput" class="col-form-label col-sm-2">이름</label>
            <div class="col-sm-5">
                <input type="text" class="form-control" id="nameInput" placeholder="예) 홍길동">
            </div>
          </div>

          <div class="row mb-3 pb-3">
            <div class="col-sm-2"></div>
                <label for="pwInput" class="col-form-label col-sm-2">현재 비밀번호</label>
            <div class="col-sm-5">
              <input type="password" class="form-control" id="pwInput">
            </div>
          </div>

          <div class="row mb-3 pb-3">
            <div class="col-sm-2"></div>
             <label for="pwInput" class="col-form-label col-sm-2">새로운 비밀번호</label>
            <div class="col-sm-5">
              <input type="password" class="form-control" id="pwInput">
            </div>
          </div>

          <div class="col-auto p-2">
            <button type="submit" class="btn btn-primary mb-3">수정하기</button>
          </div>
        </form>
      </div>
</template>

<script>

export default{
    data(){
        return {
            counter: 0,
            name: ''
        };
    },
    methods:{

    }
};
</script>

<style scoped>
    .card{
        color: black;
        text-shadow: 0px 1px 3px #000;
        font-family: 'Nanum Gothic', sans-serif;
    }
    .btn{
      background-color: #176B87;
    }
    #form-main{
        margin-top:8%;
        width: 70%;
    }
    .card{
        height: 450px;
    }
</style>
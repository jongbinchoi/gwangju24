module.exports = {
  devServer: {
    port: 8082,
    proxy: {
      // 프록시 설정을 추가
      '^/http://127.0.0.1:8080': {
        target: 'http://localhost:8080', // 실제 백엔드 서버 주소로 대체
        changeOrigin: true,
        pathRewrite: {
          // 접두사 제거
          '^/http://127.0.0.1:8080': '',
        },
      },
    },
  },
};
const app = Vue.createApp({
    data(){
        return {
            counter: 0,
            name: ''
        };
    },
    methods:{
        submitForm(event){
            alert('Submitted!');
        }
    }
});


app.mount('#form-main');
var vue = new Vue({
    el:"#app",
    data:{
        userList:[],
        user:{}
    },
    methods:{
        findAll:function () {
            axios.get("user/findAll").then(function (response) {
                vue.userList = response.data
            })
        },
        findOne:function (id) {
            axios.get("user/findOne",{params:{id:id}}).then(function (response) {
                vue.user = response.data
            })
        },
        update:function () {
            axios.post("user/update",this.user).then(function (response) {
                vue.findAll()
            }).catch(function (reason) {
                alert("修改失败")
            })
        }
    },
    created:function () {
        this.findAll()
    }
})
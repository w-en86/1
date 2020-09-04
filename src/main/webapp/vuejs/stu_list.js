new Vue({
    el:"#app",
    data:{
        goods:{},
        stuList:[],
        student:{},
        stu:[]
    },
    methods:{
        getStudentList:function () {
            var _this = this;
            var url = baseUrl+"sc/getStudentList.do";
            axios.get(url).then(function (response) {
                _this.stuList = response.data;
            }).catch(function (error) {
                console.log(error);
            })
        },
    },
    toAddStu:function () {
        document.getElementById("editStu").style.display="block";
    },
    AddStu:function () {
        var _this = this;
        var url = baseUrl+"sc/AddStu";
        axios.post(url,_this.student).then(function (response) {
            if(response.data.flag){
                document.getElementById("editStu").style.display="none";
            }else {
                alert(response.data.msg);
            }

        })
    },
    created:function () {
        this.getStudentList();
    }
});
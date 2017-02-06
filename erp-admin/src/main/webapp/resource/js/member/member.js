/**
 * Created by lixiang01 on 2/6/2017.
 */

$(function () {


    var memberVue = new Vue({
        el:'#divController',
        data:{
            memberInfo:{
                name:"",
                mobilePhone:""
            }

        },
        methods:{
            addMember:function () {

                $.ajax({
                    url:webRoot+"/member/newMember",
                    data:this.memberInfo,
                    type:'POST',
                    success:function (datas) {
                        if(datas['error']==0){
                            $("#addSuccess").show();
                            setTimeout(function() {
                                window.location.reload();
                            }, 1500);

                        }else{
                            alert(datas['message']);
                            window.location.reload();
                        }
                    },
                    fail:function () {

                    }
                });

            },
            saveModify:function () {
                $.ajax({
                    url:webRoot+"/sale/modifySaleInfo",
                    type:'POST',
                    data:this.saleInfo,

                    success:function (data) {
                        if(data=="ok"){
                            $("#addSuccess").show();
                            setTimeout(function() {
                                window.location.reload();
                            }, 1500);
                        }else{
                            window.location.reload();
                        }

                    },
                    fail:function () {
                        console.log("fail");
                    }
                })

            }
        }

    });



})
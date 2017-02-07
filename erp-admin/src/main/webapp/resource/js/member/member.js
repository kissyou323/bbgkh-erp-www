/**
 * Created by lixiang01 on 2/6/2017.
 */

$(function () {


    var oldMemberInfo = {

        memberInfo:{
            mobilePhone:""
        },
        saleInfo:{
            productSysNo:"",
            salePrice:""
        }
    };

    var memberVue = new Vue({
        el:'#divController',
        data:{
            memberInfo:{
                name:"",
                mobilePhone:""
            },

            oldMemberInfo:oldMemberInfo

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
            addOldMemberInfo:function () {
                var oldMemberInfo = JSON.stringify(this.oldMemberInfo);
                this.$http.post(webRoot+"/member/addOldMemberData", this.oldMemberInfo)
                    .then(function (datas) {
                        console.log(datas);
                    }, function (datas) {
                        console.log(datas);
                    });
                /*$.ajax({
                    url:webRoot+"/member/addOldMemberData",
                    type:'POST',
                    contentType: "application/json",
                    data:oldMemberInfo,

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
                })*/

            }
        }

    });



})
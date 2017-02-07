/**
 * Created by lixiang on 12/16/2016.
 */

$(function () {

    var loginVue = new Vue({
        el:'#divController',
        data:{
            customerInfo:{
                name:"",
                password:""
            }

        },
        methods:{
            login:function () {

                $.ajax({
                    url:webRoot+"/user/login/",
                    data:this.customerInfo,
                    type:'POST',
                    success:function (datas) {
                        datas = JSON.parse(datas);
                        if(datas['error']==0){
                            //说明用户名和密码正确,且已经登录成功
                            alert(datas['message']);
                            window.location.href=webRoot+"/showPage/dashBoard-mainBoard";

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




    $("#registerButton").on("click",function (el) {
        var name = $("#userName").val();
        var password =$("#password").val();
        var customer={
            name:name,
            password:password
        };
        $.ajax({
            url:"/bbgkh/user/validateUser/",
            data:customer,
            type:'POST',
            success:function (datas) {
                console.log(datas);

                if(datas=="false"){
                    alert("该用户名已经注册，请换一个重试");
                    window.location.reload();

                }else{
                    //代表没有重复，可以注册
                    $.ajax({
                        url:"/bbgkh/user/registerUser/",
                        type:'POST',
                        data:customer,
                        success:function (datas) {
                           alert("注册成功，可以登录啦")
                        },
                        fail:function () {

                        }
                    })

                }
            },
            fail:function () {

            }
        })
    });


})
/**
 * Created by lixiang on 12/16/2016.
 */

$(function () {
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
    $("#loginButton").on("click",function (el) {
        var name = $("#userName").val();
        var password =$("#password").val();
        var customer={
            name:name,
            password:password
        };
        $.ajax({
            url:"/bbgkh/user/login/",
            data:customer,
            type:'POST',
            success:function (datas) {
                if(datas=="ok"){
                    //说明用户名和密码正确,且已经登录成功
                    alert("恭喜你，登录成功！");
                    window.location.href="/bbgkh/home/mainDash";

                }else{
                    alert("登录失败，请再次尝试");
                    window.location.reload();
                }
            },
            fail:function () {

            }
        })
    });

})
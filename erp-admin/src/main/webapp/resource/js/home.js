/**
 * Created by lixiang on 12/16/2016.
 */

$(function () {
    $("#loginButton").on("click",function (el) {
        var name = $("#userName").val();
        $.ajax({
            url:"/bbgkh/user/validateUser/"+name,
            type:'GET',
            success:function (datas) {
                console.log(datas);
            },
            fail:function () {

            }
        })
    })
})
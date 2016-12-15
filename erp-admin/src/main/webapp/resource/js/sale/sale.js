/**
 * Created by lixiang on 12/15/2016.
 */

$(function () {
    $("#divController").on("click","#submitSale",function (el) {
        var saleInfo={
            productSysNo : $("input[name=productSysNo]").val(),
            color: $("input[name=color]").val(),
            size: $("input[name=size]").val(),
            salePrice:$("input[name=salePrice]").val(),
            sex:$("input[type=radio][checked]").val(),
            saleNum:$("input[name=saleNum]").val()
        };
        $.ajax({
            url:webRoot+"/sale/newSaleInfo",
            type:'POST',
            data:saleInfo,

            success:function (data) {
                if(data=="ok"){
                    $("#addSuccess").show();
                    setTimeout(function() {
                        window.location.reload();
                    }, 1500);
                }

            },
            fail:function () {
                console.log("fail");
            }
        })
    })

})
//method="post" action="/bbgkh/sale/newSaleInfo"

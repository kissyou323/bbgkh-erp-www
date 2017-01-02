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
            sex:$("#sexValue").attr("data-select"),
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
    });

    $("#divController").on('click',"input[id^=sexValue_]",function (el) {
        changeSelected(el);
    });




});



function changeSelected(el) {

    //获取到一些初始的值
    var source  =$(el.target);
    var tagName = source.get(0).tagName;
    var idName  = source.attr("id").split("_")[0];
    var idName_ = idName+"_";
    //var selecterName =tagName+"[id^="+idName_+"]";
    var parentNode = source.closest("#"+idName);

    //获取现在正在选中的值
    var selectId = idName+"_"+parentNode.attr("data-select");

    //更改样式
    $("#"+selectId).removeClass("on");
    source.addClass("on");

    //改变值
    $(parentNode).attr("data-select",source.attr("data-value"));
}

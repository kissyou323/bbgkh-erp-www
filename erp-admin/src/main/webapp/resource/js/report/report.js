/**
 * Created by lixiang on 12/21/2016.
 */

$(function () {
    var totalAmount=getTotalPrice();
    $("#totalAmount").html(totalAmount);

    $("#datetimepicker").datetimepicker({
        format: "yyyy MM dd",
        autoclose: true,
        todayBtn: true,
        minView:'month',
        language:'zh-CN'
    }).on('changeDate',function (ev) {
        var timeStamp = ev.date.valueOf()/1000;
        $.ajax({
            url:webRoot+"/report/getReport/"+timeStamp,
            type:'GET',
            dataType:'html',
            success:function (data) {
                $("#reportDatas").empty();
                $("#reportDatas").html(data);
                var totalAmount=getTotalPrice();
                $("#totalAmount").html(totalAmount);
            },
            fail:function () {
                console.log("fail");
            }
        })
    });
});

function getTotalPrice() {
    var total = 0;
    $("td[data-type=salePrice]").each(function (el) {
        total+=parseInt(this.innerText);
    })
    return total;
}
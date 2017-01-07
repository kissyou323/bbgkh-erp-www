/**
 * Created by lixiang on 12/21/2016.
 */



$(function () {
    Vue.config.devtools = true;


    var dataComponent ={
        saleInfo: {
            id: 1,
            productSysNo: 1,
            salePrice: 1,
            sex: 1,
            color: 1,
            size: 1,
            saleNum: 1
        }
    }

    Vue.component('report-data', {
        template:'#reportData-component',
        data:function(){
            return dataComponent;
        },
        methods:{
            modifySaleInfo:function (el) {

                var source = $(el.target);
                var saleInfoId = source.attr("data-value");
                var saleInfo={
                    id:saleInfoId,
                    productSysNo:$("#productSysNo_"+saleInfoId).text(),
                    salePrice:$("#salePrice_"+saleInfoId).text(),
                    sex:$("#sex_"+saleInfoId).attr("value"),
                    color:$("#color_"+saleInfoId).text(),
                    size:$("#size_"+saleInfoId).text(),
                    saleNum:$("#saleNum_"+saleInfoId).text(),

                };
                this.saleInfo =saleInfo;

                // aa.$set(0, Object.assign({},aa[0],{name:'jxj2',age:26}))


                $("#modifyModal").modal('show');
            },
        }
    });

    var modifyModal = new Vue({
        el:'#page-wrapper',
        data:{
            saleInfo:{
                id:1,
                productSysNo:1,
                salePrice:1,
                sex:1,
                color:1,
                size:1,
                saleNum:1
            }

        },
        methods:{
            modifySaleInfo:function (el) {

                var source = $(el.target);
                var saleInfoId = source.attr("data-value");
                var saleInfo={
                    id:saleInfoId,
                    productSysNo:$("#productSysNo_"+saleInfoId).text(),
                    salePrice:$("#salePrice_"+saleInfoId).text(),
                    sex:$("#sex_"+saleInfoId).attr("value"),
                    color:$("#color_"+saleInfoId).text(),
                    size:$("#size_"+saleInfoId).text(),
                    saleNum:$("#saleNum_"+saleInfoId).text(),

                };
                this.saleInfo =saleInfo;

               // aa.$set(0, Object.assign({},aa[0],{name:'jxj2',age:26}))


                $("#modifyModal").modal('show');
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

    var a =1;
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

    $("#divController").on('click',"#modifySaleInfo",function (el) {

     //   modifySaleInfo(el,1);
    });
});


/*function modifySaleInfo(el,type) {

    if(type==1){
        var source = $(el.target);
        var saleInfoId = source.attr("data-value");
        var saleInfo={
            productSysNo:$("#productSysNo_"+saleInfoId).text(),
            salePrice:$("#salePrice_"+saleInfoId).text(),
            sex:$("#sex_"+saleInfoId).attr("value"),
            color:$("#color_"+saleInfoId).text(),
            size:$("#size_"+saleInfoId).text(),
            saleNum:$("#saleNum_"+saleInfoId).text()
        };



        $("#modifyModal").modal('show');
    }


}*/

function getTotalPrice() {
    var total = 0;
    $("td[data-type=salePrice]").each(function (el) {
        total+=parseInt(this.innerText);
    });
    return total;
}


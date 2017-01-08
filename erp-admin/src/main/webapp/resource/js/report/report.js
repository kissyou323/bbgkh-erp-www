/**
 * Created by lixiang on 12/21/2016.
 */



$(function () {
    Vue.config.devtools = true;


    var dataComponent ={
        reportInfos: [

        ]
    };

    var saleData ={
        saleInfo:{
            id:1,
            productSysNo:1,
            salePrice:1,
            sex:1,
            color:1,
            size:1,
            saleNum:1
        }
    };

    Vue.filter('time', function (value) {
        var myDate =new Date(parseInt(value) * 1000);
        return myDate.getHours()+":"+myDate.getMinutes();
    })

    Vue.component('report-data', {
        template:'#reportData-component',
        data:function(){
            return dataComponent;
        },
        methods:{
            modifySaleInfo:function (index,el) {

                saleData.saleInfo=dataComponent.reportInfos[index];

                $("#modifyModal").modal('show');
            },
        }
    });

    Vue.component('modify-data', {
        template:'#modifyData-component',
        data:function(){
            return saleData;
        },
        methods:{

            saveModify:function () {
                modifyData();
            }
        }
    });

    var modifyModal = new Vue({
        el:'#divController',
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


        }

    });


    $("#datetimepicker").datetimepicker({
        format: "yyyy MM dd",
        autoclose: true,
        todayBtn: true,
        minView:'month',
        language:'zh-CN'
    }).on('changeDate',function (ev) {
        var timeStamp = ev.date.valueOf()/1000;
        getReportData(timeStamp)
    });


    var timStamp = Date.parse(new Date())/1000;
    getReportData(timStamp);



    function getReportData(timeStamp) {
        $.ajax({
            url:webRoot+"/report/getReport/"+timeStamp,
            type:'GET',
            dataType:'json',
            success:function (data) {
                if(data['error']==0){
                    dataComponent.reportInfos=data['object'];
                    getTotalPrice();
                }else{
                    alert(data['message'])
                }

            },
            fail:function () {
                console.log("fail");
            }
        })
    }


    function modifyData() {
        $.ajax({
            url:webRoot+"/sale/modifySaleInfo",
            type:'POST',
            data:saleData.saleInfo,

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


    function getTotalPrice() {
        var total = 0;
        for(var i = 0;i<dataComponent.reportInfos.length;i++){
            total+=dataComponent.reportInfos[i].salePrice;
        }

        $("#totalAmount").html(total);
        return total;
    }

});









function testGet(){
    $.ajax({
        type:"Get",
        url:"testHttpClientGet",
        success:function(data){
            alert(data);
        }
    });

    $.ajax({
        type:"Get",
        url:"testHttpClientGetParams/"+1+"/yongsamas",
        success: function (data) {
            alert(data);
        }
    })

}

function testPost(){
/*    $.ajax({
        type:"POST",
        url:"testHttpClientPost",
        data:{id:1,name:"yongsamas"},
        success: function (data) {
         //   alert(data);
        }
    });*/

    var datas={};
    datas.id=1;
    datas.name="yongsamas";

    $.ajax({
        type:"POST",
        url:"testHttpClientPost",
        data:datas,
        success: function (data) {
            alert(data)
        }
    })

}
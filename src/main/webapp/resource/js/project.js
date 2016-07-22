/**
 * Created by Administrator on 2016/7/18.
 */

$(function () {
    jQuery("#project").jqGrid({
        url:rootpath+"projects",
        datatype:"json",

        colNames:['id','备注','总金额','现有金额','创建时间'],
        colModel:[
            {name:'id',index:'id',width:75,editable : false},
            {name:'remark',index:'remark',width:75,editable : true,editoptions : {size : 10}},
            {name:'total',index:'total',width:75,editable : true,editoptions : {size : 10}},
            {name:'already',index:'already',width:75,editable : false},
            {name:'createTime',index:"createTime",width:200,editable : false,formatter:'date',
                formatoptions:{srcformat:'Y-m-d',newformat:'Y-m-d'}},
        ],
        rowNum:10,
        rowList:[15,20,25],
        jsonReader: {
            root:"list",
            repeatitems: false,
        },
        caption:"项目列表",
        pager:$('#pager'),
        editurl : rootpath+"projects/addProject",
        onSelectRow: function (rowid,status) {
            showDetail(rowid);
        }

    }).trigger('reloadGrid');
    jQuery("#project").jqGrid('navGrid', '#pager', {edit : false,add : false,del : false});
    jQuery("#project").jqGrid('gridResize',{minWidth:350,maxWidth:800,minHeight:80, maxHeight:350});

    $("#addProject").click(function() {
        var datas={};
        datas.total=$("#total").val();
        datas.remark =$("#remark").val();
        jQuery("#project").jqGrid('editGridRow', "new", {
            height : 170,
            reloadAfterSubmit : true
        });
    });


});



function showDetail(id){

    $.ajax({
        type:"Get",
        url:rootpath+"detail/"+id,

        success: function (datas) {
            var grid=  jQuery("#detail").jqGrid({
                datatype:"local",
                colNames:['id','项目名称','收入/支出','金额','备注'],
                colModel:[
                    {name:'id',index:'id',width:75,editable : false},
                    {name:'projectName',index:'projectName',width:75,editable : false},
                    {name:'inorout',index:'total',width:95,editable : false,formatter:convertoword},
                    {name:'amount',index:'already',width:75,editable : false},
                    {name:'remark',index:"createTime",width:200,editable : false}
                ],
                rowNum:10,
                rowList:[15,20,25],
                localReader: {
                    root:"list",
                    repeatitems: false
                },
                caption:"明细列表",
                pager:$('#detailpager')
            }).trigger('reloadGrid');
            grid.setGridParam({data: datas.list}).trigger('reloadGrid');
        }

    });
    $('#detail').jqGrid('clearGridData');
    $("#detailModal").modal("show");

}


function saveDetail(){
    var datas={};
    datas.projectId=$("#selectProject").val();
    datas.amount=$("#amount").val();
    datas.remark=$("#remark").val();
    datas.inorout=1;
    $.ajax({
        url:rootpath+"detail/addDetail",
        type:"POST",
        data:datas,
        success: function (data) {
            alert(data);
            $("#addDetailModal").modal('hide');
        }
    })

}


function convertoword(cellvalue, options, rowObject){
    if(cellvalue==0){
        return "收入";
    }else{
        return "支出";
    }

}


function income(){
    var money=$("#incomeMoney").val();

    $.ajax({
        url:rootpath+"projects/income/"+money,
        type:"Get",
        success: function (data) {
            console.log("OK");
        }
    })
}
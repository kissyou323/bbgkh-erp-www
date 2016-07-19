/**
 * Created by Administrator on 2016/7/18.
 */

$(function () {
    jQuery("#project").jqGrid({
        url:rootpath+"projects",
        datatype:"json",
        colNames:['id','remark','total','already','createTime'],
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
        editurl : rootpath+"projects/addProject"

    });
    jQuery("#project").jqGrid('navGrid', '#pager', {edit : false,add : false,del : true});


    $("#addProject").click(function() {
        var datas={};
        datas.total=$("#total").val();
        datas.remark =$("#remark").val();
        jQuery("#project").jqGrid('editGridRow', "new", {
            height : 170,
            reloadAfterSubmit : true,
        });
    });



});
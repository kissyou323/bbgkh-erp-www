/**
 * Created by Administrator on 2016/7/18.
 */

$(function () {
    jQuery("#project").jqGrid({
        url:rootpath+"/projects",
        datatype:"json",
        colNames:['id','total','already','remark','createTime'],
        colModel:[
            {name:'id',index:'id',width:75,editable : false},
            {name:'total',index:'total',width:75,editable : true,editoptions : {size : 10}},
            {name:'already',index:'already',width:75,editable : true,editoptions : {size : 10}},
            {name:'remark',index:'remark',width:75,editable : true,editoptions : {size : 10}},
            {name:'createTime',index:"createTime",width:200,editable : true,editoptions : {size : 10}},
        ],
        rowNum:10,
        rowList:[15,20,25],
        jsonReader: {
            root:"list",
            repeatitems: false,
            id:"0"
        },
        caption:"项目列表",
        pager:$('#pager')
    });
    jQuery("#project").jqGrid('navGrid', '#pager', {edit : false,add : true,del : true});

    $("#addProject").click(function() {
        jQuery("#project").jqGrid('editGridRow', "new", {
            height : 300,
            reloadAfterSubmit : true,
            });
    });



});
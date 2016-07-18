/**
 * Created by Administrator on 2016/7/18.
 */

$(function () {
    jQuery("#project").jqGrid({
        url:rootpath+"/projects",
        datatype:"json",
        colNames:['id','total','already','remark','createTime'],
        colModel:[
            {name:'id',index:'id',width:55},
            {name:'total',index:'total',width:55},
            {name:'already',index:'already',width:55},
            {name:'remark',index:'remark',width:55},
            {name:'createTime',index:"createTime",width:55},
        ],
        rowNum:10,
        rowList:[15,20,25],
        jsonReader: {
            root: "griddata",
            total: "totalpages",
            page: "currpage",
            records: "totalrecords",
            repeatitems: false
        },
        pager:$('#pager')
    });
});
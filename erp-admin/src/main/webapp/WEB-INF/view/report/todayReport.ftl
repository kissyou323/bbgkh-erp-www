<#import "reportMacro.ftl" as report>
<#include "../BasePage.ftl">
<#macro mhead>
<link href="${rsRoot}/data-picker/css/bootstrap-datetimepicker.css" rel="stylesheet" media="screen">
<script type="text/javascript" src="${rsRoot}/data-picker/js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
<script type="text/javascript" src="${rsRoot}/data-picker/js/locales/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8"></script>
<script src="${rsRoot}js/report/report.js"></script>
</#macro>
<#macro mbody>
<div id="page-wrapper">
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">销售情况</h1>
        </div>
        <!-- /.col-lg-12 -->
    </div>
    <!-- /.row -->
    <div class="row">
        <div class="col-lg-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <div class="row">
                        <div class="col-sm-3">
                            今天的销售情况
                        </div>
                        <div class="input-append date form_datetime col-sm-4"  id="datetimepicker"  data-date-format="yyyy-mm-dd">
                            <input size="16" type="text" placeholder="点此选择日期" readonly>
                            <span class="add-on"><i class="icon-th"></i></span>
                        </div>
                    </div>

                </div>
                <!-- /.panel-heading -->
                <div id="reportDatas" class="panel-body">
                    <report-data></report-data>
                    <!-- /.table-responsive -->
                </div>
                <!-- /.panel-body -->
            </div>
            <!-- /.panel -->
        </div>
        <!-- /.col-lg-12 -->
    </div>
    <!-- /.row -->

    <@report.modifySaleInfo />
</div>
</#macro>



<script type="text/x-template" id="reportData-component">
    <div>
    <div class="row">
        <div  class="alert alert-success col-md-2" role="alert">总销售额：<p id="totalAmount"></p></div>
    </div>
    <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
        <thead>
        <tr>
            <th>编号</th>
            <th>货号</th>
            <th>售价</th>
            <th>男/女</th>
            <th>颜色</th>
            <th>尺码</th>
            <th>数量</th>
            <th>时间</th>
            <th>操作</th>

        </tr>
        </thead>
        <tbody>
        <#list infoPos as saleInfo>
        <tr class="odd gradeX">
            <td>${saleInfo_index+1}</td>
            <td id="productSysNo_${saleInfo.id}">${saleInfo.productSysNo!''}</td>
            <td id="salePrice_${saleInfo.id}" data-type="salePrice">${saleInfo.salePrice}</td>
            <#if saleInfo.sex==1>
                <td id="sex_${saleInfo.id}" value="${saleInfo.sex}">女裤</td>
            <#else >
                <td id="sex_${saleInfo.id}" value="${saleInfo.sex}">男裤</td>
            </#if>

            <td id="color_${saleInfo.id}">${saleInfo.color!''}</td>
            <td id="size_${saleInfo.id}">${saleInfo.size!''}</td>
            <td id="saleNum_${saleInfo.id}">${saleInfo.saleNum}</td>
            <td >${saleInfo.saleTime?datetime("yyyy-mm-dd HH:mm:ss")?time}</td>
            <td>
                <button  v-on:click="modifySaleInfo" data-value="${saleInfo.id}" class="btn btn-outline btn-default" >修改</button>
            </td>
        </tr>
        </#list>
        </tbody>
    </table>
    </div>
</script>
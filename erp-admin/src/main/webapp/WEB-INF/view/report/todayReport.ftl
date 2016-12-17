<#include "../BasePage.ftl">
<#macro mhead>

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
                    今天的销售情况
                </div>
                <!-- /.panel-heading -->
                <div class="panel-body">
                    <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                        <thead>
                        <tr>
                            <th>货号</th>
                            <th>售价</th>
                            <th>男/女</th>
                            <th>颜色</th>
                            <th>尺码</th>
                            <th>销售数量</th>
                            <th>销售时间</th>

                        </tr>
                        </thead>
                        <tbody>
                        <#list infoPos as saleInfo>
                            <tr class="odd gradeX">
                                <td>${saleInfo.productSysNo}</td>
                                <td>${saleInfo.salePrice}</td>
                                <#if saleInfo.sex==1>
                                    <td>女裤</td>
                                <#else >
                                    <td>男裤</td>
                                </#if>

                                <td>${saleInfo.color}</td>
                                <td>${saleInfo.size}</td>
                                <td>${saleInfo.saleNum}</td>
                                <td>${saleInfo.saleTime}</td>
                            </tr>
                        </#list>
                        </tbody>
                    </table>
                    <!-- /.table-responsive -->
                </div>
                <!-- /.panel-body -->
            </div>
            <!-- /.panel -->
        </div>
        <!-- /.col-lg-12 -->
    </div>
    <!-- /.row -->

</div>
</#macro>
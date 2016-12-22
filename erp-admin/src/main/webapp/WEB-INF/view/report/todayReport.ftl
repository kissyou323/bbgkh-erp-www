<#import "reportMacro.ftl" as report>
<#include "../BasePage.ftl">
<#macro mhead>
<link href="${rsRoot}/data-picker/css/bootstrap-datetimepicker.css" rel="stylesheet" media="screen">
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
                    <@report.reportData infoPos />
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
<script type="text/javascript" src="${rsRoot}/data-picker/js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
<script type="text/javascript" src="${rsRoot}/data-picker/js/locales/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8"></script>
<script src="${rsRoot}js/report/report.js"></script>
</#macro>
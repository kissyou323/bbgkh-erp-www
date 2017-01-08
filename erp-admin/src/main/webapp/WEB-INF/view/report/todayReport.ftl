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

    </div>
<modify-data></modify-data>
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

        <tr v-for="(saleInfo,index) in reportInfos" class="odd gradeX">
            <td>{{index+1}}</td>
            <td id="productSysNo_">{{saleInfo.productSysNo}}</td>
            <td id="salePrice_" data-type="salePrice">{{saleInfo.salePrice}}</td>

            <td v-if="saleInfo.sex == 1">
                女裤
            </td>
            <td v-else>
                男裤
            </td>

            <td id="color_">{{saleInfo.color}}</td>
            <td id="size_">{{saleInfo.size}}</td>
            <td id="saleNum_">{{saleInfo.saleNum}}</td>
            <td >{{saleInfo.saleTime | time}}</td>
            <td>
                <button  v-on:click="modifySaleInfo(index)" data-value="" class="btn btn-outline btn-default" >修改</button>
            </td>
        </tr>

        </tbody>
    </table>
    </div>
</script>


<script type="text/x-template" id="modifyData-component" >
<div class="modal fade"  id="modifyModal">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                <h4 class="modal-title">修改数据</h4>
            </div>
            <div class="modal-body">


                <div class="row">

                    <div class="col-lg-5">

                        <div class="form-group">
                            <label>型号</label>
                            <input name="productSysNo" v-model="saleInfo.productSysNo" class="form-control" >

                        </div>
                    </div>
                    <div class="col-lg-5">

                        <div class="form-group">
                            <label>颜色</label>
                            <input name="color" v-model="saleInfo.color" class="form-control">
                        </div>
                    </div>
                    <div class="col-lg-5">

                        <div class="form-group">
                            <label>尺码</label>
                            <input name="size" v-model="saleInfo.size" class="form-control">
                        </div>
                    </div>
                    <div class="col-lg-5">

                        <div class="form-group">
                            <label>价格</label>
                            <input name="salePrice"  class="form-control" v-model="saleInfo.salePrice">
                        </div>
                    </div>
                    <div class="col-lg-5">

                        <div class="form-group">
                            <label>数量</label>
                            <input name="saleNum" v-model="saleInfo.saleNum" class="form-control">
                        </div>
                    </div>
                    <div class="col-lg-5">
                        <div class="form-group" id="sexValue" data-select="1">

                            <label class="radio-inline">
                                <input type="radio" name="sex" v-model="saleInfo.sex" id="sexValue_1" value="1" >女裤
                            </label>
                            <label class="radio-inline">
                                <input type="radio" name="sex" v-model="saleInfo.sex" id="sexValue_2" value="2">男裤
                            </label>

                        </div>
                    </div>

                </div>
                <div style="display: none;" id="addSuccess" class="alert col-lg-4 alert-success" role="alert">修改成功</div>
                <!-- /.row (nested) -->


            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" v-on:click="saveModify" class="btn btn-primary">保存修改</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
</script>
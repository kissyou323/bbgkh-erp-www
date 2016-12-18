<#include "../BasePage.ftl">
<#macro mhead>

</#macro>
<#macro mbody>
<div id="page-wrapper">
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">销售详情</h1>
        </div>
        <!-- /.col-lg-12 -->
    </div>
    <!-- /.row -->
    <div class="row">
        <div class="col-lg-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    请填写相关信息
                </div>
                <div class="panel-body">
                    <div class="row">

                            <div class="col-lg-5">

                                <div class="form-group">
                                    <label>型号</label>
                                    <input name="productSysNo" class="form-control" >

                                </div>
                            </div>
                            <div class="col-lg-5">

                                <div class="form-group">
                                    <label>颜色</label>
                                    <input name="color" class="form-control">
                                </div>
                            </div>
                            <div class="col-lg-5">

                                <div class="form-group">
                                    <label>尺码</label>
                                    <input name="size" class="form-control">
                                </div>
                            </div>
                            <div class="col-lg-5">

                                <div class="form-group">
                                    <label>价格</label>
                                    <input name="salePrice" class="form-control" value="1">
                                </div>
                            </div>
                            <div class="col-lg-5">
                                <div class="form-group" id="sexValue" data-select="1">

                                    <label class="radio-inline">
                                        <input type="radio" name="sex" id="sexValue_1" data-value="1" checked>女裤
                                    </label>
                                    <label class="radio-inline">
                                        <input type="radio" name="sex" id="sexValue_2" data-value="2">男裤
                                    </label>

                                    <input name="saleNum" class="form-group-sm" value="1">
                                    <label>数量</label>
                                </div>

                            </div>

                            <div class="col-lg-5">
                                <button id="submitSale" type="submit" class="col-lg-4 btn btn-primary">点我来提交</button>
                                <button type="reset" class="btn btn-default">重新输入</button>
                            </div>

                    </div>
                    <div style="display: none;" id="addSuccess" class="alert col-lg-4 alert-success" role="alert">成功添加</div>
                    <!-- /.row (nested) -->
                </div>
                <!-- /.panel-body -->
            </div>
            <!-- /.panel -->
        </div>
        <!-- /.col-lg-12 -->
    </div>
    <!-- /.row -->
</div>

<script src="${rsRoot}js/sale/sale.js"></script>
</#macro>
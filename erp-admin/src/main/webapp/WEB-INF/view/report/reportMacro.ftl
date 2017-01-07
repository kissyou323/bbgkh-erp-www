<#macro reportData infoPos>

</#macro>

<#--修改数据的框框-->
<#macro modifySaleInfo >
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
</#macro>



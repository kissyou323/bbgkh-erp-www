<#macro reportData infoPos>
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
        <th>销售数量</th>
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
            <td>
                <button  v-on:click="modifySaleInfo" data-value="${saleInfo.id}" class="btn btn-outline btn-default" >修改</button>
            </td>
        </tr>
        </#list>
    </tbody>
</table>
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



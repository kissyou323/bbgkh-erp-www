<#include "../BasePage.ftl">
<#macro mhead>

</#macro>
<#macro mbody>
<div id="page-wrapper">
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">补全老会员数据</h1>
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
                                <label>手机号</label>
                                <input v-model="oldMemberInfo.memberInfo.mobilePhone" class="form-control">
                            </div>
                        </div>

                        <div class="col-lg-5">

                            <div class="form-group">
                                <label>货号</label>
                                <input v-model="oldMemberInfo.saleInfo.productSysNo" class="form-control">
                            </div>
                        </div>

                        <div class="col-lg-5">

                            <div class="form-group">
                                <label>价格</label>
                                <input v-model="oldMemberInfo.saleInfo.salePrice" class="form-control">
                            </div>
                        </div>

                        <div class="col-lg-5">
                            <div class="form-group">
                                <button id="submitSale" v-on:click="addOldMemberInfo" type="submit" class="col-lg-4 btn btn-primary">点我来提交</button>
                            </div>
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

<script src="${rsRoot}js/member/member.js"></script>
</#macro>
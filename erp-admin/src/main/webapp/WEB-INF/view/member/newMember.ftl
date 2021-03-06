<#include "../BasePage.ftl">
<#macro mhead>

</#macro>
<#macro mbody>
<div id="page-wrapper">
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">会员信息</h1>
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
                                <label>姓名</label>
                                <input v-model="memberInfo.name" class="form-control" >

                            </div>
                        </div>
                        <div class="col-lg-5">

                            <div class="form-group">
                                <label>手机号</label>
                                <input v-model="memberInfo.mobilePhone" class="form-control">
                            </div>
                        </div>

                        <div class="col-lg-5">
                            <button id="submitSale" v-on:click="addMember" type="submit" class="col-lg-4 btn btn-primary">点我来提交</button>
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
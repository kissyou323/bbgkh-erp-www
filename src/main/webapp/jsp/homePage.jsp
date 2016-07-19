<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/7/18
  Time: 7:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/base.jsp"%>
<html>
<head>
    <title>homePage</title>
    <script src="${rootpath}/resource/js/project.js"></script>
</head>


<style>
    .col-center-block {
        float: none;
        display: block;
        margin-left: auto;
        margin-right: auto;
    }
</style>
<body>

<div class="container">
    用户ID为：${memberId}

    <div>
        <table id="project">
        </table>
        <div id="pager"></div>
    </div>

    <input id="addProject" type="button" class="btn btn-default" value="新增项目">
    <input id="addDetail" type="button" class="btn btn-default" value="新增明细" onclick="addDetail()">




    <div class="modal fade" id="detailModal">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">Modal title</h4>
                </div>
                <div class="modal-body">
                    <table id="detail"></table>
                    <div id="detailpager"></div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->






    <div id="addDetailModal" class="modal fade" role="dialog" aria-labelledby="gridSystemModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="gridSystemModalLabel">新增明细</h4>
                </div>
                <div class="modal-body">

                    <form  class="form-horizontal">

                        <div class="form-group">
                            <h3 class="col-md-offset-5">新增明细</h3>
                        </div>
                        <div class="form-group">
                            <label for="selectProject" class="col-md-offset-4">项目：</label>
                            <select id="selectProject" class="">
                                <option>日本</option>
                                <option>日常</option>
                                <option>化妆品</option>
                                <option>这个试一个长一点的</option>
                                <option>5</option>
                            </select>
                        </div>
                        <div class="form-group"><label for="amount" class="col-md-offset-4">金额：</label><input type="text" id="amount"></div>
                        <div class="form-group"><label for="remark" class="col-md-offset-4">备注：</label><input type="text" id="remark"></div>
                    </form>
                </div>

                <div class="modal-footer">
                    <button type="button" class="btn btn-primary">保存</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->
</div>





</body>
</html>

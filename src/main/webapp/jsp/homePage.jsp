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
<body>

<div class="container">
    用户ID为：${memberId}

    <div>
        <table id="project">
        </table>
        <div id="pager"></div>
    </div>

    <input id="addProject" type="button" class="btn btn-default" value="新增项目">
    <input type="button" class="btn btn-default" value="查看所有明细">
    <input type="button" class="btn btn-default" value="新增明细">




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
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary">Save changes</button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->
</div>





</body>
</html>

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


    <input type="button" class="btn btn-default" value="查看所有项目">
    <input type="button" class="btn btn-default" value="新增项目">
    <input type="button" class="btn btn-default" value="查看所有明细">
    <input type="button" class="btn btn-default" value="新增明细">
</div>


</body>
</html>

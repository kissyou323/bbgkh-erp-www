<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/7/17
  Time: 13:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <c:set var="rootpath" value="${pageContext.request.contextPath}"/>
    <script src="${rootpath}/resource/js/jquery-2.0.3.min.js"></script>

 <%--   <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/dt/dt-1.10.12/datatables.min.css"/>
    <script type="text/javascript" src="https://cdn.datatables.net/v/dt/dt-1.10.12/datatables.min.js"></script>--%>

    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="${rootpath}/resource/bootstrap/css/bootstrap.css">

    <!-- 可选的Bootstrap主题文件（一般不用引入） -->
    <link rel="stylesheet" href="${rootpath}/resource/bootstrap/css/bootstrap-theme.css">

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="${rootpath}/resource/bootstrap/js/bootstrap.js"></script>



    <link rel="stylesheet" href="${rootpath}/resource/jquery-ui-1.12.0/jquery-ui.min.css">
    <link rel="stylesheet" href="${rootpath}/resource/jquery-ui-1.12.0/jquery-ui.theme.min.css">


    <link rel="stylesheet" href="${rootpath}/resource/jqgrid/css/ui.jqgrid.css">

    <script src="${rootpath}/resource/jqgrid/js/i18n/grid.locale-en.js"></script>

    <script src="${rootpath}/resource/jqgrid/js/jquery.jqGrid.min.js"></script>

    <script src="${rootpath}/resource/js/base.js"></script>

</head>

</html>


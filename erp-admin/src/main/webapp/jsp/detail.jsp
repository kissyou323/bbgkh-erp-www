<%--
  Created by IntelliJ IDEA.
  User: lixiang
  Date: 2016/7/18
  Time: 9:58
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/base.jsp"%>
<html>
<head>
    <title>Detail</title>
    <script src="${rootpath}/resource/js/detail.js"></script>
</head>
<body>

<div class="col-lg-6 col-lg-offset-3">

    <table id="detail" class="display" cellspacing="0" width="100%">
        <thead>
        <tr>
            <td>id</td>
            <td>productid</td>
            <td>inorout</td>
            <td>amount</td>
            <td>remark</td>
            <td>time</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="detail" items="${details}">
            <tr>
                <td>${detail.id}</td>
                <td>${detail.projectid}</td>
                <td>${detail.inorout}</td>
                <td>${detail.amount}</td>
                <td>${detail.remark}</td>
                <td>${detail.time}</td>
            </tr>
        </c:forEach>
        </tbody>

    </table>
</div>

</body>
</html>

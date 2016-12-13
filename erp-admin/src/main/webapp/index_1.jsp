<%--
  Created by IntelliJ IDEA.
  User: lixiang
  Date: 2016/7/16
  Time: 14:50
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="base.jsp"%>
<html>
  <head>
    <script src="${rootpath}/resource/js/login.js"></script>
    <title>home</title>
  </head>
  <body>
  <a href="${rootpath}/shopping">View Cart</a>
  <div class="container" align="center">
    <h1 style="padding-top: 200px">登录</h1>
    <div class="col-lg-4 col-lg-offset-4">
      <input type="text" id="name"  placeholder="name" value="" onkeyup="keyup()">
    </div>

  </div>
  </body>
</html>

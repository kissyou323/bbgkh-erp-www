<!DOCTYPE html>
<html lang="en">

<head>

    <meta name="Keywords" content="步步高裤行在线管理">
    <meta name="description" content="步步高裤行在线管理">
    <meta content="yes" name="apple-mobile-web-app-capable" />
    <meta content="black" name="apple-mobile-web-app-status-bar-style" />
    <meta content="telephone=no" name="format-detection" />
    <meta name="applicable-device" content="mobile" />
    <meta http-equiv="Cache-Control" content="no-transform " />

    <title>步步高裤行在线管理</title>

    <!-- Bootstrap Core CSS -->
    <link href="${rsRoot}vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="${rsRoot}vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="${rsRoot}dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="${rsRoot}vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <script> var webRoot ="/bbgkh"</script>

</head>

<body>

<div class="container" id="divController">
    <div class="row">
        <div class="col-md-4 col-md-offset-4">
            <div class="login-panel panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">请登录</h3>
                </div>
                <div class="panel-body">

                        <fieldset>
                            <div class="form-group">
                                <input class="form-control" id="userName" placeholder="用户名" v-model="customerInfo.name" type="text" autofocus>
                            </div>
                            <div class="form-group">
                                <input class="form-control"  id="password" placeholder="密码"  v-model="customerInfo.password" type="password" value="">
                            </div>
                            <!-- Change this to a button or input when using this as a form -->
                        </fieldset>
                    <div class="row">
                        <div class="col-lg-9">
                            <a href="javascript:;" id="loginButton" v-on:click="login" class=" btn btn-lg btn-success btn-block">登录</a>
                        </div>
                        <div class="col-lg-3">
                            <a href="javascript:;" id="registerButton" class=" btn btn-lg btn-default btn-block">注册</a>
                        </div>
                    </div>
                </div>

            </div>

        </div>
    </div>

</div>

<!-- jQuery -->
<script src="${rsRoot}vendor/jquery/jquery.min.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="${rsRoot}vendor/bootstrap/js/bootstrap.min.js"></script>

<!-- Metis Menu Plugin JavaScript -->
<script src="${rsRoot}vendor/metisMenu/metisMenu.min.js"></script>

<!-- Custom Theme JavaScript -->
<script src="${rsRoot}dist/js/sb-admin-2.js"></script>

<script src="${rsRoot}dist/js/vue.js"></script>

<script src="${rsRoot}js/home.js"></script>

</body>

</html>

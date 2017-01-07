<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>步步高裤行在线管理</title>
    <meta name="Keywords" content="步步高裤行在线管理">
    <meta name="description" content="步步高裤行在线管理">
    <meta content="yes" name="apple-mobile-web-app-capable" />
    <meta content="black" name="apple-mobile-web-app-status-bar-style" />
    <meta content="telephone=no" name="format-detection" />
    <meta name="applicable-device" content="mobile" />
    <meta name="viewport" content="minimal-ui=yes,width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no">
    <meta http-equiv="Cache-Control" content="no-transform " />
    <!-- Bootstrap Core CSS -->
    <link href="${rsRoot}vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="${rsRoot}vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="${rsRoot}dist/css/sb-admin-2.min.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="${rsRoot}vendor/morrisjs/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="${rsRoot}vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <!-- jQuery -->
    <script src="${rsRoot}vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="${rsRoot}vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="${rsRoot}vendor/metisMenu/metisMenu.js"></script>

    <!-- Morris Charts JavaScript -->
<#--<script src="${rsRoot}vendor/raphael/raphael.js"></script>-->
<#--<script src="${rsRoot}vendor/morrisjs/morris.js"></script>-->
<#--<script src="${rsRoot}data/morris-data.js"></script>-->

    <!-- Custom Theme JavaScript -->
    <script src="${rsRoot}dist/js/sb-admin-2.min.js"></script>

    <script src="${rsRoot}dist/js/vue.js"></script>
    <script> var webRoot ="/bbgkh"</script>
<@mhead/>
</head>
<body>

<div id="divController">
    <!-- Navigation -->
    <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="${webRoot}/home/mainDash">步步高裤行在线管理</a>
        </div>
        <!-- /.navbar-header -->
        <#--右上角的东西-->
        <ul class="nav navbar-top-links navbar-right">
            <!-- /.dropdown -->
            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="javascript:;">
                    <i class="fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i>
                </a>
                <ul class="dropdown-menu dropdown-user">
                    <li><a href="javascript:;"><i class="fa fa-user fa-fw"></i> 个人设置</a>
                    </li>
                    <li class="divider"></li>
                    <li><a href="login.html"><i class="fa fa-sign-out fa-fw"></i> 退出登录</a>
                    </li>
                </ul>
                <!-- /.dropdown-user -->
            </li>
            <!-- /.dropdown -->
        </ul>
        <#--右上角的东西结束-->

        <div class="navbar-default sidebar" role="navigation">
            <div class="sidebar-nav navbar-collapse">
                <ul class="nav" id="side-menu">
                    <li class="sidebar-search">
                        <div class="input-group custom-search-form">
                            <input type="text" class="form-control" placeholder="Search...">
                            <span class="input-group-btn">
                                <button class="btn btn-default" type="button">
                                    <i class="fa fa-search"></i>
                                </button>
                            </span>
                        </div><!-- /input-group -->
                    </li>
                    <li>
                        <a href="${webRoot}/home/mainDash"><i class="fa fa-dashboard fa-fw"></i>主面板</a>
                    </li>
                    <li>
                        <a href="${webRoot}/replenish/newReplenish"><i class="fa fa-dashboard fa-fw"></i>进货</a>
                    </li>
                    <li>
                        <a href="${webRoot}/sale/newSalePage"><i class="fa fa-dashboard fa-fw"></i>卖货</a>
                    </li>
                    <li>
                        <a href="${webRoot}/report/todayReport"><i class="fa fa-dashboard fa-fw"></i>今日销售</a>
                    </li>
                </ul>
            </div>
            <!-- /.sidebar-collapse -->
        </div>
        <!-- /.navbar-static-side -->
    </nav>


    <@mbody/>
    <!-- /#page-wrapper -->

</div>
<!-- /#wrapper -->



</body>
</html>
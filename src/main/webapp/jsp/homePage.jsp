<%--
  Created by lixiang.
  User: lixiang
  Date: 2016/7/18
  Time: 7:40
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

    <input type="button" id="income" class="btn btn-default" value="收入"  data-toggle="modal" data-target="#incomeModal">
    <input id="addProject" type="button" class="btn btn-default" value="新增项目" data-toggle="modal" data-target="#addProjectModal">
    <input id="addDetail" type="button" class="btn btn-default" value="新增明细"  data-toggle="modal" data-target="#addDetailModal">




    <div class="modal fade" id="detailModal">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">明细列表</h4>
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
                                <c:forEach items="${sessionScope.get('projects')}" var="project">
                                    <option value="${project.id}">${project.remark}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="form-group"><label for="amount" class="col-md-offset-4">金额：</label><input type="text" id="amount"></div>
                        <div class="form-group"><label for="remark" class="col-md-offset-4">备注：</label><input type="text" id="remark"></div>
                    </form>
                </div>

                <div class="modal-footer">
                    <button type="button" class="btn btn-primary" onclick="saveDetail()">保存</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->
    <div id="addProjectModal" class="modal fade" role="dialog" aria-labelledby="gridSystemModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" >新增项目</h4>
                </div>
                <div class="modal-body">

                    <form  class="form-horizontal">

                        <div class="form-group">
                            <h3 class="col-md-offset-5">新增项目</h3>
                        </div>
                        <div class="form-group"><label for="amount" class="col-md-offset-4">项目金额：</label><input type="text" id="Ptotal"></div>
                        <div class="form-group"><label for="remark" class="col-md-offset-4">项目备注：</label><input type="text" id="Premark"></div>
                        <div class="form-group"><label for="distribute" class="col-md-offset-4">分配比例：</label><input type="text" id="distribute"></div>
                    </form>
                </div>

                <div class="modal-footer">
                    <button type="button" class="btn btn-primary" onclick="saveProject()">保存</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->


    <div id="incomeModal" class="modal fade" role="dialog" aria-labelledby="gridSystemModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="">收入</h4>
                </div>
                <div class="modal-body">
                    <label for="incomeMoney" class="col-md-offset-2">新增金额数:</label>
                    <input id="incomeMoney" type="text">
                </div>

                <div class="modal-footer">
                    <button type="button" class="btn btn-primary" onclick="income()">保存</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->
</div>





</body>
</html>

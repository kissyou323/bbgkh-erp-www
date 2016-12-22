<#macro reportData infoPos>
<div class="row">
    <div  class="alert alert-success col-md-2" role="alert">总销售额：<p id="totalAmount"></p></div>
</div>
<table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
    <thead>
    <tr>
        <th>编号</th>
        <th>货号</th>
        <th>售价</th>
        <th>男/女</th>
        <th>颜色</th>
        <th>尺码</th>
        <th>销售数量</th>
        <th>销售时间</th>

    </tr>
    </thead>
    <tbody>
        <#list infoPos as saleInfo>
        <tr class="odd gradeX">
            <td>${saleInfo_index+1}</td>
            <td>${saleInfo.productSysNo!''}</td>
            <td data-type="salePrice">${saleInfo.salePrice}</td>
            <#if saleInfo.sex==1>
                <td>女裤</td>
            <#else >
                <td>男裤</td>
            </#if>

            <td>${saleInfo.color!''}</td>
            <td>${saleInfo.size!''}</td>
            <td>${saleInfo.saleNum}</td>
            <td>${saleInfo.saleTime}</td>
        </tr>
        </#list>
    </tbody>
</table>
</#macro>



<%@page import="com.cnfantasia.server.common.CommConstants"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://displaytag.sf.net/el" prefix="display"%>
<%
	response.setHeader("Pragma","No-cache");    
	response.setHeader("Cache-Control","no-cache");    
	response.setDateHeader("Expires", -10);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>万能插客户端黑名单管理</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/common.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
		<style>
			.icon_dt{background: #fff url(${pageContext.request.contextPath}/images/icon_dt.jpg) no-repeat 150px 3px;}
			.w180{width: 170px;}
		</style>
	</head>
	<body>
		<div class="info">
		    <h2>万能插客户端黑名单管理</h2>
		    <div class="bs-example bgebeb">
		    	<form method="post" action="${pageContext.request.contextPath}/accessLink/queryBlackLists.html">
			        <table class="info-list" border="0">
			          <tr>
			            <td><div class="list-name">添加时间：</div></td>
			            <td>
			            	<input type="text" id="startTime" name="startTime" title="请选择起始时间" value="${param.startTime}" placeholder="请选择起始时间" onclick="WdatePicker({dateFmt: 'yyyy-MM-dd HH:mm:ss'});" class="input_text pp w180 icon_dt pp">
			            	至 
			            	<input type="text" id="endTime" name="endTime" title="请选择结束时间" value="${param.endTime}" placeholder="请选择结束时间" onclick="WdatePicker({dateFmt: 'yyyy-MM-dd HH:mm:ss'});" class="input_text pp w180 icon_dt pp">
						</td>
						<td>
							<input class="info-btn small-btn w150" type="submit" value="查 询">
						</td>
			          </tr>
			        </table>
		        </form>
		    </div>
		    <display:table name="balckLists" uid="row" id="row" class="mars info-list-02 mtop20" pagesize="10" requestURI="" partialList="true" size="total" >
				<display:column style="text-align:center;" headerClass="t_center" title="内容" property="content"/>
				<display:column style="text-align:center;" headerClass="t_center" title="类型">
					<c:choose>
						<c:when test="${row.type eq 1}">易豪生客户端</c:when>
					</c:choose>
				</display:column>
				<display:column style="text-align:center;" headerClass="t_center" title="添加时间" property="sys0AddTime"/>
				<display:column style="text-align:center;" headerClass="t_center" title="修改时间" property="sys0UpdTime"/>
				<display:column style="text-align:center;" headerClass="t_center" title="添加人" property="addMan"/>
				<display:column style="text-align:center;" headerClass="t_center" title="修改人" property="updateMan"/>
				<display:column style="text-align:center;" headerClass="t_center" title="操作">
					<a class="blue" href="javascript:void(0);" onclick="removeBlackList('${row.id}','${row.content}', this);">删除</a>
				</display:column>
			</display:table>
		</div>
	</body>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.2.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/Validform_v5.3.2.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.common.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/datePicker/WdatePicker.js"></script>
	<script type="text/javascript">
		function removeBlackList(id, content, o){
			if(confirm("确定要从黑名单中移除【"+content+"】吗？")){
				$.post("${pageContext.request.contextPath}/accessLink/removeBlackList.html", {"blackListId":id, "remoteIp":content}, function(data){
					if(data.status == '<%=CommConstants.ResponseStatus.SUCCESS%>') {
						$(o).parent().parent().remove();
					}
					alert(data.message);
				});
			}
		}
	</script>
</html>
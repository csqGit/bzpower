<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>失物招领</title>
<script type="text/javascript" src="<%=path %>/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="<%=path %>/js/page/swzl.js"></script>
<script type="text/javascript" src="<%=path %>/js/jquery-3.3.1.min.js"></script>
<link rel="stylesheet" type="text/css" href="<%=path %>/css/page/swzl.css">
</head>
<body>
	<jsp:include page="../top.jsp"></jsp:include>

	<div id="box">
		<table align="center" cellpadding="0" cellspacing="0">
			<tr>
				<th>编号</th>
				<th>失物名称</th>
				<th>失物类型</th>
				<th>丢失时间</th>
				<th>认领时间</th>
				<th>联系电话</th>
				<th>认领人</th>
				<th>认领状态</th>
			</tr>
			<c:forEach items="${goodList }" var="good">
				<tr>
					<td>${good.id }</td>
					<td>${good.name }</td>
					<td>${good.type }</td>
					<td>${good.lostTime }</td>
					<td>${good.returnTime }</td>
					<td>${good.contact }</td>
					<td>${good.getPerson }</td>
					<c:if test="${good.state==1 }">
						<td style="color: gree">未认领</td>
					</c:if>
					<c:if test="${good.state==0 }">
						<td style="color: red">已认领</td>
					</c:if>
				</tr>
			</c:forEach>
		</table>
		<ul class="page">
			<li><span id="firstPage">首页</span></li>
			<li><span id="prePage">上一页</span></li>
			<li><span id="nextPage">下一页</span></li>
			<li><span id="lastPage">尾页</span></li>
			<li><span>当前页:&nbsp;&nbsp;<font id="currentPage">${curPage }</font></span></li>
			<li><span>共计：&nbsp;&nbsp;<font id="pages">${page }</font></span></li>
		</ul>
	</div>
	<span id="return"><a href="<%=path%>/index.jsp">返回首页</a></span>
	<jsp:include page="../foot.jsp"></jsp:include>

</body>
</html>
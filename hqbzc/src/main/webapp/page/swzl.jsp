<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page isELIgnored="false" %>
    <%
    	String path = request.getContextPath();
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>失物招领</title>
<script type="text/javascript" src="../js/jquery-3.3.1.min.js"></script>
<style type="text/css">
#box{
	position:relative;
	top:80px;
	width:1000px;
	height:500px;
 	border:1px solid rgb(234,234,234); 
	margin:10px auto;
}
table {
	width:1000px;
	border:1px solid rgb(234,234,234);
	border-top:none;
}
table tr{
	width:100%;
	height:50px;
	text-align:center;
	padding:0;
	margin:0;
}

table tr th,table tr td{
	border:1px solid rgb(234,234,234);
	border-width:1px 1px 0px 0;
}

font{
	display:block;
	width:100%;
	height:50px;
	line-height:50px;
}
font:hover{
	background: rgb(243,243,243);
	color: blue;
}

#return{
	position: fixed;
	top:90px;
	float:right;
	right:7%;
}
</style>

</head>
<body>
	<jsp:include page="../top.jsp"></jsp:include>
	<span id="return"><a href="<%=path%>/index.jsp">返回首页</a></span>
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
					<c:if test="${good.state==1 }"><td>未认领</td></c:if>
					<c:if test="${good.state==0 }"><td>已认领</td></c:if>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="2"><font id="first">首页</font></td>
				<td><font id="pre">上一页</font></td>
				<td><font><span id="currentPage">${curPage }</span>/<span id="page">${page }</span></font></td>
				<td><font id="next">下一页</font></td>
				<td><font id="last">尾页</font></td>
				<td colspan="2"><font>共${page }页</font></td>
			</tr>
		</table>
	</div>
	<jsp:include page="../foot.jsp"></jsp:include>
	<script type="text/javascript">
		$(function(){
			var curPageStr = $("#currentPage").text();
			var pageStr = $("#page").text();
			var curPage = parseInt(curPageStr);
			var page = parseInt(pageStr);
			$("#first").click(function(){
				if(curPage == 1)
					return false;
				window.location.href="getGoodList?startPosition=1";
			});
			$("#pre").click(function(){
				if(curPage > 1)
					curPage --;
				window.location.href="getGoodList?startPosition=" + curPage;
			});
			$("#next").click(function(){
				if(curPage < page)
					curPage ++;
				window.location.href="getGoodList?startPosition=" + curPage;
			});
			$("#last").click(function(){
				if(curPage == page)
					return false;
				window.location.href="getGoodList?startPosition=" + page;
			});
		})
	</script>
</body>
</html>
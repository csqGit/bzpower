<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta charset="utf-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<title>空闲教室查询</title>

<script type="text/javascript" src="<%=path%>/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="<%=path%>/js/page/freeClass.js"></script>
<script src="<%=path%>/layui/layui.js" charset="utf-8"></script>
<link rel="stylesheet" href="<%=path%>/css/public.css" type="text/css">
<link rel="stylesheet" href="<%=path%>/css/page/freeClass.css" type="text/css">
<link rel="stylesheet" href="<%=path%>/layui/css/layui.css" media="all">
</head>
<body>
	<!-- head start -->
	<jsp:include page="../top.jsp"></jsp:include>
	<!-- head end -->
	<div id="box" style="margin: 10px auto; width: 1200px;">
		<div id="box-left">
			<ul class="ul">
				<li class="type" value="逸夫楼"><a href="javascript:void(1)" onclick="get('逸夫楼')">逸夫楼</a></li>
				<li class="type" value="电信楼"><a href="javascript:void(1)" onclick="get('电信楼')">电信楼</a></li>
				<li class="type" value="能源楼"><a href="javascript:void(1)" onclick="get('能源楼')">能源楼</a></li>
				<li class="type" value="能源楼"><a href="javascript:void(0)" onclick="get('外语楼')">外语楼</a></li>
				<li class="type" value="外语楼"><a href="javascript:void(0)" onclick="get('化工楼')">化工楼</a></li>
				<li class="type" value="化工楼"><a href="javascript:void(0)" onclick="get('生物楼')">生物楼</a></li>
			</ul>
		</div>
		<div id="box-right">
			<table id="table">
			<thead style="background: rgb(245, 245, 245)">
				<tr>
					<td>时间&nbsp;&nbsp;/&nbsp;&nbsp;星期</td>
					<td>一</td>
					<td>二</td>
					<td>三</td>
					<td>四</td>
					<td>五</td>
					<td>六</td>
					<td>七</td>
				</tr>
				</thead>
			</table>
		</div>
	</div>
	
<div id="return"><a href="<%=path %>/index.jsp">返回首页</a></div>
	<!-- 版权 -->
	<div class="copy">
		<p></p>
		<p>陇东学院所有</p>
		<p></p>
	</div>
</body>
</html>
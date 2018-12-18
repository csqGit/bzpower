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
<title>后勤故障报修</title>
<link rel="stylesheet" href="<%=path%>/layui/css/layui.css" media="all">
<script type="text/javascript" src="<%=path%>/js/jquery-3.3.1.min.js"></script>
<script src="<%=path%>/layui/layui.js" charset="utf-8"></script>
<link rel="stylesheet" href="<%=path%>/css/public.css" type="text/css">
<link rel="stylesheet" href="<%=path%>/css/page/class.css"
	type="text/css">

<style type="text/css">
#box {
	margin: 0 auto;
	width: 850px;
	height: 600px;
}

#box-left {
	width: 150px;
	border: 1px solid rgb(234, 234, 234);
	border-bottom: none;
	float: left;
}

#box-left ul li {
	height: 50px;
	line-height: 50px;
	padding-left: 20px;
	border-bottom: 1px solid rgb(234, 234, 234);
}

#box-left ul li:hover {
	background: rgb(234, 234, 234);
	color: gray;
	cursor: pointer;
}

#box-right {
	width: 660px;
	margin-right: 10px;
	float: right;
}

#table {
	margin: 0 auto;
	width: 660px;
	background: white;
}

table tr {
	border: 1px solid rgb(234, 234, 234);
	text-align: center;
	height: 50px;
}

table tr td {
	border: 1px solid rgb(234, 234, 234);
	width: 160px;
}

#bottom {
	position: relative;
	top: 10px;
	left: 180px;
	width: 660px;
	height: 50px;
	border: 1px solid rgb(234, 234, 234);
	clear: both;
}

#bottom li {
	float: left;
	width: 132px;
	height: 50px;
	line-height: 50px;
	text-align: center;
}

#bottom li:hover {
	background: rgb(234, 234, 234);
	color: gray;
	cursor: pointer;
}

#return{
	position: fixed;
	top:90px;
	right:8%;
	width:100px;
	height:30px;
}
</style>
<script type="text/javascript">
	$(function() {
		var num = 1;
		$(".info").click(function() {
			var valStr = $(this).val();
			var val = parseInt(valStr);
			location.href = "getFreeClass?page=1&classid=" + valStr;
		});

		var currentStr = $("#current").text();
		var pages = $("#page").text();
		var current = parseInt(currentStr);
		var page = parseInt(pages);
		$("#first").click(function() {
			location.href = "getFreeClass?page=1&classid=" + num;
		});
		$("#current").click(function() {
			if (current == 1) {
				return false;
			}
			current--;
			location.href = "getFreeClass?page=" + current + "&classid=" + num;
		});
		$("#next").click(function() {
			alert(num);
			if (current == page)
				return false;
			current++;
			location.href = "getFreeClass?page=" + current + "&classid=" + num;
		});
		$("#last").click(function() {
			alert(num);
			if (current == page) {
				return false;
			}
			current++;
			location.href = "getFreeClass?page=" + current + "&classid=" + num;
		});
	})
</script>
</head>
<body>
	<!-- head start -->
	<div class="head">
		<img alt="" src="<%=path%>/images/u19.png" class="head-img" /><span
			id="logo">陇东学院后勤保障处</span>
		<ul class="head-li">
			<li><a href="http://www.ldxy.edu">学校首页</a></li>
			<li><a href="">新闻通知</a></li>
			<li><a href="">全部功能</a></li>
			<li><a href="">智慧后勤</a></li>
			<li><a href="">关于我们</a></li>
		</ul>
	</div>
	<!-- head end -->
<div id="return"><a href="<%=path %>/index.jsp">返回首页</a></div>
	<div id="box">
		<div id="box-left">
			<ul>
				<li class="info" value="1">逸夫楼</li>
				<li class="info" value="2">电信楼</li>
				<li class="info" value="3">能源楼</li>
				<li class="info" value="4">外语楼</li>
				<li class="info" value="5">化工楼</li>
				<li class="info" value="6">生物楼</li>
			</ul>
		</div>
		<div id="box-right">
			<table id="table">
				<tr>
					<td>编号</td>
					<td>教室名称</td>
					<td>教室地址</td>
					<td>教室状态</td>
				</tr>
				<c:forEach items="${freeClass }" var="free">
					<tr>
						<td>${free.id }</td>
						<td>${free.className }</td>
						<td>${free.classAddress }</td>
						<c:if test="${free.classState==0 }">
							<td>占用</td>
						</c:if>
						<c:if test="${free.classState==1 }">
							<td>空闲</td>
						</c:if>
					</tr>
				</c:forEach>

			</table>
		</div>

		<ul id="bottom">
			<li id="first">首页</li>
			<li id="prePage">上一页</li>
			<li><span id="current">1</span>/<span id="page">2</span></li>
			<li id="next">下一页</li>
			<li id="last">尾页</li>
		</ul>

	</div>
	<!-- 版权 -->
	<div class="copy">
		<p></p>
		<p>陇东学院所有</p>
		<p></p>
	</div>
</body>
</html>
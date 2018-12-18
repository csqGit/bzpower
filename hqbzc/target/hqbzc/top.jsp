<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>陇东学院后勤管理</title>

<!-- layui的css -->
<link rel="stylesheet" href="layui/css/layui.css" media="all">
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<script src="layui/layui.js" charset="utf-8"></script>
<script src="js/index.js" charset="utf-8"></script>
<style type="text/css">
.layui-table, .layui-table-view {
	margin: 0;
}


* {
	margin: 0px;
	padding: 0;
	font-size: 15px;
	list-style-type: none;
}

.head {
	width: 100%;
	height: 80px;
	background: black;
	position: fixed;
	z-index: 1000;
}

a {
	text-decoration: none;
	color: black;
}

.head-img {
	width: 40px;
	height: 40px;
	display: block;
	margin-top: 20px;
	margin-left: 100px;
	float: left;
}

#logo, .head-li li {
	color: white;
	text-align: center;
}

#logo {
	display: block;
	float: left;
	color: white;
	height: 80px;
	line-height: 80px;
	font-size: 30px;
	padding-left: 20px;
}

.head-li {
	width: 600px;
	height: 80px;
	margin-left: 50px;
	line-height: 80px;
	float: left;
}

.head-li a:link {
	font-size: 20px;
	color: white;
}

.head-li a:visited {
	color: white;
}

.head-li a:hover {
	color: orange;
	transaction: font-size 0.2s, color 0.5s;
}

.head-li li {
	width: 100px;
	height: 80px;
	color: white;
	margin-left: 10px;
	float: left;
}

</style>
</head>
<body>
	<!-- head start -->
	<div class="head">
		<img alt="" src="<%=path %>/images/u19.png" class="head-img" /><span id="logo">陇东学院后勤保障处</span>
		<ul class="head-li">
			<li><a href="http://www.ldxy.edu">学校首页</a></li>
			<li><a href="">新闻通知</a></li>
			<li><a href="">全部功能</a></li>
			<li><a href="">智慧后勤</a></li>
			<li><a href="">关于我们</a></li>
		</ul>
	</div>

</body>
</html>
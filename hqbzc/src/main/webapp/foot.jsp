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
/*版权*/
.copy {
	position:relative;
	top:80px;
	width: 1200px;
	height: 100px;
	padding: 10px;
	background: rgb(234, 234, 234);
	margin: 0 auto;
	clear:both;
}

.copy p {
	width: 800px;
	height: 33px;
	margin: 0 auto;
	text-align: center;
	color: gray;
}
</style>
</head>
<body>
	<!-- 版权 -->
	<div class="copy">
		<p></p>
		<p>陇东学院所有</p>
		<p></p>
	</div>
</body>
</html>
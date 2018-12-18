<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<style type="text/css">
* {
	position: relative;
}
body{
	background: rgb(234, 234, 234);
}

.btn {
	width: 70px;
	height: 40px;
	margin-left: 20px;
	float: left;
}

#button {
	width: 200px;
	height: 50px;
	margin-left: 25%;
}

.layui-form {
	position: relative;
	top: 90px;
	width: 500px;
	height: 490px;
	margin: 0 auto;
	padding: 10px;
	background:white;
	border: 1px solid rgb(234, 234, 234);
}

.info {
	width: 100%;
	height: 50px;
	line-height: 50px;
	font-size: 20px;
	color: white;
	text-align: center;
	background: #8babf1;
}

.layui-btn {
	background-color: #8babf1;
}

/*版权*/
.copy {
	position: relative;
	top: 70px;
	width: 1200px;
	height: 100px;
	padding: 10px;
	background: white;
	margin: 0 auto;
}

.copy p {
	width: 800px;
	height: 33px;
	margin: 0 auto;
	text-align: center;
}

#test1 {
	position: relative;
	top: 0;
	width: 390px;
	height: 50px;
}

#return{
	position: fixed;
	top:90px;
	right:10%;
	display:block;
	width:100px;
	height:30px;
	margin:0 auto;
	padding:10px;
	clear:both;
}
#msg{
	position:relative;
	top:-40px;
	left:170px;
	width:100px;
	height:30px;
	display:block;
	margin:0 auto;
}

</style>

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
	
	<form class="layui-form" id="form" action="<%=path %>/saveRepairInfo" method="post">
		<p class="info">请填写以下信息</p>

		<div class="layui-form-item">
			<label class="layui-form-label"></label>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">报修人姓名</label>
			<div class="layui-input-block">
				<input type="text" name="repair_name" lay-verify="name"
					autocomplete="off" placeholder="报修人姓名" class="layui-input">
			</div>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">报修类型</label>
			<div class="layui-input-block">
				<input type="text" name="repair_type" lay-verify="gender"
					autocomplete="off" placeholder="报修类型" class="layui-input">
			</div>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">报修时间</label>
			<div class="layui-input-block">
				<input type="text" name="time" class="layui-input" id="test1"
					placeholder="yyyy-MM-dd">
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">报修地址</label>
			<div class="layui-input-block">
				<input type="text" name="repair_address" lay-verify="gender"
					autocomplete="off" placeholder="报修地址" class="layui-input">
			</div>
		</div>

		<div class="layui-form-item layui-form-text">
			<label class="layui-form-label">报修内容</label>
			<div class="layui-input-block">
				<textarea name="content" placeholder="请输入报修原因"
					class="layui-textarea"></textarea>
			</div>
		</div>
		
		<div id="button">
			<div class="btn">
				<div class="layui-form-item">
					<button class="layui-btn" lay-submit="" lay-filter="demo2" onclick="submit()">提交</button>
				</div>
			</div>
			<div class="btn">
				<div class="layui-form-item">
					<input type="reset" class="layui-btn" />
				</div>
			</div>
		</div>
	</form>
	<a href="<%=path%>/index.jsp" id="return">返回首页</a>
	
<span id="msg"><c:if test="${msg!=null }">${msg }</c:if></span>
	<!-- 版权 -->
	<div class="copy">
		<p></p>
		<p>陇东学院所有</p>
		<p></p>
	</div>


	<script>
	layui.use('laydate', function(){
		  var laydate = layui.laydate;
		  
		  //常规用法
		  laydate.render({
		    elem: '#test1'
		  });
		  laydate.render({
		    elem: '#test-n4'
		    ,type: 'time'
		    ,position: 'static'
		  });
		});
	</script>
</body>
</html>
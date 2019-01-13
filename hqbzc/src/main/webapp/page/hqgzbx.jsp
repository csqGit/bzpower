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
<link rel="stylesheet" href="<%=path%>/css/page/hqgzbx.css" type="text/css">
</head>
<body>
	<!-- head start -->
	<jsp:include page="../top.jsp"></jsp:include>
	
	<!-- head end -->
	
	<form class="layui-form" id="form" action="" method="post">
		<p class="info">请填写以下信息</p>

		<div class="layui-form-item">
			<label class="layui-form-label"></label>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">报修人姓名</label>
			<div class="layui-input-block">
				<input id="repair_name" type="text" name="repair_name" lay-verify="name"
					autocomplete="off" placeholder="报修人姓名" class="layui-input">
			</div>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">报修类型</label>
			<div class="layui-input-block">
				<input id="repair_type" type="text" name="repair_type" lay-verify="gender"
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
				<input id="repair_address" type="text" name="repair_address" lay-verify="gender"
					autocomplete="off" placeholder="报修地址" class="layui-input">
			</div>
		</div>

		<div class="layui-form-item layui-form-text">
			<label class="layui-form-label">报修内容</label>
			<div class="layui-input-block">
				<textarea id="content" name="content" placeholder="请输入报修原因"
					class="layui-textarea"></textarea>
			</div>
		</div>
		
		<div id="button">
			<div class="btn">
				<div class="layui-form-item">
					<button id="submit" class="layui-btn" lay-submit="" lay-filter="demo2">提交</button>
				</div>
			</div>
			<div class="btn">
				<div class="layui-form-item">
					<input type="reset" class="layui-btn" />
				</div>
			</div>
		</div>
<span id="msg"> <c:if test="${msg!=null }">${msg }</c:if></span>
	</form>
	<div id="return"><a href="<%=path%>/index.jsp" id="return">返回首页</a></div>
	
	<!-- 版权 -->
	<jsp:include page="../foot.jsp"></jsp:include>
	<script>
	
	$(function(){
		$("#submit").click(function(){
			var repair_name = $("#repair_name").val();
			var repair_type = $("#repair_type").val();
			var time = $("#test1").val();
			var address = $("#repair_address").val();
			var content = $("#content").val();
			if(repair_name == ''){
				alert("报修人姓名不能为空");
				return false;
			}
			if(repair_type == ''){
				alert("报修类型不能为空");
				return false;
			}
			if(time == ''){
				alert("报修时间不能为空");
				return false;
			}
			if(address == ''){
				alert("报修地点不能为空");
				return false;
			}
			if(content == ''){
				alert("报修内容不能为空");
				return false;
			}
			$("#form").attr("action", "../saveRepairInfo");
			$("#form").submit();
		});
	})
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
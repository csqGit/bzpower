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
<title>教室申请</title>
<link rel="stylesheet" href="<%=path%>/layui/css/layui.css" media="all">
<script type="text/javascript" src="<%=path%>/js/jquery-3.3.1.min.js"></script>
<script src="<%=path%>/layui/layui.js" charset="utf-8"></script>
<link rel="stylesheet" href="<%=path%>/css/public.css" type="text/css">
<link rel="stylesheet" href="<%=path%>/css/page/saveClass.css"
	type="text/css">

<script>
		layui.use('laydate', function() {
			var laydate = layui.laydate;

			//常规用法
			laydate.render({
				elem : '#test1'
			});
			laydate.render({
				elem : '#test-n4',
				type : 'time',
				position : 'static'
			});
		});
	</script>

</head>
<body>
	<!-- head start -->
	<jsp:include page="../top.jsp"></jsp:include>
	<!-- head end -->
	<!-- 查看教室申请信息 -->
	<div id="box">
		<div style="width: 1200px; height: 50px; line-height: 50px; margin: 0 auto;">
		<h1 style="position: relative;width: 1100px; float: left;line-height: 50px;">教室申请</h1>
		<h3 id="addApplyClass"><a href="<%=path %>/getApplyClass?page=1">查看申请</a></h3>
	</div>

		<!-- 提交申请表单 -->
		<form class="layui-form" action="<%=path%>/saveApplyClass"
			method="post">
			<input type="hidden" name="id" />

			<div class="layui-form-item">
				<label class="layui-form-label" style="text-align:center;">姓名</label>
				<div class="layui-input-block">
					<input type="text" name="applyName" autocomplete="off"
						placeholder="必填" class="layui-input">
				</div>
			</div>

			<div class="layui-form-item">
				<label class="layui-form-label" style="text-align:center;">学号</label>
				<div class="layui-input-block">
					<input type="text" name="applyStudentId" autocomplete="off"
						placeholder="必填" class="layui-input">
				</div>
			</div>

			<div class="layui-form-item">
				<label class="layui-form-label" style="text-align:center;">学院</label>
				<div class="layui-input-block">
					<input type="text" name="applyCollege" autocomplete="off"
						placeholder="必填" class="layui-input">
				</div>
			</div>

			<div class="layui-form-item">
				<label class="layui-form-label" style="text-align:center;">班级</label>
				<div class="layui-input-block">
					<input type="text" name="applyStudentClass" autocomplete="off"
						placeholder="必填" class="layui-input">
				</div>
			</div>

			<div class="layui-form-item">
				<label class="layui-form-label" style="text-align:center;">课程</label>
				<div class="layui-input-block">
					<input type="text" name="applyCourse" autocomplete="off"
						placeholder="课程" class="layui-input">
				</div>
			</div>

			<div class="layui-form-item">
				<label class="layui-form-label" style="text-align:center;">申请教室</label>
				<div class="layui-input-block">
					<input type="text" name="applyClassAddress" autocomplete="off"
						placeholder="必填" class="layui-input">
				</div>
			</div>

			<input type="hidden" value="0" name="applyState">


			<div class="layui-form-item">
				<label class="layui-form-label" style="text-align:center;">上课时间</label>
				<div class="layui-input-block">
					<input type="text" name="applyTime" class="layui-input" autocomplete="off"
						placeholder="必填">
				</div>
			</div>

			<div id="button">
				<div class="btn">
					<div class="layui-form-item">
						<button class="layui-btn" lay-submit="" lay-filter="demo2">提交</button>
					</div>
				</div>
				<div class="btn">
					<div class="layui-form-item">
						<input type="reset" class="layui-btn" />
					</div>
				</div>
			</div>
			<span
				style="float: right; color: red; margin-top: -40px; margin-right: 18px;">${msg }</span>
		</form>
	</div>
	<span id="return"><a href="<%=path%>/index.jsp">返回首页</a></span>
	<jsp:include page="../foot.jsp"></jsp:include>

</body>
</html>
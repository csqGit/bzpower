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

<style type="text/css"></style>

<script type="text/javascript">
	//展示申请信息
	$(function() {
		//展示教室信息
		$(".show_classroom").click(function() {
			//设置表单展示信息
			$(".layui-form").css('display', 'none');
			$("#show").css('display', 'block');

			$.ajax({
				url : '../getApplyClass',
				type : 'post',
				success : function(data) {
					if (!data) {
						alert(data);
					}
				}
			});
		});

		//申请教室
		$(".apply_classroom").click(function() {
			//设置表单展示信息
			$(".layui-form").css('display', 'block');
			$("#show").css('display', 'none');

		});
	});
</script>

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

	<span id="return"><a href="<%=path%>/index.jsp">返回首页</a></span>
	<!-- 查看教室申请信息 -->
	<div id="box">
		<div id="top">
			<div class="apply_classroom">申请教室</div>
			<div class="show_classroom">查看申请信息</div>
		</div>

		<!-- 展示申请信息 -->
		<div id="show">
			<table id="tb" width="500" border="1">
				<tr align="center" height="40px">
					<td>申请人</td>
					<td>申请教室</td>
					<td>申请时间</td>
					<td>审核状态</td>
				</tr>
				<c:forEach items="${applyClass }" var="applyClass">
					<tr align="center" height="40px">
						<td>${applyClass.applyName }</td>
						<td>${applyClass.applyClassAddress }</td>
						<td>${applyClass.applyTime }</td>
						<c:if test="${applyClass.applyState==0 }">
							<td>未通过</td>
						</c:if>
						<c:if test="${applyClass.applyState==1 }">
							<td>通过</td>
						</c:if>
					</tr>
				</c:forEach>

			</table>
		</div>

		<!-- 提交申请表单 -->
		<form class="layui-form" action="<%=path%>/saveApplyClass"
			method="post">
			<input type="hidden" name="id" />

			<div class="layui-form-item">
				<label class="layui-form-label">姓名</label>
				<div class="layui-input-block">
					<input type="text" name="applyName" autocomplete="off"
						placeholder="必填" class="layui-input">
				</div>
			</div>

			<div class="layui-form-item">
				<label class="layui-form-label">学号</label>
				<div class="layui-input-block">
					<input type="text" name="applyStudentId" autocomplete="off"
						placeholder="必填" class="layui-input">
				</div>
			</div>

			<div class="layui-form-item">
				<label class="layui-form-label">学院</label>
				<div class="layui-input-block">
					<input type="text" name="applyCollege" autocomplete="off"
						placeholder="必填" class="layui-input">
				</div>
			</div>

			<div class="layui-form-item">
				<label class="layui-form-label">班级</label>
				<div class="layui-input-block">
					<input type="text" name="applyStudentClass" autocomplete="off"
						placeholder="必填" class="layui-input">
				</div>
			</div>

			<div class="layui-form-item">
				<label class="layui-form-label">课程</label>
				<div class="layui-input-block">
					<input type="text" name="applyCourse" autocomplete="off"
						placeholder="课程" class="layui-input">
				</div>
			</div>

			<div class="layui-form-item">
				<label class="layui-form-label">地址</label>
				<div class="layui-input-block">
					<input type="text" name="applyClassAddress" autocomplete="off"
						placeholder="必填" class="layui-input">
				</div>
			</div>

			<input type="hidden" value="0" name="applyState">


			<div class="layui-form-item">
				<label class="layui-form-label">时间</label>
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
	<jsp:include page="../foot.jsp"></jsp:include>

</body>
</html>
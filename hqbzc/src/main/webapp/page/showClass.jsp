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
<script type="text/javascript" src="<%=path%>/js/page/showClass.js"></script>
<script src="<%=path%>/layui/layui.js" charset="utf-8"></script>
<link rel="stylesheet" href="<%=path%>/css/public.css" type="text/css">
<link rel="stylesheet" href="<%=path%>/css/page/showClass.css"
	type="text/css">

</head>
<body>
	<!-- head start -->
	<jsp:include page="../top.jsp"></jsp:include>
	<!-- head end -->


	<!-- 查看教室申请信息 -->
	<div id="box">
	<div style="width: 1200px; height: 50px; margin: 0 auto;">
		<h1 style="width: 1100px; float: left;">教室申请信息</h1>
		<h3 id="addApplyClass"><a href="<%=path %>/page/saveClass.jsp">教室申请</a></h3>
	</div>
		<!-- 展示申请信息 -->
		<table id="tb" border="0" cellspacing="0" cellpadding="0">
			<tr align="center" height="40px">
				<td>编号</td>
				<td>学院</td>
				<td>班级</td>
				<td>课程</td>
				<td>申请人姓名</td>
				<td>申请教室</td>
				<td>申请时间</td>
				<td>审核状态</td>
			</tr>
			<c:forEach items="${applyClass }" var="applyClass">
				<tr align="center" height="40px">
					<td width="10%">${applyClass.id }</td>
					<td>${applyClass.applyCollege }</td>
					<td>${applyClass.applyStudentClass }</td>
					<td>${applyClass.applyCourse }</td>
					<td>${applyClass.applyName }</td>
					<td>${applyClass.applyClassAddress }</td>
					<td>${applyClass.applyTime }</td>
					<c:if test="${applyClass.applyState==0 }">
						<td style="color: red">未通过</td>
					</c:if>
					<c:if test="${applyClass.applyState==1 }">
						<td style="color: blue">通过</td>
					</c:if>
				</tr>
			</c:forEach>

		</table>
		<ul class="page">
				<li><!-- <font></font> --><span id="firstPage">首页</span></li>
				<li><span id="prePage">上一页</span></li>
				<li><span id="nextPage">下一页</span></li>
				<li><span id="lastPage">尾页</span></li>
				<li><span>当前页:&nbsp;&nbsp;<font id="currentPage">${currentPage }</font></span></li>
				<li><span>共计：&nbsp;&nbsp;<font id="pages">${pages }</font></span></li>
			</ul>
	</div>
	<!-- 提交申请表单 -->
	<span id="return"><a href="<%=path%>/index.jsp">返回首页</a></span>
	<jsp:include page="../foot.jsp"></jsp:include>
<script type="text/javascript">
	
	
</script>
</body>
</html>
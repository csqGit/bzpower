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
<link rel="stylesheet" href="layui/css/layui.css" type="text/css">
<link rel="stylesheet" href="css/index.css" type="text/css">
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<script src="layui/layui.js" charset="utf-8"></script>
<script src="js/index.js" charset="utf-8"></script>
<style type="text/css">

</style>

</head>
<body>
	<!-- head start -->
	<div class="head">
		<img alt="" src="images/u19.png" class="head-img" /><span
			id="logo">陇东学院后勤保障处</span>
		<ul class="head-li">
			<li><a href="http://www.ldxy.edu.cn">学校首页</a></li>
			<li><a href="">新闻通知</a></li>
			<li><a href="">全部功能</a></li>
			<li><a href="">智慧后勤</a></li>
			<li><a href="">关于我们</a></li>
		</ul>
	</div>
	<!-- head end -->

	<div id="igs">
		
			<a class="ig" href="#"><img alt=""
				src="<%=path %>/images/lbimages/lb1.jpg"></a>
				<a class="ig" href="#"><img alt=""
				src="<%=path %>/images/lbimages/lb2.jpg"></a>
				<a class="ig" href="#"><img alt=""
				src="<%=path %>/images/lbimages/lb3.jpg"></a>
				<a class="ig" href="#"><img alt=""
				src="<%=path %>/images/lbimages/lb4.jpg"></a>
		<div class="btn btn1">&lt;</div>
		<div class="btn btn2">&gt;</div>

		<ul id="tabs">
			<li class="tab">1</li>
			<li class="tab">2</li>
			<li class="tab">3</li>
			<li class="tab">4</li>
		</ul>
	</div>

	<!-- 新闻公告 start -->
	<div class="new">
		<div class="new-top">
			<div class="new-top-left">新闻公告</div>
			<div class="new-top-right">
				<a href="">更多</a>
			</div>
		</div>
		<div class="new-left">
			<div class="new-left-one">

				<div class="layui-carousel" id="test3">
					<div carousel-item="">
						
							<div style="width: 370px; cursor: pointer;">
								<img alt=""
				src="<%=path %>/images/lbimages/lb2.jpg">
								<img alt=""
				src="<%=path %>/images/lbimages/lb2.jpg">
								<img alt=""
				src="<%=path %>/images/lbimages/lb2.jpg">
							</div>
						
					</div>
				</div>


			</div>
			<div class="new-left-two">
				<span class="new-box">此处为新闻图片相对应的介绍</span>
			</div>
			<!-- <div class="new-left-three">
				<span class="more-new"><a href="javascript:void(0)">更多新闻</a></span>
			</div> -->
		</div>
		<div class="new-right">
			<!-- <table class="layui-hide" id="test"></table> -->
			<table id="newTab" width="800" border="1" cellpadding="0" cellspacing="0" align="center">
				<thead>
				<tr align="center" style="background:rgb(242, 242, 242)" height='40'>
					<td>编号</td>
					<td>新闻标题</td>
					<td>新闻类型</td>
					<td>发布日期</td>
					<td>作者</td>
					<td>详情</td>
				</tr>
				</thead>
				
			</table>
			<ul class="page">
				<li><font></font><span id="firstPage">首页</span></li>
				<li><span id="prePage">上一页</span></li>
				<li><span id="nextPage">下一页</span></li>
				<li><span id="lastPage">尾页</span></li>
				<li><span>当前页:&nbsp;&nbsp;<font id="currentPage"></font></span></li>
				<li><span>共计：&nbsp;&nbsp;<font id="pages"></font></span></li>
			</ul>
		</div>
	</div>

	<!-- 新闻公告 end -->

	<!-- 后勤保障报修repair start -->
	<div class="repair">
		<div class="repair-left">
			<div class="repair-left-one one">
				<img alt="" src="images/u61.png" class="img"> <a
					href="page/hqgzbx.jsp" class="img-a">后勤故障报修</a>
			</div>
			<div class="repair-left-one two">
				<img alt="" src="images/u63.png" class="img"> <a href=""
					class="img-a">电费充值</a>
			</div>
			<div class="repair-left-one three">
				<img alt="" src="images/u66.png" class="img"><a
					href="<%=path %>/page/hqgzbx.jsp" class="img-a">校园网故障报修</a>
			</div>
			<div class="repair-left-one four">
				<img alt="" src="images/u66.png" class="img"> <a
					href="<%=path %>/getGoodList?startPosition=1" class="img-a">失物招领</a>
			</div>
			<div class="repair-left-one five">
				<img alt="" src="images/u90.png" class="img"> <a
					href="<%=path %>/getNewType" class="img-a">新闻公告</a>
			</div>
			<div class="repair-left-one six">
				<img alt="" src="images/u100.png" class="img"> <a href=""
					class="img-a">服务监督</a>
			</div>
			<div class="repair-left-one seven">
				<img alt="" src="images/u102.png" class="img"> <a
					href="<%=path %>/page/freeClass.jsp"
					class="img-a">空闲教室查询</a>
			</div>
			<div class="repair-left-one eight">
				<img alt="" src="images/u104.png" class="img"> <a
					href="<%=path %>/page/saveClass.jsp" class="img-a">申请教室</a>
			</div>
			<div class="repair-left-one nine">
				<img alt="" src="images/u110.png" class="img"> <a
					href="<%=path %>/page/schoolBus.jsp" class="img-a">校车安排信息</a>
			</div>
			<div class="repair-left-one ten">
				<img alt="" src="images/u106.png" class="img"> <a href=""
					class="img-a">更多信息查询</a>
			</div>
		</div>
		<div class="repair-but">
			<div class="repair-but-left">
				<div class="repair-but-one">
					<span class="repair-box"><a href="#">快速报修</a></span>
				</div>
				<div class="repair-but-two">
					<span class="repair-box"><a href="#">共有${repairCount }条报修记录</a></span>
					<span class="repair-box"><a href="#">特殊数据0条</a></span>
				</div>
				<div class="repair-but-three">
					<span class="more-repair"><a href="#">更多新闻</a></span>
				</div>
			</div>
			<div class="repair-but-right">
				<!-- <table class="layui-hide" id="test2"></table> -->
<table id="repairTab" width="800" border="1" cellpadding="0" cellspacing="0" align="center">
				<thead>
				<tr align="center" style="background:rgb(242, 242, 242)" height='40'>
					<td>编号</td>
					<td>报修内容</td>
					<td>保修类型</td>
					<td>报修时间</td>
					<td>报修地址</td>
					<td>报修人</td>
				</tr>
				</thead>
				
			</table>
			<ul class="page">
				<li><font></font><span id="firstPage2">首页</span></li>
				<li><span id="prePage2">上一页</span></li>
				<li><span id="nextPage2">下一页</span></li>
				<li><span id="lastPage2">尾页</span></li>
				<li><span>当前页:&nbsp;&nbsp;<font id="currentPage2"></font></span></li>
				<li><span>共计：&nbsp;&nbsp;<font id="pages2"></font></span></li>
			</ul>
			</div>
		</div>
	</div>
	<!-- 后勤保障报修repair end -->

	<!-- 食堂eatery信息 start -->
	<div class="eatery">
		<div class="eatery-info info">
			<div class="info-top">
				<img src="images/u590.png" width="30" height="30" class="nav">食堂监督
			</div>
			<div class="info-but">
				<div class="info-but-box">
					<img src="images/u466.png" width="30" height="30" class="title"><span
						class="span"><a href="">餐饮卫生投诉</a></span>
				</div>
				<div class="info-but-box box">
					<a href=""><img src="images/u476.png" width="30" height="30"
						class="title"><span class="span">食堂物价投诉</span></a>
				</div>
			</div>
		</div>
		<div class="eatery-info">
			<div class="info-top">
				<img src="images/u590.png" width="30" height="30" class="nav">服务人员监督
			</div>
			<div class="info-but">
				<div class="info-but-box">
					<a href=""><img src="images/u492.png" width="30" height="30"
						class="title"><span class="span">投诉后勤维修人员</span></a>
				</div>
				<div class="info-but-box box">
					<a href=""><img src="images/u496.png" width="30" height="30"
						class="title"><span class="span">投诉费用充值人员</span></a>
				</div>
			</div>
		</div>
		<div class="eatery-info idea-box">
			<div class="info-top">
				<img src="images/u590.png" width="30" height="30" class="nav">网络意见建议
			</div>
			<ul class="info-top-li">
				<c:forEach var="idea" items="${interIdea }">
					<li><a href="">${idea.idea_name }</a></li>
				</c:forEach>
				<!-- <li class="border-none" style="border: none;"><a href="">建议信息</a></li> -->
			</ul>
		</div>
		<div class="eatery-info network-box">
			<div class="info-top">
				<img src="images/u590.png" width="30" height="30" class="nav">网络调查
			</div>
			<ul class="info-top-li">
				<li><a href="">建议信息</a></li>
				<li><a href="">建议信息</a></li>
				<li><a href="">建议信息</a></li>
				<li><a href="">建议信息</a></li>
				<li class="border-none" style="border: none;"><a href="">建议信息</a></li>
			</ul>
		</div>
	</div>
	<!-- 食堂信息 end -->

	<!-- 后勤信息 service -->
	<div class="service">
		<div class="service-left">
			<div class="service-info" style="margin-left: 0;">
				<div class="service-info-top">
					<img src="images/u590.png" width="30" height="30" class="nav">智慧后勤
				</div>
				<ul class="service-info-li li-left">
					<c:forEach items="${system }" var="system">
						<li><a href="${system.url }">${system.system_name }</a>
					</c:forEach>
				</ul>
			</div>
			<div class="service-info">
				<div class="service-info-top">
					<img src="images/u590.png" width="30" height="30" class="nav">连接导航
				</div>
				<ul class="service-info-li li-right">
					<c:forEach items="${system }" var="system">
						<li><a href="${system.url }">${system.system_name }</a>
					</c:forEach>
				</ul>
			</div>
		</div>
		<div class="service-map">

			<iframe src="<%=path %>/page/zddt.html" width="780" height="250"
				frameborder="0"></iframe>
		</div>
	</div>

	<!-- 版权 -->
	<div class="copy">
		<p></p>
		<p>陇东学院所有</p>
		<p></p>
	</div>
</body>
</html>
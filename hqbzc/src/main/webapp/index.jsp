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
<link rel="stylesheet" href="css/index.css" type="text/css">
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<script src="layui/layui.js" charset="utf-8"></script>
<script src="js/index.js" charset="utf-8"></script>
<style type="text/css">
.layui-table, .layui-table-view {
	margin: 0;
}

#igs {
	margin: 10px auto;
	width: 1200px;
	height: 300px;
	position: relative;
	top: 80px;
}

.ig {
	position: absolute;
}

.ig img {
	width: 1200px;
	height: 300px;
}

#tabs {
	position: absolute;
	list-style: none;
	background-color: rgba(255, 255, 255, .5);
	left: 550px;
	bottom: 10px;
	border-radius: 10px;
	padding: 5px 0 5px 5px;
}

.tab {
	float: left;
	text-align: center;
	line-height: 20px;
	width: 20px;
	height: 20px;
	cursor: pointer;
	overflow: hidden;
	margin-right: 6px;
	border-radius: 100%;
	background-color: rgb(200, 100, 150);
}

.btn {
	position: absolute;
	color: #fff;
	top: 110px;
	width: 40px;
	height: 100px;
	background-color: rgba(255, 255, 255, .3);
	font-size: 40px;
	font-weight: bold;
	text-align: center;
	line-height: 100px;
	border-radius: 5px;
	margin: 0 5px;
}

.btn2 {
	position: absolute;
	right: 0px;
}

.btn:hover {
	background-color: rgba(0, 0, 0, .7);
}
</style>
<script type="text/javascript">
//定义全局变量和定时器
var i = 0 ;
var timer;
 
$(document).ready(function(){
  //用jquery方法设置第一张图片显示，其余隐藏
  $('.ig').eq(0).show().siblings('.ig').hide();
   
  //调用showTime()函数（轮播函数）
  showTime();
   
  //当鼠标经过下面的数字时，触发两个事件（鼠标悬停和鼠标离开）
  $('.tab').hover(function(){
    //获取当前i的值，并显示，同时还要清除定时器
    i = $(this).index();
    Show();
    clearInterval(timer);
  },function(){
    //
    showTime();
  });
   
  //鼠标点击左侧的箭头
  $('.btn1').click(function(){
    clearInterval(timer);
    if(i == 0){
      i = 4;//注意此时i的值
    }
    i--;
    Show();
    showTime();
  });
   
  //鼠标点击右侧的箭头
  $('.btn2').click(function(){
    clearInterval(timer);
    if(i == 3){
      i = -1;//注意此时i的值
    }
    i++;
    Show();
    showTime();
  });
   
});
 
 
//创建一个showTime函数
function showTime(){
  //定时器
  timer = setInterval(function(){
    //调用一个Show()函数
    Show();
    i++;
    //当图片是最后一张的后面时，设置图片为第一张
    if(i==5){
      i=0;
    }
  },2000);
}
 
 
//创建一个Show函数
function Show(){
  //在这里可以用其他jquery的动画
  $('.ig').eq(i).fadeIn(300).siblings('.ig').fadeOut(300);
   
  //给.tab创建一个新的Class为其添加一个新的样式，并且要在css代码中设置该样式
  $('.tab').eq(i).addClass('bg').siblings('.tab').removeClass('bg');
   
  /*
   * css中添加的代码：
   * .bg{ background-color: #f00; }
   * */
}
</script>
</head>
<body>
	<!-- head start -->
	<div class="head">
		<img alt="" src="<%=path %>/images/u19.png" class="head-img" /><span
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
						<c:forEach items="${picUrl }" var="pic">
							<div style="width: 370px; cursor: pointer;">
								<img alt="" width="370" height="300"
									src="<%=path %>/images/lbimages/${pic.picUrl }">
							</div>
						</c:forEach>
					</div>
				</div>


			</div>
			<div class="new-left-two">
				<span class="new-box"><a href="#">共有<span id="count">${newCount }</span>条新闻
				</a></span> <span class="new-box"><a href="#">新闻${newCount }条，公告${newCount }条</a></span>
			</div>
			<div class="new-left-three">
				<span class="more-new"><a href="#">更多新闻</a></span>
			</div>
		</div>
		<div class="new-right">
			<!-- <table class="layui-hide" id="test"></table> -->
			<table width="700" border="1" cellpadding="0" cellspacing="0">
				<%-- <c:forEach items="${newInfo }" var="new" varStatus="current">
					<tr>
						<td>${current.index + 1 }</td>
						<td>${new.title }</td>
						<td>${new.type.typeName }</td>
						<td>${new.time }</td>
						<td>${new.author }</td>
					</tr>
				
				</c:forEach> --%>
			</table>
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
					href="<%=path %>/getFreeClass?page=1&limit=10&classid=1"
					class="img-a">空闲教师查询</a>
			</div>
			<div class="repair-left-one eight">
				<img alt="" src="images/u104.png" class="img"> <a
					href="<%=path %>/page/class.jsp" class="img-a">申请教室</a>
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
				<table class="layui-hide" id="test2"></table>

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
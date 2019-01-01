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
<link rel="stylesheet" href="<%=path %>/css/index.css" type="text/css">
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<script src="layui/layui.js" charset="utf-8"></script>
<script src="js/index.js" charset="utf-8"></script>
<style type="text/css">

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
	top:0;
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

#test1 {
	position: relative;
	top: 90px;
	width: 1200px;
	height: 200px;
	margin: 0 auto;
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

.new, .repair, .eatery, .service, .copy {
	position: relative;
	top: 80px;
}

.new {
	width: 1200px;
	height: 300px;
	margin: 0 auto;
}

.new-top {
	width: 100%;
	height: 30px;
	border-bottom: 2px solid orange;
	
}

.new-top-left {
	width: 100px;
	height: 30px;
	line-height: 40px;
	float: left;
	
}

.new-top-right {
	width: 50px;
	height: 30px;
	line-height: 40px;
	float: right;
}

.new-left {
	width: 370px;
	height: 260px;
	margin-top: 10px;
	border: 1px solid rgb(234, 234, 234);
	float: left;
}



.new-left-one {
	height: 220px;
	background: rgb(25, 158, 216);
}

.new-left-two {
	height: 40px;
	background: #ebebeb;
}

/* .new-left-three {
	height: 60px;
	background: rgb(251, 251, 251);
	margin-top: 5px;
	margin: 0 auto;
}
 */
.more-new {
	position: relative;
	top: 10px;
	display: block;
	width: 100px;
	height: 40px;
	line-height: 40px;
	text-align: center;
	border: 1px solid #D58512;
	border-radius: 3px;
	margin: 0 auto;
}

.new-box {
	display: block;
	width: 100%;
	height: 30;
	line-height: 30px;
	text-align: center;
	margin: 0 auto;
}

.new-right {
	width: 800px;
	height: 260px;
	border: 1px solid rgb(234, 234, 234);
	margin-top: 10px;
	float: right;
}


/*repair start*/
.repair {
	width: 1200px;
	height: 610px;
	margin: 0 auto;
}

.repair-left {
	width: 1200px;
	height: 360px;
}

.repair-left-one {
	width: 230px;
	height: 170px;
	margin: 5px;
	float: left;
}

.one {
	background: #199ed8;
}

.two {
	background: rgba(255, 153, 51);
}

.three {
	background: rgba(0, 195, 173);
}

.four {
	background: rgba(186, 120, 230);
}

.five {
	background: rgba(148, 148, 148);
}

.six {
	background: rgba(148, 148, 148);
}

.seven {
	background: rgba(148, 148, 148);
}

.eight {
	background: rgba(148, 148, 148);
}

.nine {
	background: rgba(148, 148, 148);
}

.ten {
	background: rgba(148, 148, 148);
}

.img {
	width: 120px;
	height: 90px;
	display: block;
	margin: 0 auto;
	margin-top: 30px;
}

.img-a {
	position: relative;
	top: -120px;
	display: block;
	width: 234px;
	height: 40px;
	text-align: center;
	padding-top: 130px;
	color: white;
}

.repair-but {
	width: 1200px;
	height: 240px;
	clear: both;
	margin-top: 10px;
}

.repair-but-left {
	width: 370px;
	float: left;
}

.repair-but-one {
	width: 370px;
	height: 100px;
	background: rgb(25, 158, 216);
	margin: 0 auto;
	line-height: 100px;
}

.repair-but-two {
	width: 370px;
	height: 90px;
	background: #ebebeb;
	margin: 0 auto;
	line-height: 60px;
}

.repair-but-three {
	width: 370px;
	height: 50px;
	background: rgb(251, 251, 251);
	margin: 0 auto;
}

.more-repair {
	position: relative;
	top: 8px;
	display: block;
	width: 100px;
	height: 30px;
	line-height: 30px;
	text-align: center;
	border: 1px solid #D58512;
	border-radius: 3px;
	margin: 0 auto;
}

.repair-box {
	display: block;
	width: 100%;
	height: 30px;
	text-align: center;
	margin: 0 auto;
}

.repair-but-right {
	width: 800px;
	border-left: 1px solid rgb(234, 234, 234);
	float: right;
}

.title {
	display: block;
	float: left;
	padding: 15px 0 0 15px;
}

.span {
	display: block;
	padding-left: 60px;
}
/*eatery食堂 start*/
.eatery {
	width: 1200px;
	height: 200px;
	margin: 0 auto;
	padding: 10px;
}

.eatery-info {
	width: 288px;
	height: 200px;
	border: 1px solid rgb(234, 234, 234);
	margin-left: 12px;
	float: left;
}

.info {
	margin-left: 0;
}

.info-top {
	width: 258px;
	height: 50px;
	padding-left: 20px;
	font-size: 20px;
	line-height: 50px;
	border-bottom: 2px solid rgb(186, 120, 230);
}

.info-top-li {
	width: 288px;
	height: 150px;
}

.info-top-li li {
	height: 29px;
	border-bottom: 1px dashed rgb(234, 234, 234);
	line-height: 30px;
	padding-left: 20px;
}

.info-but {
	width: 100%;
	height: 160px;
}

.info-but-box {
	position: relative;
	top: 10px;
	width: 240px;
	height: 60px;
	background: rgb(234, 234, 234);
	margin: 0 auto;
	line-height: 60px;
	font-size: 18px;
}

.box {
	margin-top: 10px;
}

/*智慧后勤信息*/
.service {
	width: 1200px;
	height: 240px;
	margin: 0 auto;
	padding: 10px;
}

.service-left {
	width: 430px;
	height: 235px;
	float: left;
}

.service-info {
	width: 210px;
	height: 235px;
	border: 1px solid rgb(235, 234, 234);
	margin-left: 5px;
	float: left;
}

.service-info-top {
	height: 50px;
	font-size: 20px;
	padding-left: 20px;
	line-height: 50px;
	background: rgb(251, 251, 251);
}

.service-info-li {
	height: 185px;
}

.service-info-li li {
	height: 30px;
	line-height: 30px;
	padding-left: 20px;
	border-bottom: 1px solid rgb(234, 234, 234);
}

.service-map {
	position:relative;
	top:-5px;
	left:-10px;
	width: 750px;
	height: 240px;
	float: right;
}

.nav {
	display: block;
	float: left;
	margin: 10px 10px 0 -10px;
}

/*版权*/
.copy {
	width: 1200px;
	height: 100px;
	padding: 10px;
	background: rgb(234,234,234);
	margin: 0 auto;
}

.copy p {
	width: 800px;
	height: 33px;
	margin: 0 auto;
	text-align: center;
	color: gray;
}s
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
table tr{
	text-align: center;
	height: 35px;
}
#newTab{
	border: none;
}
.page{
	width: 620px;
	height: 35px;
	margin: 5px auto;
}
.page li{
	width: 100px;
	height: 35px;
	line-height: 35px;
	text-align: center;
	border: 1px solid rgb(242, 242, 242);
	float: left;
}
.page li span{
	display: block;
	width: 100%;
	height: 100%;
	cursor: pointer;
}
</style>
<script type="text/javascript">
//定义全局变量和定时器
var i = 0 ;
var timer;
 
$(function(){
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

$(function(){
	$.ajax({
		url : 'getNewInfo',
		type : 'post',
		success : function(data){
			
		}
		
	});
})
</script>

<script type="text/javascript">
	$(function(){
		getNewInfo(1);
	})
	
	//请求页面数据
	function getNewInfo(page){
		$.ajax({
			url : 'getNewInfoList',
			type : 'post',
			data : {
				'page' : page
			},
			dataType : 'json',
			success : function(data){
				formatNewInfo(data);
			}, 
			error : function(data){
				//alert(1);
			}
		});
	}
	
	//解析新闻信息函数
	function formatNewInfo(data){
		//首先清空原有的数据
		$(".trBg").empty();
		$.each(data, function(k1, v1){
			var id = v1.id;
			var title = v1.title;
			var author = v1.author;
			var time = v1.time;
			var newType = v1.type.typeName;
			var newInfo = "<tbody class='trBg'><tr height='30'><td width='10%'>"
			+ id 
			+ "</td><td width='20%'>"
			+ title
			+ "</td><td width='20%'>"
			+ newType
			+ "</td><td width='15%'>"
			+ time 
			+ "</td><td width='15%'>" 
			+ author
			+ "</td><td width='10%'>"
			+ "<a href='javascript:void(0)' onclick='newInfo("+ id +")'>查看详情"
			+ "</a></td></tr></tbody>";
			$("#newTab").append(newInfo);
		})
	}
	
	function getNewById(id){
		//alert(id);
	}
	
	$(function(){
		var currentPageStr = $("#currentPage").html();
		var pagesStr = $("#pages").html();
		var currentPage = parseInt(currentPageStr);
		var pages = parseInt(pagesStr);
		$("#firstPage").on('click', function(){
			if(currentPage == 1)
				return false;
			currentPage = 1;
			getNewInfo(currentPage);
		});
		$("#prePage").on('click', function(){
			if(currentPage == 1)
				return false;
			currentPage --;
			getNewInfo(currentPage);
		});
		$("#nextPage").on('click', function(){
			if(currentPage == pages)
				return false;
			currentPage ++;
			getNewInfo(currentPage);
		});
		$("#lastPage").on('click', function(){
			if(currentPage == pages)
				return false;
			currentPage = pages;
			getNewInfo(currentPage);
		});
	})
	
	
</script>
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
				<li><span>当前页数<font id="currentPage">1</font></span></li>
				<li><span>总页数<font id="pages">2</font></span></li>
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
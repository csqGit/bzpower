<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>新闻公告</title>
<script type="text/javascript" src="<%=path %>/js/jquery-3.3.1.min.js"></script>
<style type="text/css">
*{
	margin:0;
	padding:0;
}
#box{
	position:relative;
	top:80px;
	width:1000px;
	height:auto;
	margin:10px auto;
}
	#return {
		position: fixed;
		top:90px;
		right:5%;
	}

#left ul{
	width:200px;
	height: auto;
	border:1px solid gray;
	float:left;
}

#left ul li{
	height:50px;
	border:1px solid gray;
	border-width:0 0 1px 0;
	padding-left:15px;
	line-height:50px;
}
#left ul li:hover{
	background:rgb(234,234,234);
}

#right{
	width:780px;
	height:auto;
	
	float:right;
	margin-bottom:10px ;
}
</style>
</head>
<body>
<!-- head start -->
	<jsp:include page="../top.jsp"></jsp:include>
	<!-- head end -->
	<span id="return"><a href="<%=path%>/index.jsp">返回首页</a></span>
	<div id="box">
		<div id="left">
			<ul id="ul">
				<c:forEach items="${newType }" var="type">
					<li value="${type.id }"><a href="">${type.typeName }</a></li>
				</c:forEach>
			</ul>
		</div>
		<div id="right">
			<iframe id="iframe" src="<%=path %>/page/newPageShow.jsp" width="100%" height="570px" 
			 frameborder="no" marginwidth="0"></iframe>
		</div>
	</div>
	
	<jsp:include page="../foot.jsp"></jsp:include>
	<script type="text/javascript">
		
		$(function(){
			$("#ul li").on("click", function(){
				var val = $(this).attr("value");//得到ul 的li列表的属性值
				$.ajax({
					url:'getList?startPosition=1&type=' + val,
					success:function(data){
						$("#iframe").src = data;
					}
				});
			});
			/* var obj = document.getElementById("iframe");
				var val = document.getElementsByTagName("li").length;//获取列表的长度
			*/
		})
	</script>
</body>
</html>
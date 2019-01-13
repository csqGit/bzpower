<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新闻详情</title>
<script type="text/javascript" src="<%=path %>/js/jquery-3.3.1.min.js"></script>
<style type="text/css">
*{
	margin: 0;
	padding: 0;
}
#container{
	width: 1200px;
	height: 500px;
	border: 1px solid rgb(234,234,234);
	margin: 0 auto;
	margin-top: 90px;
}

p{
	text-indent: 2em;
	line-height: 30px;
	font-size: 15px;
	padding: 0 10px;
}
#return{
	width:1200px;
	height: 30px;
	margin:10px auto;
	text-align: right;
	clear:both;
}
</style>
</head>
<body>
<jsp:include page="../top.jsp"></jsp:include>
<script type="text/javascript">
	
	$(function(){
		$.ajax({
			url : '../outPut',
			type : 'post',
			dataType : 'json',
			success : function(data){
				alert(data);
			}
		});
	})
	
</script>
<div id="container">
<center>
	<h1>新闻标题</h1>
</center>
<p>新闻内容</p>
<p>新闻内容</p>
<p>新闻内容</p>
<p>新闻内容</p>
<p>新闻内容</p>
<p>新闻内容</p>
<iframe src="../file/cs.txt"></iframe>
</div>
<div id="return"><a href="../index.jsp">返回首页</a></div>
<jsp:include page="../foot.jsp"></jsp:include>

</body>
</html>
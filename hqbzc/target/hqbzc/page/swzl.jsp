<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
    <%
    	String path = request.getContextPath();
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>失物招领</title>

<style type="text/css">
#box{
	position:	relative;
	top:90px;
	width:1000px;
	height:500px;
	border:1px solid rgb(234,234,234);
	margin:10px auto;
}
</style>

</head>
<body>
	<jsp:include page="../top.jsp"></jsp:include>
	<div id="box">
	
	</div>
	<jsp:include page="../foot.jsp"></jsp:include>
</body>
</html>
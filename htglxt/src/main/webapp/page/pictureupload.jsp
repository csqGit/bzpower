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
<script type="text/javascript" src="<%=path %>/js/jquery-3.3.1.min.js"></script>
<title>图片上传</title>
<style type="text/css">
*{
	margin:0;
	padding:0;
}
	#main{
		width:1100px;
		height:550px;
		margin:0 auto;
	}
	ul{
		width:200px;
		height:100%;
		float:left;
		border-right:1px solid rgb(234,234,234);
	}
	
	ul li{
		width: 100%;
		height:50px;
		line-height:50px;
		text-align:center;
		list-style:none;
		
	}
	ul li:hover{
		background:rgb(234,234,234);
	}
	#form{
		width:700px;
		height:500px;
		float: left;
		margin-left:50px;
	}
	#footer{
		width:730px;
		height:50px;
		line-height:50px;
		color:red;
		text-align:center;
		float: left;
		margin-left:50px;
		border:1px  solid red;
	}
</style>

<script type="text/javascript">
	$(function(){
		$("#pic1").click(function(){
			var val = $("#state").attr("value",1);
		});
		
		$("#pic2").click(function(){
			var val = $("#state").attr("value",2);
		});
		$("#pic3").click(function(){
			var val = $("#state").attr("value",3);
		});
		$("#btn").click(function(){
			
			$("#form").submit();
		});
	})
</script>
</head>
<body>
	<div id="main">
		<ul>
			<li id="pic1">轮播图片</li>
			<li id="pic2">失物图片</li>
			<li id="pic3">报修图片</li>
		</ul>
		<form action="../upload" method="post" id="form"  enctype="multipart/form-data">
			<input type="hidden" name="state" id="state" value="1"/>
			<input type="file" name="picture" /><br>
			<input type="button" id="btn" value="上传" />
			
		</form>
		<div id="footer">${msg }</div>
		
	</div>
</body>
</html>
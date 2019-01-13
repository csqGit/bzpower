<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String path = request.getContextPath();
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="<%=path %>/css/page/schoolBus.css">
<title>陇东学院校车信息</title>
</head>
<body>
	<jsp:include page="../top.jsp"></jsp:include>
	
	<div id="box">
		<table cellpadding="0" cellspacing="0">
			<tr height="60">
				<td>校车车牌号</td>
				<td>校车司机</td>
				<td>校车出发时间段</td>
				<td>出发地点</td>
				<td>到达地点</td>
				<td>途径站</td>
				<td>截至时间</td>
			</tr>
			<tr>
				<td>甘J99999</td>
				<td>张三</td>
				<td>
					7：00-7：10<br />
					11：50-12:00<br />
					14：00-14：10<br />
					18：00-18：10<br />
					21：00-21：10
				</td>
				<td>陇东学院</td>
				<td>西湖公园</td>
				<td>汽车南站<br />
					汽车西站<br />
					黄观寨小学
				</td>
				<td>21:00</td>
			</tr>
		</table>
	</div>
	<span id="return"><a href="<%=path%>/index.jsp">返回首页</a></span>
	<jsp:include page="../foot.jsp"></jsp:include>
</body>
</html>
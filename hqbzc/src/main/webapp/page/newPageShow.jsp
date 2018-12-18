<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script type="text/javascript" src="<%=path %>/js/jquery-3.3.1.min.js"></script>
<title>详细新闻信息</title>

<style type="text/css">
*{
	margin:0;
	padding:0;
}
table{
	border:1px solid gray;
	border-width:1px 0 0 1px;
	text-align:center;
}
table tr td{
	border:1px solid gray;
	border-width:0 1px 1px 0px;
}


font:hover{
	color:blue;
	cursor:pointer;
}

.odd{
	background: rgb(243,243,243);
}
.odd:hover{
	background: rgb(234,234,243);
}
.even:hover{
	background: rgb(243,243,243);
}
</style>

</head>
<body>
<script type="text/javascript">
/*jQuery的基本过滤选择器： 
 :odd：匹配所有索引值为奇数的元素，从0开始计数
 :even：匹配所有索引值为偶数的元素，从0开始计数
 jQuery中添加和移除样式的方法 
 如果样式没有事先定义，那么可以使用css方法为奇数行或者偶数行设置背景颜色；如果已经在css文件中事先将样式定义好了，
 那么就不能使用css方法了，须使用jQuery中的CSS类中的方法：

 addClass(class)：为每个匹配的元素添加指定的类名，即添加某个样式。
 removeClass(class)：从所有匹配的元素中删除全部或者指定的类，即移除某个样式。

 */
	/* window.onload = function(){
		var tb = document.getElementById("#table");
		rows = tb.getElementsByTagName("tr");
		alert(rows);
	}; */
	$(function() {
        $("tr:odd").addClass("odd");
        $("tr:even").addClass("even");
    });
</script>
<table id="table" width="760" cellpadding="0" cellspacing="0">
	<c:forEach items="${newList }" var = "list" varStatus="current">
		<tr height="50">
			<td width="50">${current.index + 1}</td>
			<td><a href="">${list.title }</a></td>
			<td>${ list.type.typeName}</td>
			<td>${ list.time}</td>
			<td>${ list.author}</td>
			<td><a href="${ list.newSrc}">下载</a></td>
		</tr>
	</c:forEach>
</table>
<table id="t" background="none" width="760" align="center" style="margin:10px 0 0 0px" cellpadding="0" cellspacing="0">
				<tr height="50">
					<td><font id="first">首页</font></td>
					<td><font id="pre">上一页</font></td>
					<td><font id="currentPage">1</font>/<font id="page">9</font></td>
					<td><font id="next">下一页</font></td>
					<td><font id="last">尾页</font></td>
					<td><font>共9页</font></td>
				</tr>
			</table>
</body>
</html>
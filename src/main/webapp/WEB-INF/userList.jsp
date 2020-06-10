<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>您好Springboot</title>
</head>
<body>
	<table border="1px" width="65%" align="center">
		<tr>
			<td colspan="5" align="center"><h3>学生信息</h3></td>
		</tr>
		<tr>
			<th>编号</th>
			<th>姓名</th>
			<th>年龄</th>
			<th>性别</th>
		</tr>
		<!--JSP独有的取值方式 jstl标签 
		   了解: JSP 4大作用域  page域/request域/Session域/application域
		${userList}从域中动态取值 -->
		<c:forEach items="${userList}" var="u">
			<tr>
				<th>${u.id}</th>
				<th>${u.name}</th>
				<th>${u.age}</th>
				<th>${u.sex}</th>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
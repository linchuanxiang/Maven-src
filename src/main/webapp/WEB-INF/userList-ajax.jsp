<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!--需要导入js函数类库  -->
<script type="text/javascript" src="/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">

	//校验jQuery是否引入正确.
	$(function(){		//让页面全部加载完成之后,执行js
		//函数式编程  任何的一个动作都是一个function函数
		alert("测试jQuery引入是否正常!!!!");
		alert("作业1:尽可能多的使用ajax的函数实现业务调用");
		alert("作业2:完成用户列表展现");

		//1.$.get(url,参数,回调函数....)
		//2.$.post(url,参数,回调函数....)
		//3.$.getJSON(url,参数,回调函数....)
		//4.$.ajax(...)

		//提示:1.遍历返回值     2.准备<tr><td></td>....</tr>
	})

</script>
<title>ajax的操作方式</title>
</head>
<body>
	<table border="1px" width="65%" align="center">
		<tr>
			<td colspan="6" align="center"><h3>学生信息</h3></td>
		</tr>
		<tr>
			<th>编号</th>
			<th>姓名</th>
			<th>年龄</th>
			<th>性别</th>
		</tr>
	</table>
</body>
</html>
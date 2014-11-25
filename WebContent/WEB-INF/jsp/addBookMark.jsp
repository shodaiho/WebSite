<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<script type="text/javascript" src="js/lib/jquery-1.8.3.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){
			$("#addBtn").click(function(){
				alert("add");
			});
			alert("aa");
		});
	</script>
</head>
<form action="login.action" method="post">
	<body>
		<input type="text" style="width:500px;"/><input id="addBtn" type="button" value="收藏"/>
		<br>
		<br>
		<textarea id="showBookMark"></textarea>
	</body>
</form>
</html>
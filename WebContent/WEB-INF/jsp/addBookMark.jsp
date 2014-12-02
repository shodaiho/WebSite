<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<script type="text/javascript" src="<c:url value='/js/lib/jquery-1.8.3.min.js'/>"></script>
	<script type="text/javascript">
		$(document).ready(function(){
			$("#addWebSite").click(function(){
				var webSite = document.location.href;
				if(webSite != null && webSite != ''){
					var webLink = "<a href='"+webSite+"'>"+webSite+"</a><br>";
					$("#bookMarklist").append(webLink);
				}
			});
		});
	</script>
</head>
<form action="login.action" method="post">
	<body>
		<input id="addWebSite" type="button" value="收藏"/>
		<br>
		<br>
		<div id="bookMarklist">
			
		</div>
	</body>
</form>
</html>
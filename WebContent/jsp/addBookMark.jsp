<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<script type="text/javascript" src="<c:url value='/js/lib/jquery-1.8.3.min.js'/>"></script>
	<script type="text/javascript">
		$(document).ready(function(){
			$("#colSiteBtn").click(function(){
				var webSite = document.location.href;
				if(webSite != null && webSite != ''){
					$("#website").val(webSite);
				}
			});
		});
	</script>
</head>
<form action="addBookMark_addWebsite" method="post" >
	<s:textfield id="website" name="website"></s:textfield>
	<div style="float:left;">
		<s:submit id="colSiteBtn" value="收藏"></s:submit>
 	</div>
 	<div id="bookMarklist">
		<c:forEach items="${bookMarkList}" var="bookMark">
			<a id="${bookMark.webNo}" href="${bookMark.website}">${bookMark.website}</a><br>
		</c:forEach>
	</div>
</form>
</html>
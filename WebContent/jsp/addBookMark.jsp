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
				var webSite = "";
				// 直接从网址栏获取
				if($("#addType1").is(":checked")){
					webSite = document.location.href;
				}else{
					// 直接输入
					var inputWebsite = $("#website").val();
					if(inputWebsite){
						$("#website").removeAttr("style");
						$("#errorInf").html("");
						webSite = inputWebsite;
					}else{
						$("#website").css("background","red");
						var msg = "请输入网址!<br>";
						$("#errorInf").html(msg);
						return false;
					}
				}
				if(webSite != null && webSite != ''){
					$("#website").val(webSite);
				}
				
				$.ajax({
				    type: "post",
				    url: "addBookMark_addWebsite" ,
				    data: {
				    	website:webSite
				    } ,
				    success: function(data){
				    	if(data){
				    		var link = "<a id="+data+" href="+webSite+">"+webSite+"</a><br>";
				    		$("#bookMarklist").append(link);
				    	}
				    } ,
				    dataType: "json"
				});
			});
			
			$("#addType1").click(function(){
				$("#website").removeAttr("style");
				$("#errorInf").html("");
			});
		});
	</script>
</head>
<div>
	<input id="addType1" type="radio" name="addType">从网址栏获取
	<input id="addType2" type="radio" name="addType">直接输入<br>
	<s:textfield id="website" name="website" cssStyle="width:500px;"></s:textfield>
	<input type="button" id="colSiteBtn" value="收藏" />
	
	<div id="errorInf"></div>
	<hr>
 	<div id="bookMarklist">
		<c:forEach items="${bookMarkList}" var="bookMark">
			<a id="${bookMark.webNo}" href="${bookMark.website}">${bookMark.website}</a><br>
		</c:forEach>
	</div>
</div>
</html>
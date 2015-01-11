<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<p style="background: blue; width: 100px;">Login</p>
</head>
<s:form action="login">
		<s:textfield id="userName" name="user.userName" label="UserName"/>
		<s:password id="password" name="user.password" label="PassWord"></s:password>
		<s:submit value="登陆"></s:submit>
		<s:textarea rows="3" cols="3" cssStyle="width: 400px;" 
			id="errorInfo" name="user.errorInfo" readonly="readonly"></s:textarea>
</s:form>
</html>
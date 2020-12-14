<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>


	<h2>CZ3002 Assignment 2</h2>
	
	<s:form action="login">
		<s:textfield name="users.Username" label="Username" required="true"/>
		<s:password name="users.Password" label="Password" required="true"/>
		<s:submit value="Login"/>
	</s:form>
 <s:actionerror style="color: red"/>
</body>
</html>
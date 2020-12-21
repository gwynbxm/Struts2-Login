<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="css/style.css">
		<title>Login</title>
	</head>
<body>

	<div class="login-container">
	<span class="form-title">CZ3002 Assignment 2</span>
	<s:form action="login">
		<s:textfield id="usernameLabel" name="users.Username" label="Username" required="true" cssClass="input-field" placeholder="Enter Username"/>
		<s:password id="passwordLabel" name="users.Password" label="Password" required="true" cssClass="input-field" placeholder="Enter Password"/>
		<s:submit value="Login" cssClass="login-form-button"/>
	</s:form>
	<s:actionerror/>
	</div>

</body>
</html>
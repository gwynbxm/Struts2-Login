<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="css/style.css">
		<title>Welcome!</title>
	</head>
<body>
	<div class="login-container">
		<h2>Hello <s:property value="users.Username"/> !</h2>
		<h3>You have successfully logged in!</h3>
		<div class="button"><a href="login">Logout</a></div>
	</div>
</body>
</html>
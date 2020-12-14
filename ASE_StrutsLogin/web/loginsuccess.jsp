<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome!</title>
</head>
<body>

<h2>Hello <s:property value="users.Username"/> !</h2>
<h2>You have successfully logged in!</h2>
<h4><a href="login">Logout</a></h4>

</body>
</html>
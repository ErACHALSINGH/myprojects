<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<jsp:useBean id="trinfo" class="com.arit.Trainee"></jsp:useBean>
		<jsp:setProperty property="*" name="trinfo"/>
		
		Your Details :<br>
		
		Name :- Mr. <jsp:getProperty property="username" name="trinfo"/><br>
		Password:-  <jsp:getProperty property="password" name="trinfo"/><br>
		Age:- 		<jsp:getProperty property="age" name="trinfo"/><br>
		Domain:-    <jsp:getProperty property="domain" name="trinfo"/><br>
</body>
</html>
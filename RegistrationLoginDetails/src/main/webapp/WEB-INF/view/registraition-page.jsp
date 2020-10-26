<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix= "form" uri ="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h3>Registration Form</h3>
		<form:form action="submitForm" modelAttribute = "registraion">
		User Name: <form:input path="username"/><br>
		First Name: <form:input path="firstname"/><br>
		Last Name :<form:input path="lastname"/><br>
		Age: <form:input path="age"/><br>
		<br><br>
		Gender:
		<form:radiobutton path="gender" value = "male"/>Male	
		<form:radiobutton path="gender" value = "female"/>Female
		<br><br>
		Password: <form:input path="password"/><br>
        <input type ="submit" >
        <br><br>
        <a href="index.jsp">Home-page</a>
        
		</form:form>
</body>
</html>
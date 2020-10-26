<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix= "form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<style>
.error{color:red}
</style>
</head>
<body>
<form:form action="helloagain" modelAttribute="emp">
User Name:<form:input path ="name"/><br>
Password:<form:input path ="pass"/><br>
<form:errors path="pass" cssClass = "error"/><br>
Age: <form:input path="age"/>
<form:errors path ="age" cssClass ="error"/><br>
<input type ="submit" value="submit">
</form:form>
</body>
</html>
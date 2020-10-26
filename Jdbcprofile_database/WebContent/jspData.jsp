<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.io.*,java.util.*,java.sql.*" %>
    <%@ page import ="javax.servlet.http.*,javax.servlet.*" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix ="sql" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JDBC Profile Demo</title>
</head>
<body>

	<form method="post">
<table>
<tr>
<td>Enter First Name</td>
<td><input type="text" name="fname"></td>
</tr>
<tr>
<td>Enter Last Name</td>
<td><input type="text" name="lname"></td>
</tr>
<tr>
<td>Enter Age</td>
<td><input type="text" name="age"></td>
</tr>
<tr>
<td>Enter Father Name</td>
<td><input type="text" name="frname"></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value=Register"></td>
</tr>
</table>
</form>

<sql:setDataSource
		var ="UserDB"
		driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver"
		url="jdbc:sqlserver://192.168.52.71;databaseName=Trainee_may19"
		user="TraineeUser" password ="Trainee@321"/>
		
 <c:if test="${pageContext.request.method=='POST'}">
<%-- <c:catch var="exception"> --%>
<sql:update dataSource="${UserDB}" var="result1">
INSERT INTO tbl_user_profile1 (firstname,lastname,age,fathername) VALUES (?, ?, ?, ?)
<sql:param value="${param.fname}" />
<sql:param value="${param.lname}" />
<sql:param value="${param.age}" />
<sql:param value="${param.frname}" />
</sql:update>
<%-- </c:catch> --%>
</c:if>
</body>
</html>
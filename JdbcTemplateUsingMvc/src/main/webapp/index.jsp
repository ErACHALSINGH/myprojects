<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ page import="java.io.*,java.util.*,java.sql.*" %>
    <%@ page import="javax.servlet.http.*,javax.servlet.*" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>


<html>
<head>
<meta charset="ISO-8859-1">


</head>
<body>
<h2>Training Details Aug 2020</h2>
<button type="button">Add Trainee</button>


                	<table border="1" width="50%">
                	<tr>
                	<th>Id</th>
                	<th>Name</th>
                	<th>Age</th>
                	<th>Mbl_No</th>
                	<th>Email</th>
                	<th>Action</th>
                	<td>
                	</tr>
                	<c:forEach var="row" items="${result.rows }">
                	<tr>
                	<td><c:out value="${row.Id}"/></td>
                	<td><c:out value="${row.Name}"/></td>
                	<td><c:out value="${row.Age}"/></td>
                	<td><c:out value="${row.Mbl_No}"/></td>
                	<td><c:out value="${row.Email}"/></td>
                	</tr>	
                	</c:forEach>
                	</table>
</body>
</html>
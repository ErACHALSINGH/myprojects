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
<title>JDBC Demo</title>
</head>
<body>
		<sql:setDataSource
		var ="UserDB"
		driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver"
		url="jdbc:sqlserver://192.168.52.71;databaseName=Trainee_may19"
		user="TraineeUser" password ="Trainee@321"/>
		
		
			<%-- <sql:update dataSource="${UserDB}" var="result">
				insert into tbl_user123 values('9807','Bharat','Bharat@rathi.com');	
			</sql:update>
			<c:set var = "empId" value="321"/>
			<sql:update dataSource = "${UserDB }" var ="result">
			delete from tbl_user123 where empid=1;
			<sql:param value ="${empId}"/>
			</sql:update> --%>
			<%-- <sql:update dataSource = "${UserDB}" var="result">
			update tbl_user123 set name='Pradeep' where empid=2;
			<sql:param value= "${empid}" />
			</sql:update>  --%>
		
		
			<sql:query dataSource ="${UserDB}" var= "result">
			select *from tbl_user123;
			</sql:query>
			
			<table border="1" width= "35%">
			<tr>
				<th>Employee_id</th>
				<th>Employee_name</th>
				<th>Empployee_email</th>
			</tr>	
			<c:forEach var ="row" items="${result.rows }">
			<tr>
		 	<td><c:out value="${row.empid }"></c:out></td>
		 	<td><c:out value="${row.name }"></c:out></td>
		 	<td><c:out value="${row.email }"></c:out></td>
			</tr>		
			</c:forEach>
			</table>
	</body>
</html>
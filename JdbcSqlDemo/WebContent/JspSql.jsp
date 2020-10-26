<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ page import="java.io.*,java.util.*,java.sql.*" %>
    <%@ page import="javax.servlet.http.*,javax.servlet.*" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
  <sql:setDataSource
	var = "UserDB"
	driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver"
	url = "jdbc:sqlserver://192.168.52.71;databaseName=Trainee_may19"
	user = "TraineeUser" password="Trainee@321" scope="session"/>
</head>
<body>
<form method="post">
 	<input type="radio"  name="r" value ="1" >Display Average age of students <br>
	<input type="radio"  name="r" value ="2">Display details of the students who got highest marks in C++<br>
	<input type="radio"  name="r" value ="3">Display the Id and Name of the student whose age is above average<br>
	<input type="radio"  name="r" value ="4">Display details of student who did not give exam<br>
	<input type="radio"  name="r" value ="5">Display subject wise total marks<br>
	<input type="radio"  name="r" value ="6">Display Id and Total Marks of every students<br>
	<input type="radio"  name="r" value ="7">Display Id,Name and Total Marks of every students<br>
	<input type="radio"  name="r" value ="8">Display the details of students whose Name have a letter 'K' in it<br>
	<input type="radio"  name="r" value ="9">Display the Name and Id of the Toppers<br>
	<input type="radio"  name="r" value ="10">Display student Id, Name, Mentor Id and Mentor Name of every student<br>
	
<input type="Submit" value="Submit" />
 </form> 
   <c:if test="${pageContext.request.method=='POST'}">
 
<%
            if (request.getParameter("r") != null) { %>
            	
             <%  if(request.getParameter("r").equals("1")) { %>
                	<sql:query dataSource="${UserDB}" var="result">
                	select avg(Age) as Average_Age from tbl_st_details_937587;
                		</sql:query>

                	<table border="1" width="50%">
                	<tr>
                	<th>Average_Age</th>
                	</tr>
                	<c:forEach var="row" items="${result.rows }">
                	<tr>
                	<td><c:out value="${row.Average_Age}"/></td>
                	</tr>
                	</c:forEach>
                	</table>
               <%} %> 
               <% if(request.getParameter("r").equals("2")) {%>
                      <sql:query dataSource="${UserDB}" var="result">
                	select *from tbl_st_details_937587 s
  				  where Std_ID in(select max(Marks) from tbl_st_marks_937587 where Sub = 'c++')
                		</sql:query>

                	<table border="1" width="50%">
                	<tr>
                	<th>Std_ID</th>
                	<th>Name</th>
                	<th>Age</th>
                	<th>Mnt_ID</th>
                	</tr>
                	<c:forEach var="row" items="${result.rows }">
                	<tr>
                	<td><c:out value="${row.Std_ID}"/></td>
                	<td><c:out value="${row.Name}"/></td>
                	<td><c:out value="${row.Age}"/></td>
                	<td><c:out value="${row.Mnt_ID}"/></td>
                	</tr>
                	</c:forEach>
                	</table>
             	<%} %>
             	
             	
             	<% if(request.getParameter("r").equals("3")) {%>
                      <sql:query dataSource="${UserDB}" var="result">
               select Std_ID, Name from tbl_st_details_937587  where Age > (select avg(Age) from tbl_st_details_937587)
                   
                	</sql:query>

                	<table border="1" width="50%">
                	<tr>
                	<th>Std_ID</th>
                	<th>Name</th>
                	</tr>
                	<c:forEach var="row" items="${result.rows }">
                	<tr>
                	<td><c:out value="${row.Std_ID}"/></td>
                	<td><c:out value="${row.Name}"/></td>
                	</tr>
                	</c:forEach>
                	</table>
             	<%} %>
             	
             	
             	  <% if(request.getParameter("r").equals("4")) {%>
                      <sql:query dataSource="${UserDB}" var="result">
                	select Name ,Std_ID from tbl_st_details_937587 
                	where Std_ID not in(select ID from tbl_st_marks_937587) 
                		</sql:query>

                	<table border="1" width="50%">
                	<tr>
                	<th>Std_ID</th>
                	<th>Name</th>
                	</tr>
                	<c:forEach var="row" items="${result.rows }">
                	<tr>
                	<td><c:out value="${row.Std_ID}"/></td>
                	<td><c:out value="${row.Name}"/></td>
                	</tr>
                	</c:forEach>
                	</table>
             	<%} %>
             	
             	
             	<% if(request.getParameter("r").equals("5")) {%>
                      <sql:query dataSource="${UserDB}" var="result">
                	select sum(Marks) as Total_marks , Sub  from tbl_st_marks_937587 group by Sub
                		</sql:query>

                	<table border="1" width="50%">
                	<tr>
                	<th>Total_marks</th>
                	<th>Subject</th>
                	</tr>
                	<c:forEach var="row" items="${result.rows }">
                	<tr>
                	<td><c:out value="${row.Total_marks}"/></td>
                	<td><c:out value="${row.Sub}"/></td>
                	</tr>
                	</c:forEach>
                	</table>
             	<%} %>
             	
             	
             	<% if(request.getParameter("r").equals("6")) {%>
                      <sql:query dataSource="${UserDB}" var="result">
                	select ID, sum(Marks) as Total_marks from tbl_st_marks_937587  group by ID 
                		</sql:query>

                	<table border="1" width="50%">
                	<tr>
                	<th>ID</th>
                	<th>Total_marks</th>
                	</tr>
                	<c:forEach var="row" items="${result.rows }">
                	<tr>
                	<td><c:out value="${row.ID}"/></td>
                	<td><c:out value="${row.Total_marks}"/></td>
                	</tr>
                	</c:forEach>
                	</table>
             	<%} %>
             	
             	
             	<% if(request.getParameter("r").equals("7")) {%>
                      <sql:query dataSource="${UserDB}" var="result">
                	select sum(m.Marks) as Total_Marks,s.Std_ID,s.Name from tbl_st_details_937587 s
	 				 inner join  tbl_st_marks_937587 m 
	   				on s.Std_ID = m.ID
   	   				group by Std_ID,Name
                		</sql:query>

                	<table border="1" width="50%">
                	<tr>
                	<th>Total_marks</th>
                	<th>Student_ID</th>
                	<th>Name</th>
          
                	</tr>
                	<c:forEach var="row" items="${result.rows }">
                	<tr>
                	<td><c:out value="${row.Total_marks}"/></td>
                	<td><c:out value="${row.Std_ID}"/></td>
                	<td><c:out value="${row.Name}"/></td>
                	</tr>
                	</c:forEach>
                	</table>
             	<%} %>
             	
             	
             	<% if(request.getParameter("r").equals("8")) {%>
                      <sql:query dataSource="${UserDB}" var="result">
                	select *from tbl_st_details_937587 where Name like '%k%' 
                		</sql:query>

                	<table border="1" width="50%">
                	<tr>
                	<th>Std_ID</th>
                	<th>Name</th>
                	<th>Age</th>
                	<th>Mnt_ID</th>
                	</tr>
                	<c:forEach var="row" items="${result.rows }">
                	<tr>
                	<td><c:out value="${row.Std_ID}"/></td>
                	<td><c:out value="${row.Name}"/></td>
                	<td><c:out value="${row.Age}"/></td>
                	<td><c:out value="${row.Mnt_ID}"/></td>
                	</tr>
                	</c:forEach>
                	</table>
             	<%} %>
             	
             	
             	<% if(request.getParameter("r").equals("9")) {%>
                      <sql:query dataSource="${UserDB}" var="result">
                	select s.Name,s.Std_Id from tbl_st_details_937587 s 
					left join tbl_st_marks_937587 m 
					on(s.Std_ID=m.ID) 
					where Marks = (select max(Marks) from tbl_st_marks_937587)
                		</sql:query>

                	<table border="1" width="50%">
                	<tr>
                	<th>Std_ID</th>
                	<th>Name</th>
                	</tr>
                	<c:forEach var="row" items="${result.rows }">
                	<tr>
                	<td><c:out value="${row.Std_ID}"/></td>
                	<td><c:out value="${row.Name}"/></td>
                	</tr>
                	</c:forEach>
                	</table>
             	<%} %>
             	
             	
             	<% if(request.getParameter("r").equals("10")) {%>
                      <sql:query dataSource="${UserDB}" var="result">
                	select s.Std_ID as Student_ID,t.Name as Student_Name,s.Mnt_ID as Mentor_ID,s.Name as Mentor_Name 
					from tbl_st_details_937587 s 
					join tbl_st_details_937587 t 
					on s.Std_ID = t.Mnt_ID

                		</sql:query>

                	<table border="1" width="50%">
                	<tr>
                	<th>Student_id</th>
                	<th>Student_Name</th>
                	<th>Mentor_ID</th>
                	<th>Mentor_Name</th>
                	</tr>
                	<c:forEach var="row" items="${result.rows }">
                	<tr>
                	<td><c:out value="${row.Student_id}"/></td>
                	<td><c:out value="${row.Student_Name}"/></td>
                	<td><c:out value="${row.Mentor_ID}"/></td>
                	<td><c:out value="${row.Mentor_Name}"/></td>
                	</tr>
                	</c:forEach>
                	</table>
             	<%} %>
             	
             	
             	
        <% }%><!-- Main if loop -->
                    
        
      
 
        </c:if>
        
      
</body>
</html>









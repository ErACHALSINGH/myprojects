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
     
	<form:form action="login" modelAttribute="login"  method="post">
	
                 <form:label path="username">Username: </form:label>   
               <form:input path="username" name="username" id="username" />
                  <br><br>       
               <form:label path="password">Password:</form:label>        
               <form:password path="password" name="password" id="password" />
            	 <br><br>
              <form:button id="login" name="login">Login</form:button>    
                  <br><br>       
              <a href="index.jsp">Home-page</a>
            
     </form:form>

</body>
</html>
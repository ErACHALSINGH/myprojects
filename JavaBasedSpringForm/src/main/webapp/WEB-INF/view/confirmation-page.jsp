<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<%@ taglib prefix ="c" uri= "http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<p>Your reservation is confirmed successfully.<br>
		please re-check the details.</p>
		First Name:${reservation.firstname }<br>
		Last Name:${reservation.lastname }<br>
		Gender:${reservation.gender }
		Meals:
		<ul>
		<c:forEach var="meal" items = "${reservation.food }">
		<li>${meal }</li>
		</c:forEach>
		</ul>
		
		Leaving from :${reservation.cityFrom }<br>
		Going to: ${reservation.cityTo }

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<%-- welcome Mr.${param.name }<br>
		your email is: ${param.email }<br>
		${fn:length(param.name) }<br>
		 --%>
		<%--  <c:import var = "data" url ="/index.jsp"/>
		 <c:out value= "${data}"/>
		 --%>
		<%--  <c:set var = "salary" value = "${250000}"/>
		 <c:if test="${salary>200000}">
		 <p>Salary is : <c:out value="${salary}"></c:out>
		 </c:if> --%>
		 <%--  <c:set var = "salary" value = "${250000}"/>
		 <p>Salary is : <c:out value="${salary}"/></p>
		 <c:choose>
		 	<c:when test="${salary<=5001}"> Salary is very low to servive</c:when>
		 	<c:when test="${salary>15000 and salary <25000}"> Salary is ok</c:when>
		 	<c:when test="${salary>50000}"> Salary is very good</c:when>
		 <c:otherwise>No comments</c:otherwise>
		 
		 
		 </c:choose>
		  --%>
		<%-- <:forEach var="i" begin ="1" end ="5">
		${"Counter Value:" }<c:out value="${i}"/>
		</:forEach>
		<c:forTokens items="this,is,a,string" delims="," var= "iteamList">
		<p><c:out value="${iteamList}"></c:out>
		</c:forTokens> --%>
		
		
		<c:redirect url="http://www.google.com"/>
		  
</body>
</html>
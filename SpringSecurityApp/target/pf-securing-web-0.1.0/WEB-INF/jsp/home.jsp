<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Spring Security Example - ProgrammingFree</title>
<!--         <link rel="stylesheet" href="app.css"/> -->
    </head>
    <body>
        <h1>Welcome to Security check!</h1>

        <p>Click <a href="<spring:url value='/hello' />">here</a> to see a greeting.</p>
    </body>
</html>
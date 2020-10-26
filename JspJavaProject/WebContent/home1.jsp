<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<%--<%
		//out.println("Welcome" + request.getParameter("uname"));
		//String adm = config.getInitParameter("admin");
		//out.println("<br> Your Admin Name: "+adm);
		%> --%>
		
		<%
			String user = request.getParameter("uname");
			out.println("Welcome: "+user);
			String pwd = config.getInitParameter("pass");
			String em = config.getInitParameter("eMail");
			out.println("<br>Your Password is : "+pwd);
			out.println("<br>Your Emil is : "+em);
			String con = application.getInitParameter("condrv");
			out.println("<br>Your Driver is : "+con);
			session.setAttribute("uname", user);
			session.setAttribute("email", em);
		%>
			<br><a href ="profile.jsp">click to see Profile</a>
</body>
</html>
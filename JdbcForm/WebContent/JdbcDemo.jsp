
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
	var = "UserYuvi"
	driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver"
	url = "jdbc:sqlserver://192.168.52.71;databaseName=Trainee_may19"
	user = "TraineeUser" password="Trainee@321" scope="session"/>
</head>
<body>

  <form method="post" name="StudentRegistration" >

<table cellpadding="2" width="20%"  align="center"

  cellspacing="2">


<tr>

  <td colspan=2>

  <center><font size=4><b>Student Registration Form</b></font></center>

  </td>

  </tr>
<tr>

  <td>Name</td>

  <td><input type="text" name="txt1"  size="30"></td>

  </tr>


<tr>

  <td>Father Name</td>

  <td><input type="text" name="txt2" 

  size="30"></td>

  </tr>

  <tr>

  <td>Postal Address</td>

  <td><input type="text" name="txt3"  size="30"></td>

  </tr>


<tr>

  <td>Personal Address</td>

  <td><input type="text" name="txt4"

   size="30"></td>

  </tr>


<tr>

  <td>Sex</td>

  <td><input type="radio" name="sex" value="male" size="10">Male

  <input type="radio" name="sex" value="Female" size="10">Female</td>

  </tr>


<tr>

  <td>City</td>

  <td><select name="City">

  <option value="NULL" selected>select..</option>

  <option value="jodhpur">Jodhpur</option>

  <option value="vadodara">Vadodara</option>

  <option value="sonipat">Sonipat</option>

  <option value="jaipur">Jaipur</option>

  </select></td>

  </tr>


<tr>

  <td>Course</td>

  <td><select name="Course">

  <option value="NULL" selected>select..</option>

  <option value="B.Tech">B.Tech</option>

  <option value="M.Tech">M.Tech</option>

  <option value="LLB">LLB</option>

  <option value="BCA">BCA</option>

  </select></td>

  </tr>


<tr>

  <td>District</td>

  <td><select name="District">

  <option value="NULL" selected>select..</option>

  <option value="jdr">Jodhpur</option>

  <option value="vda">Vadodara</option>

  <option value="son">Sonipat</option>

  <option value="jai">Jaipur</option>

  </select></td>


</tr>


<tr>

  <td>State</td>

  <td><select Name="State">

  <option value="NULL" selected>select..</option>

  <option value="Raj">Rajasthan</option>

  <option value="Guj">Gujrat</option>

  <option value="Har">Haryana</option>

  <option value="Bih">Bihar</option>

  </select></td>

  </tr>

  <tr>

  <td>PinCode</td>

  <td><input type="text" name="txt5"  size="30"></td>


</tr>

  <tr>

  <td>EmailId</td>

  <td><input type="text" name="txt6"  size="30"></td>

  </tr>


<tr>

  <td>DOB</td>

  <td><input type="text" name="txt7"  size="30"></td>

  </tr>


<tr>

  <td>MobileNo</td>

  <td><input type="text" name="txt8"  size="30"></td>

  </tr>

  <tr>

  <td colspan="2"><input type="Submit" value="Submit Form" /></td>

  </tr>

  </table>

  </form>
  
  

	
  <c:if test="${pageContext.request.method=='POST'}">

<sql:update dataSource="${UserYuvi}" var="allow">
INSERT INTO Students97 (Name,Father_Name,Postal_Address,Personal_Address,Sex,City,Course,District,States,PinCode,EmailId,DOB,MobileNo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
<sql:param value="${param.txt1}" />
<sql:param value="${param.txt2}" />
<sql:param value="${param.txt3}" />
<sql:param value="${param.txt4}" />
<sql:param value="${param.sex}" />
<sql:param value="${param.City}" />
<sql:param value="${param.Course}" />
<sql:param value="${param.District}" />
<sql:param value="${param.State}" />
<sql:param value="${param.txt5}" />
<sql:param value="${param.txt6}" />
<sql:param value="${param.txt7}" />
<sql:param value="${param.txt8}" />
</sql:update>
</c:if>
</body>
</html>
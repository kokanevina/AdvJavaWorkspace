<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SQL TAGS</title>
</head>
<body>

<a href="../EmployeeServlet?act=getall">SHOW EMPLOYEES</a> <!--  get request -->

<!--  if u use jstl then do not call session.getAttribute to extract session data
instead direct use session key -->
<table>
<c:forEach items="${eList}" var="emp">
<tr>
	<td>${emp.empId}</td>
	<td>${emp.empName}</td>
	<td>${emp.empSalary}</td>
</tr>
</c:forEach>
</table>
</body>
</html>
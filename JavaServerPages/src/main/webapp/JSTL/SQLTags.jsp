<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/sql"  prefix="sql"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
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
	<td>${fn:toLowerCase(emp.empName)}</td>
	<td><c:out value="${fn:toUpperCase(emp.empName)}"></c:out></td>
	<td>${emp.empSalary}</td>
</tr>
</c:forEach>
</table>
<h3>JSTL SQL TAGS</h3>


<sql:setDataSource 
	driver="com.mysql.cj.jdbc.Driver" 
	password="root" 
	user="root" 
	url="jdbc:mysql://localhost:3306/jdbc_veena" 
	var="conn" 
	scope="session"/>

<!--  DML: executeUpdate, Select : executeQuery -->
<sql:query var="rs" dataSource="${conn}" >select * from employee </sql:query>
<table>
<c:forEach var="row" items="${rs.rows}">
	<tr>
		<td>${row.emp_id}</td>
		<td>${row.emp_name}</td>
		<td>${row.emp_salary}</td>
	</tr>
</c:forEach>

</table>
</body>
</html>
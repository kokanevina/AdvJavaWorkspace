<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/sql"  prefix="sql"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>InsertSQL</title>
</head>
<body>
<sql:setDataSource 
	driver="com.mysql.cj.jdbc.Driver" 
	password="root" 
	user="root" 
	url="jdbc:mysql://localhost:3306/jdbc_veena" 
	var="conn" 
	scope="session"/>
	
<%-- <sql:update dataSource="${conn}" var="upcateCount">insert into employee values (45,'Kumar',34000,'BE')</sql:update> --%>
<sql:update dataSource="${conn}" var="upcateCount" sql="insert into employee values(?,?,?,?)">
	<sql:param value="${param.empId}"></sql:param>
	<sql:param value="${param.empName}"></sql:param>
	<sql:param value="${param.empSalary}"></sql:param>
	<sql:param value="${param.qual}"></sql:param>
</sql:update>

<b>Update count : ${upcateCount}</b>
<c:redirect url="SQLTags.jsp"></c:redirect> <!--  new fresh request -->
</body>
</html>
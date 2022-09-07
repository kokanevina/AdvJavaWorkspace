<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String username=(String)session.getAttribute("uname");
String name=(String)session.getAttribute("firstName");
%>
<b>Hello <span style="color:blue;"><%=name%></span> you are logged in successfully with user name <%=username%></b>
<br>
${sessionScope}
<br>
${sessionScope.uname}
${sessionScope.firstName}
${34+56}
${header}
<br>

</body>
</html>
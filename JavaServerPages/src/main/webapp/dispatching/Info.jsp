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
double num1=Double.parseDouble(request.getParameter("num1"));
double num2=Double.parseDouble(request.getParameter("num2"));
out.print("Number 1 is :"+num1 +" and Number 2 is :"+num2); // s1 response
// no need to write logic of RequestDispatcher
%>
 <jsp:forward page="Output.jsp">
 	
 </jsp:forward>  
<%-- <jsp:include page="Output.jsp"></jsp:include> --%>
</body>
</html>
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
double addition =num1+num2;
out.print("Addition is :"+addition); // s2 response
%>
</body>
</html>
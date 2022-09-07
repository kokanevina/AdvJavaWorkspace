

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Enumeration,java.util.Iterator" %>
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
double pie=(double)request.getAttribute("pie");  // if setAttribute while forwarding request
out.print("pie:"+pie);
String radius=request.getParameter("radius");// if jsp:param while forwarding request
out.print("radius:"+radius);

Enumeration<String> ee=  request.getParameterNames();
Iterator<String> itr= ee.asIterator();
while(itr.hasNext()){
	System.out.println(itr.next());
}


%>
</body>
</html>
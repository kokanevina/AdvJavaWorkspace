<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>WELCOME PAGE</h2>
<%

String data1=(String)pageContext.getAttribute("cname", PageContext.PAGE_SCOPE);
String data2=(String)pageContext.getAttribute("clocation", PageContext.REQUEST_SCOPE);
String data3=(String)pageContext.getAttribute("ccontact", PageContext.SESSION_SCOPE);
String data4=(String)pageContext.getAttribute("cestaYear", PageContext.APPLICATION_SCOPE);

%>
<h3>Data from page scope: <%=data1 %></h3>
<h3>Data from request scope: <%=data2 %></h3>
<h3>Data from session  scope: <%=data3 %></h3>
<h3>Data from application scope: <%=data4 %></h3>

${pageScope.cname}
${requestScope.clocation}
${sessionScope.ccontact}
${applicationScope.cestaYear}
</body>
</html>
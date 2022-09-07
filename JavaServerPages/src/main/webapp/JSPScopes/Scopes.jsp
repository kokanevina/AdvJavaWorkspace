<!--  Designer Unfriendly, controlling logic/businerlogic+ view : mixture 
jstl is replacement to scripting elements: declaration tag, scriptlet tag, expression tag-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Scopes</title>
</head>
<body>

<%! String company="Neosoft technology";
String location="Rabale";
String contact="9898989898";
String eYear="2004";
%>
<%
pageContext.setAttribute("cname",company,PageContext.PAGE_SCOPE);
pageContext.setAttribute("clocation",location,PageContext.REQUEST_SCOPE);
pageContext.setAttribute("ccontact",contact,PageContext.SESSION_SCOPE);
pageContext.setAttribute("cestaYear",eYear,PageContext.APPLICATION_SCOPE);

String data1=(String)pageContext.getAttribute("cname", PageContext.PAGE_SCOPE);
String data2=(String)pageContext.getAttribute("clocation", PageContext.REQUEST_SCOPE);
String data3=(String)pageContext.getAttribute("ccontact", PageContext.SESSION_SCOPE);
String data4=(String)pageContext.getAttribute("cestaYear", PageContext.APPLICATION_SCOPE);

response.sendRedirect("Destination.jsp"); 
// fresh new request : no location accessed on destination jsp
// new page gets loaded : no company name accessed on destination jsp
// sessions and application are available for every request
%>
<%-- <jsp:include page="Destination.jsp"></jsp:include> --%>
<!--  same request dispatched: location can be accessed on destination jsp
 though new page is not loaded, we are dispatching to another page: no company name accessed on destination jsp
sessions and application are available for every request -->
<h2>SCOPE PAGE</h2>
<h3>Data from page scope: <%=data1 %></h3>
<h3>Data from request scope: <%=data2 %></h3>
<h3>Data from session  scope: <%=data3 %></h3>
<h3>Data from application scope: <%=data4 %></h3>
</body>
</html>
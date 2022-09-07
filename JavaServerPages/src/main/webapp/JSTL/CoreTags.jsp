<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Core Tags</title>
</head>
<body>
<c:set var="company" value="Neosoft Technology" scope="session"></c:set>
<c:out value="company" ></c:out>
<c:out value="${company}" ></c:out>
<form action="CoreTags.jsp">
<label>Enter age:</label><input type="number"  name="age"> 
<input type="submit"> 
</form>
<c:out value="${param.age}"></c:out>
<h2>Using if tag</h2>
<c:if test="${param.age>=18}">
		<c:out value="You are valid voter"></c:out>
</c:if>
<c:if test="${param.age<18}">
		<c:out value="You are not valid voter"></c:out>
</c:if>
<h2>Using choose tag</h2>
<c:choose>
	<c:when test="${param.age>=18}">
		<c:out value="You are valid voter"></c:out>
	</c:when>
	<c:otherwise>
		<c:out value="You are not valid voter"></c:out>
	</c:otherwise>
</c:choose><br>
<%! int myArray[]={56,34,23,78,56}; %>
<%request.setAttribute("array", myArray); 
String india="India-is-my-country";
request.setAttribute("myString", india);
%>
<c:forEach items="${array}" var="num" >
	<c:out value="${num}"></c:out><br>
</c:forEach>
<c:forTokens items="${myString}" delims="-" var="token">
	<c:out value="${token}"></c:out><br>
</c:forTokens>
<c:forEach begin="1" end="10" step="1" var="i">${i}<br>
</c:forEach>
</body>
</html>
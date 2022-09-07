<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.model.UserImpl, com.pojo.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Controller</title>
</head>
<body>
${param.username}<br>
${param.pass}
<% 
UserImpl impl=new UserImpl();
String username=request.getParameter("username");
String password=request.getParameter("pass");

String name=impl.login(username, password);
if(name!=null){
	Cookie coookie=new Cookie("uname",username);
	response.addCookie(coookie);
	session.setAttribute("uname", username);
	session.setAttribute("firstName", name);
	response.sendRedirect("Welcome.jsp");
}
%>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="MyUserServlet?act=getall">Show All Users</a><br> <!--  get request -->
<b>Hello ${username}....</b> ${successMessage}
<p>You are welcome here...</p>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>LOGIN FORM</h2>
<form action="Controller.jsp" method="post">
	<label>User Name:</label><input type="text" name="username" id="uname" required><br><br>
	<label>Password:</label><input type="text" name="pass" id="pass" required><br><br>
	<input type="submit" value="LOGIN"> <input type="reset">  
</form> 

</body>
</html>
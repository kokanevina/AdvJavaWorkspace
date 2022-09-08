<%@ page language="java" contentType="text/html; charset=ISO-8859-1" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Form</title>
</head>
<body>
<h2>LOGIN FORM</h2>
${errroMessage}
<form action="LoginServlet" method="post">
<label>User Name:</label><input type="text" name="username" id="uname" ><br><br>
<label>Password:</label><input type="text" name="pass" id="pass" ><br><br>
<input type="submit" value="LOGIN"> <input type="reset">  
<input type="hidden" name="act" value="loginAction"> 
</form> 
</body>
</html>
<!--  Designer unfriendly page , less readable page, java+html: controlling logic+view logic-->
<!--  JSP Page Directive : does settings for jsp pages -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<b>Declaration tag</b><br>
<%! String message="Hello this is JSP page"; int a=78; %> 
<b>Scriptlet tag</b>
<%  
message=message.concat("my first page");
int sum=a+67;
out.print(sum+" "+message);   // JspWriter
out.print(message);
%><br>
<b>Expression tag</b>
<i><%=sum%></i> <marquee><%=message%></marquee> <!--  no ; used  -->
</html>
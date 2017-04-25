<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<html> 
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<title>Continous Assurance Platform</title> 
</head> <body bgcolor="#F5F5DC">
<img src="images.png" alt="Mountain View" style="width:300px;height:100px;"> 
<% session.removeAttribute("username"); session.removeAttribute("password"); session.invalidate(); %> 
<h1>Logout was done successfully.</h1>
<h2><a href="loginform.jsp">Login again</a></h2> 
</body> 
</html>

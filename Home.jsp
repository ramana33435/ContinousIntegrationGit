<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="Error.jsp"%> 
<html> 
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<title>Continous Assurance Platform Dev</title> 
</head> <body bgcolor="#F5F5DC">
<img src="images.png" alt="Mountain View" style="width:300px;height:100px;"> 
<br/><br/><br/><br/><br/> 
<center><h2>Welcome to Continous Assurance Platform</h2></center>
<center> <h2> <% String a=session.getAttribute("username").toString(); out.println("Welcome to  "+a); %> </h2> 
<br/> <br/> <br/><br/><br/><br/><br/> <a href="Logout.jsp">Logout</a> </center> 
</body> </html>


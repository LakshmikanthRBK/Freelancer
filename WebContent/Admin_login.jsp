<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login page</title>
</head>
<body>

<center>
<form action="Admin_servlet"  method ="get">
<center><h1>Freelancer Website</h1></center>
<center><h3>Admin Login</h3></center>
<table>
<tr>
	<td>Email:</td>
	<td><input type="text" name="email"><br></td>
</tr>
<tr>
	<td>Password:</td>
	<td><input type="password" name="password"></td>
</tr>	
<tr>
	<td><input type="submit" value="submit"></td>
</tr>
<tr>
	<td><a href="Admin_register.jsp">New User Register Here</a></td>
</tr>

</table>
</form>
</center>
</body>
</html>
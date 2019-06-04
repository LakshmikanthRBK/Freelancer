<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Register</title>
</head>

<body>
<center>
<tr><h1>Admin Registration</h1></tr>
<form action="Admin_servlet" method="post">
<table>

<tr>
	<td>First Name</td>
	<td> <input type="text" name="firstname"></td>
</tr>

<tr>
	<td>Last Name</td>
	<td><input type="text" name="lastname"></td>
</tr>


<tr>
	<td>Contact number</td>
	<td><input type="text" name="contactnumber"></td>
</tr>
<tr>
	<td>Email</td>
	<td><input type="email" name="email"></td>
</tr>

<tr>
	<td>Password</td>
	<td><input type="password" name="password"></td>
</tr>


<tr>
 	<td><input type="submit" value="submit"></td>
 </tr>

</table>
</center>
</form>
</body>
</html>
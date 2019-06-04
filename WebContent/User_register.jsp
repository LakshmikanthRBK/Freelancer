<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Register</title>
</head>

<body>
<center>
<tr><h1>User Registration</h1></tr>
<form action="User_registration_servlet" method="post">
<table>

<tr>
	<td>First Name</td>
	<td> <input type="text" name="firstname"></td>
</tr>

<tr>
	<td>Last Name</td>
	<td> <input type="text" name="lasttname"></td>
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
	<td>Skill Set1</td>
	<td><input type="checkbox" name="Skill1" value="java">Java<br></td>
</tr>
<tr>
    <td>Skill Set2</td>
	<td><input type="checkbox" name="Skill2" value="dbms">DBMS<br></td>
</tr>
<tr>
    <td>Skill Set3</td>
	<td><input type="checkbox" name="Skill3" value="DS">DS<br></td>
</tr>
<tr>
    <td>Skill Set4</td>
	<td><input type="checkbox" name="Skill4" value="DotNet">DotNet<br></td>
</tr>
<tr>
    <td>Skill Set5</td>
	<td><input type="checkbox" name="Skill5" value="OS">OS<br></td>
</tr>
<tr>
    <td>Skill Set6</td>
	<td><input type="checkbox" name="Skill6" value="CN">CN<br></td>
</tr>
<tr>
    <td>Skill Set7</td>
	<td><input type="checkbox" name="Skill7" value="JS">JS<br></td>
</tr>
<tr>
    <td>Skill Set8</td>
	<td><input type="checkbox" name="Skill8" value="MDB">MDB<br></td>
</tr>
<tr>
    <td>Skill Set9</td>
	<td><input type="checkbox" name="Skill9" value="HTML/CSS">HTML/CSS<br></td>
</tr>
<tr>
    <td>Skill Set10</td>
	<td><input type="checkbox" name="Skill10" value="SS">SS<br></td>
</tr>
<tr>
 	<td><input type="submit" value="submit"></td>
 </tr>

</table>
</center>
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to user login</title>
</head>
<body>
<h1>Welcome to user login</h1>

<%HttpSession sess=request.getSession();%>
<a href="UserProject.jsp"><%= sess.getAttribute("pt") %></a>

</body>
</html>
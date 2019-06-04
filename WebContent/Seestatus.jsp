<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
//String id = request.getParameter("userid");
try {
Class.forName("oracle.jdbc.driver.OracleDriver");
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<!DOCTYPE html>
<html>
<head>
<style>
body
{
background-color:#F5DEB3;
}
td, th {
  border: 1px solid black;
}

table {
  border-collapse: collapse;
  width: 50%;
}

th {
  height: 50px;
}

</style>
</head>
<body>

 <form action="FinalisedInfo_servlet" method="post">
<center><h1 style="color:teal;">Project Details</h1></center>
<center>
<table bgcolor="#98FB98",border="2">
<tr>
<td bgcolor="#FFA07A">Email id</td>
<td bgcolor="#7CFC00">Skill Name</td>
<td bgcolor="#FF69B4 ">Approval </td>
</tr>
<%
try{
connection = DriverManager.getConnection("jdbc:oracle:thin:@Pc254053:1521:xe","freelancer","password-1");
statement=connection.createStatement();
String sql ="select emailid,skill_name from skill_details";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td><%=resultSet.getString("emailid") %></td>
<td><%=resultSet.getString("skill_name") %></td>

	<td><input type="radio" name="approve" value="approve">Approve<br></td>
	<input type="text" name="eid" value="<%=resultSet.getString("emailid") %>" readonly>
	<input type="text" name="sn" value="<%=resultSet.getString("skill_name") %>" readonly>
</tr>

<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>

</center>
                    
  <br><br><br> 
  <center>     
         <input type="Submit" value="Submit"></a></center>  
         
       
  
</form>
</body>
</html>

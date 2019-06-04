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
<form action="Skill_Details_servlet" method="post">
 
<center><h1 style="color:teal;">Project Details</h1></center>
<center>
<table bgcolor="#98FB98",border="2">
<tr>
<td bgcolor="#FFA07A">Email id </td>
<td bgcolor="#FFA07A">Skill </td>
<td bgcolor="#FFA07A">Project Title</td>
<td bgcolor="#7CFC00">Project Duration</td>
<td bgcolor="#6495ED">Skill Set1</td>
<td bgcolor="#FF0000">Skill Set2</td>
<td bgcolor="#00BFFF ">Skill Set3</td>
<td bgcolor="#FF69B4 ">project Id </td>

</tr>
<%
try{
connection = DriverManager.getConnection("jdbc:oracle:thin:@Pc254053:1521:xe","freelancer","password-1");
statement=connection.createStatement();
String sql ="select * from project_details";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td><input type="email" name="emailid"></td>
<td><input type="text" name="skill"></td>
<td><%=resultSet.getString("projecttitle") %></td>
<td><%=resultSet.getString("projectduration") %></td>
<td><%=resultSet.getString("skillset1") %></td>
<td><%=resultSet.getString("skillset2") %></td>
<td><%=resultSet.getString("skillset3") %></td>
<td><%=resultSet.getString("projectid") %></td>
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
         <input type="Submit" value="Apply"></a></center>
       
  
</form>
</body>
</html>

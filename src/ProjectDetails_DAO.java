import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

public class ProjectDetails_DAO {
	public int addProject(ProjectDetails custregister) throws SQLException, ParseException, ClassNotFoundException {
		
		
		
        Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Pc254053:1521:xe","freelancer","password-1");  
		

      
      
      //int id=10001;
      PreparedStatement st = con.prepareStatement("INSERT INTO project_details VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,pro_seq.nextval,10001)");
     
      st.setString(1, custregister.getProjecttitle());
      st.setString(2, custregister.getProjectduration());
      st.setString(3, custregister.getSkillset1());
      st.setString(4, custregister.getSkillset2());
      st.setString(5, custregister.getSkillset3());
      st.setString(6, custregister.getSkillset4());
      st.setString(7, custregister.getSkillset5());
      st.setString(8, custregister.getSkillset6());
      st.setString(9, custregister.getSkillset7());
      st.setString(10, custregister.getSkillset8());
      st.setString(11, custregister.getSkillset9());
      st.setString(12, custregister.getSkillset10());
      st.setString(13, custregister.getRemarks());
      
      int no=st.executeUpdate();
      return no;
    }

	public String viewProject(ProjectDetails cr) throws SQLException, ClassNotFoundException {
		 Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Pc254053:1521:xe","freelancer","password-1");  
			

	      
			String c="";
	      //int id=10001;
		//System.out.println("before");
	      PreparedStatement st = con.prepareStatement("SELECT projecttitle FROM project_details");
	      //st.setString(1, cr.getProjecttitle());  
          //st.setInt(2, cr1.getMinimumexperience());  
          //st.setString(3, cr1.getEmployeeid());  
          //ProjectDetails  c=null;
          ResultSet rs = st.executeQuery();
         if(rs.next())
         {
        	  System.out.println(rs.getString(1));
        	/* c= new ProjectDetails(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getInt(14),rs.getInt(15));
        	  c=(Object)rs.getString(1);*/
        	  c=rs.getString(1);
         }
          
          
       
          return c;

               
   
        }
	
	

	     


}

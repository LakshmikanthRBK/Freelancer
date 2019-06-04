import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;

public class FinalisedInfo_DAO {
public int addFinalInfo(FinalisedInfo custregister) throws SQLException, ParseException, ClassNotFoundException {
		
		
		
        Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Pc254053:1521:xe","freelancer","password-1");  
		

      
      
      //int id=10001;
      PreparedStatement st = con.prepareStatement("INSERT INTO Proposed_project VALUES(?,?,?)");
      st.setString(1, custregister.getEmailid());

      st.setString(2, custregister.getSkill_name());
      
      st.setString(3, custregister.getStatus());
      
      
      int no=st.executeUpdate();
      
      return no;

}

}

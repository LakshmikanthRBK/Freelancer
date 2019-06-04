import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

public class User_registration_DAO {
	public int addUserRegister(User_registration custregister) throws SQLException, ParseException, ClassNotFoundException {
		
	
		
	        Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Pc254053:1521:xe","freelancer","password-1");  
			
 
	      
	      
	
          PreparedStatement st = con.prepareStatement("INSERT INTO user_details VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,user_id_seq.nextval)");
          
          st.setString(1, custregister.getFirstname());
          st.setString(2, custregister.getLastname());
          st.setString(3, custregister.getContactnumber());
          st.setString(4, custregister.getEmail());
          st.setString(5, custregister.getPassword());
          st.setString(6, custregister.getSkillset1());
          st.setString(7, custregister.getSkillset2());
          st.setString(8, custregister.getSkillset3());
          st.setString(9, custregister.getSkillset4());
          st.setString(10, custregister.getSkillset5());
          st.setString(11, custregister.getSkillset6());
          st.setString(12, custregister.getSkillset7());
          st.setString(13, custregister.getSkillset8());
          st.setString(14, custregister.getSkillset9());
          st.setString(15, custregister.getSkillset10());
          
          int no=st.executeUpdate();
          return no;
        }

	public static User_registration findUserByIdPwd(String email, String password) throws SQLException {
		Connection con = null;
		try {
			con = User_registration_DAO.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        PreparedStatement st = con.prepareStatement("SELECT * FROM user_details WHERE email=? AND password=?");
        st.setString(1, email);
        st.setString(2, password);
      // User_registration i=null;
        ResultSet rs = st.executeQuery();
        User_registration i = null;
		if(rs.next())
           i= new User_registration(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15));
       
      return i; 
	}

	private static Connection getConnection() throws ClassNotFoundException, SQLException {
		 Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Pc254053:1521:xe","freelancer","password-1");
			return con; 
	}

}

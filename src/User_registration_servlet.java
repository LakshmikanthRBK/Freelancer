

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Cust_Register_Servlet
 */
@WebServlet("/User_registration_servlet")
public class User_registration_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public User_registration_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String email, password;
	    email=request.getParameter("email");
	    password=request.getParameter("password");
	     PrintWriter out = response.getWriter();
	     
	     //InterviewDAO idao=new InterviewDAO();
	     try {
	        
	        User_registration i=User_registration_DAO.findUserByIdPwd(email, password);
	        if((i !=null))
	        {
	             HttpSession session=request.getSession();
	             session.setAttribute("int",i );
	             //out.println("please enter password and email");
	        response.sendRedirect("Userviewproject.jsp");
	     }
	        else
	        {
	        	out.println("Invalid email or password ");
	        }

	}
	     catch(Exception e)
	     {
	    	 out.println(e);
	     }
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lasttname");
		String contactnumber=request.getParameter("contactnumber");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String skillset1=request.getParameter("Skill1");
		String skillset2=request.getParameter("Skill2");
		String skillset3=request.getParameter("Skill3");
		String skillset4=request.getParameter("Skill4");
		String skillset5=request.getParameter("Skill5");
		String skillset6=request.getParameter("Skill6");
		String skillset7=request.getParameter("Skill7");
		String skillset8=request.getParameter("Skill8");
		String skillset9=request.getParameter("Skill9");
		String skillset10=request.getParameter("Skill10");
	
		
        PrintWriter out = response.getWriter();
		
        User_registration cr=new User_registration(firstname,lastname,contactnumber,email,password,skillset1,skillset2,skillset3,skillset4,skillset5,skillset6,skillset7,skillset8,skillset9,skillset10);
        
        User_registration_DAO crd =new User_registration_DAO();
        
        
      
           try {
			int no=crd.addUserRegister(cr);
			 out.print("Registration successful");
		} catch (SQLException | ClassNotFoundException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          
      
         
       }
}



	





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
@WebServlet("/Admin_servlet")
public class Admin_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admin_servlet() {
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
	        
	        Admin i=Admin_DAO.findUserByIdPwd(email, password);
	        if((i !=null))
	        {
	             HttpSession session=request.getSession();
	             session.setAttribute("int",i );
	             //out.println("please enter password and email");
	        response.sendRedirect("Adminview.jsp");
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
		String lastname=request.getParameter("lastname");
		String contactnumber=request.getParameter("contactnumber");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
	
		
        PrintWriter out = response.getWriter();
		
        Admin ar=new Admin(firstname,lastname,contactnumber,email,password);
        
        Admin_DAO ad =new Admin_DAO();
        
        
      
           try {
			int no=ad.addAdmin(ar);
			 out.print("Registration successful");
		} catch (SQLException | ClassNotFoundException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          
      
         
       }
}



	



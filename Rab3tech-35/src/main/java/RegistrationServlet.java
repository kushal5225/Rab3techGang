

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.UserDTO;




@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name	=request.getParameter("username");
		String pass	=request.getParameter("password");
		String country	=request.getParameter("country");
		String emailId	=request.getParameter("emailId");
			
			
		
	
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			
			
			try {
				Connection	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","Mom@dad123");
				
			PreparedStatement ps=conn.prepareStatement("insert into employee values(?,?,?,?)");
			ps.setString(1,name);     
			ps.setString(2,pass);  
			ps.setString(3,country);     
			ps.setString(4,emailId);  
			
			int noOfInsertedRecord=ps.executeUpdate();
		
			if(noOfInsertedRecord>0) {
				
				System.out.println("Record has been Inserrted");
				UserDTO userDTO=new UserDTO(name,pass,country,emailId);
				
				request.setAttribute("userDTO", userDTO);
				request.setAttribute("msg","Record has been Inserrted");
			
			
			
				
				request.getRequestDispatcher("abcInserted.jsp").forward(request,response);

			}
			
			else {
				System.out.println(" You are invalid User");
				request.setAttribute("msg","Re-try...login again!!!");
				
			}
			
			
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
				
				
				
		
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

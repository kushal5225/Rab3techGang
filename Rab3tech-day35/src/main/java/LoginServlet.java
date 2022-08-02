

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name=request.getParameter("username");
		String pass=request.getParameter("password");
		
		
		if ("kushal".equals(name) && "1234".equals(pass)){
			request.getRequestDispatcher("Valid.jsp").forward(request,response);;
			
			//request.getRequestDispatcher("Valid.html").forward(request, response);
		}
		
		
		
		else {
			request.setAttribute("message","Invalid user .... Please login again");
			/*RequestDispatcher rd=request.getRequestDispatcher("Response.jsp");
			rd.forward(request, response);
			*/
			response.sendRedirect("https://www.google.com/"); 
		}
		
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

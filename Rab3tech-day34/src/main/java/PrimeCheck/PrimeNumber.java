package PrimeCheck;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimeNumber
 */
@WebServlet("/PrimeNumber")
public class PrimeNumber extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
		String Input1	=request.getParameter("input");
		
		int x=Integer.parseInt(Input1);
		int count = 0;
		for(int i=1;i<=x;i++) {
			if (x%i==0) {
				
				count++;
			}
		}
		if (count == 2) {

			request.getRequestDispatcher("result.jsp").forward(request,response);
		  }
		 else {
				request.getRequestDispatcher("primecheck.jsp").forward(request,response);
		  }
		
		
		
		
		
		
		

		
		
	
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
}

package FactorialServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Factorial")
public class Factorial extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Input1	=request.getParameter("input");
		int i=Integer.parseInt(Input1);
		int fact=1;
		
		for( ;i>0;i--) {
			fact=fact*i;
		}
			System.out.println(fact);
			request.setAttribute("solution",fact);
			RequestDispatcher rd=request.getRequestDispatcher("Output.jsp");
			rd.forward(request, response);
	}
            
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

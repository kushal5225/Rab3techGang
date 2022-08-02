package com.servlet;

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

/**
 * Servlet implementation class deletServlet
 */
@WebServlet("/deletServlet")
public class deletServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name	=request.getParameter("username");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			
			
			try {
				Connection	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","Mom@dad123");
				
			PreparedStatement ps=conn.prepareStatement("delete  from employee where username=? ");
			ps.setString(1,name);  
		
			int noOfDeletedRecord=ps.executeUpdate();
                if(noOfDeletedRecord>0) {
				
				System.out.println("Record has been deleted");
				request.setAttribute("deletMsg","Record deleted successfully");
request.getRequestDispatcher("LoginServlet2").forward(request, response);
                }
                else {
        			System.out.println("Record has not been deleted");
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

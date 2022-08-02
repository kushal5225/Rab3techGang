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


@WebServlet("/editServlet")
public class editServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	String name	=request.getParameter("username");
	String pass	=request.getParameter("password");
    String country=request.getParameter("country");
    String emailId=request.getParameter("emailId");

		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			
			
			try {
				Connection	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","Mom@dad123");
				String sql="UPDATE employee SET password=?,country=?,emailId=? where username=?";
				PreparedStatement ps=conn.prepareStatement(sql);
			    
				ps.setString(1,pass);  
				ps.setString(2,country);     
				ps.setString(3,emailId);  
				ps.setString(4,name); 
			
		
			int noOfeditRecord=ps.executeUpdate();
                if(noOfeditRecord>0) {
				
				System.out.println("Record has been updated");
				
               UserDTO userDTO=new UserDTO(name,pass,country,emailId);
				
				request.setAttribute("userDTO", userDTO);
				
				request.setAttribute("Msg","Record updated successfully");
                request.getRequestDispatcher("LoginServlet2").forward(request, response);
                }
                else {
        			System.out.println("Record has not been updated");
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

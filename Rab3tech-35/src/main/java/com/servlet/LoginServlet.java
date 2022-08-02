package com.servlet;

import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name	=request.getParameter("username");
	String pass	=request.getParameter("password");
		
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			
			
			try {
				Connection	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","Mom@dad123");
				
			PreparedStatement ps=conn.prepareStatement("select   * from employee where username=? and password=?");
			ps.setString(1,name);     
			ps.setString(2,pass);  
			
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				
				System.out.println("you are a valid user");
				
				String username=rs.getString(1);
				String password=rs.getString(2);
				String country=rs.getString(3);	
				String emailId=rs.getString(4);
				
			
			
				request.setAttribute("username",username);
				request.setAttribute("password",password);
				request.setAttribute("country",country);
				request.setAttribute("emailId",emailId);
			
				
				request.getRequestDispatcher("congratulation.jsp").forward(request,response);
				System.out.println(rs.getString(1)+"   "+rs.getString(2)+"   "+rs.getString(3)+"   "+rs.getString(4));
			}
			
			else {
				System.out.println(" You are invalid User");
				request.setAttribute("msg","Re-try...login again!!!");
				request.getRequestDispatcher("login.jsp").forward(request,response);
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
	
		doGet(request, response);
	}

}

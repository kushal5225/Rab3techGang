package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.UserDTO;


@WebServlet("/LoginServlet2")
public class LoginServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			
			
			try {
				Connection	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","Mom@dad123");
				
			PreparedStatement ps=conn.prepareStatement("select  * from employee ");
	
			List<UserDTO> userdto = new ArrayList<>();
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				
				System.out.println("you are a valid user");
			String username=rs.getString(1);
				 String password=rs.getString(2);
				String country=rs.getString(3);	
				String emailId=rs.getString(4);
				
			
		
				//request.setAttribute("username",username);
				//request.setAttribute("password",password);
				//request.setAttribute("country",country);
				//request.setAttribute("emailId",emailId);
			
				
				UserDTO userDTO=new UserDTO(username, password,country,emailId);
				
				userdto.add(userDTO); 
				
			}
			request.setAttribute("userdto",userdto);

			request.getRequestDispatcher("abc.jsp").forward(request,response);
			
			
			
			conn.close();
			
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

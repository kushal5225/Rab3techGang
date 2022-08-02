package preparedStatement;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetrievalOperation {
	
	static String dbURL="jdbc:mysql://localhost:3306/employeedb";
	static String username="root";
	static String password="Mom@dad123"; 
	static Connection conn=null;
	
	
	
	public static void main(String[] args) {
		
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			
			 try {
			
				conn=DriverManager.getConnection(dbURL,username,password);
				//create a statement
				PreparedStatement ps=conn.prepareStatement("select * from employee where id=?");
				ps.setInt(1,2);     //  ?=4
				
				
			
			
			ResultSet rs=ps.executeQuery(); //it returns ResultSet
			 
			while (rs.next()) {
			
			System.out.println(rs.getString(1)+"   "+rs.getString(2)+"   "+rs.getString(3)+"   "+rs.getString(4));
			}
			
			 		} catch (SQLException e) {
			
				e.printStackTrace();
			 	}
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
		
		
		try {
				
					conn.close();
						} catch (SQLException e) {
			
			e.printStackTrace();
							}
		
		}
	}

}

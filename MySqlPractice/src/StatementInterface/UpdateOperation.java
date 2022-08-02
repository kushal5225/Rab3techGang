package StatementInterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateOperation {
	static	Connection conn=null;
	static String username="root";
	static String password="Mom@dad123";
	static String dbURL="jdbc:mysql://localhost:3306/officedb";
	
	public static void main(String[] args) {
		
	
try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			
			 try {
			
				conn=DriverManager.getConnection(dbURL,username,password);
				//create a statement
				//PreparedStatement ps=conn.prepareStatement("delete from dept where id=?"); // Delete Operation
				//ps.setInt(1,3);
				Statement st=conn.createStatement();
				String sql="UPDATE dept SET firstname='kushal', lastname='shrestha'  where id=2";
				

				
				 
				
				int i=st.executeUpdate(sql); //it returns int type value
				 
				if (i>0) {
						System.out.println("Record inserted successfully");
				}
				else {
					System.out.println("Record not inserted");
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
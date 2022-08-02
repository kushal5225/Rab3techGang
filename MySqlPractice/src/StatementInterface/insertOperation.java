package StatementInterface;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;

public class insertOperation {
	static	Connection conn=null;
	static String username="root";
	static String password="Mom@dad123";
	static String dbURL="jdbc:mysql://localhost:3306/officedb";
	
	public static void main(String[] args) {
		

		try {
			//1. Load/register driver class
			Class.forName("com.mysql.jdbc.Driver");
			
			
			 try {
				//2. Create a connection
				conn=DriverManager.getConnection(dbURL,username,password);
				
				
				//3. create a statement
				
				
				Statement st=conn.createStatement();
				String sql="insert into dept values(1,'Ram','Shrestha')";
				
						
				//4. execute query
				int i=st.executeUpdate(sql); //it returns int type value
			 
			if (i>0) {
					System.out.println("Record inserted successfully");
			}
			else {
				System.out.println("Record not inserted");
			}
			 		} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 	}
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
		
		
		try {
				//close the connection
					conn.close();
						} catch (SQLException e) {
			
			e.printStackTrace();
							}

		}
	}
}
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Office3 {
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
				PreparedStatement ps=conn.prepareStatement("UPDATE dept SET firstname=?, lastname=?  where id=?"); //update operation
				ps.setString(1,"Mr Mohan");
				ps.setString(2,"Tamang");
				ps.setInt(3,6);
				

				
			
			
			int x=ps.executeUpdate(); //it returns ResultSet
			 
			if (x>0) {
				System.out.println(x );
				System.out.println("Successfully " );
			}
			else {
				System.out.println(x);
				System.out.println("Unsuccessfull");
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

		
		
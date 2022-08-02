import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Office2 {
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
				PreparedStatement ps=conn.prepareStatement("insert into dept values(?,?,?)"); //insert operation
				ps.setInt(1,9);
				ps.setString(2,"Bijay");
				ps.setString(3,"Tamang");
			

				
			
			
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

		
		
package StatementInterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectOperation {
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
				String sql="select * from dept ";
				

				ResultSet rs=st.executeQuery(sql); //it returns ResultSet
				 
				while (rs.next()) {
				//System.out.println(rs.getInt("id")+"   "+rs.getString("name")+"   "+rs.getString("country")+"   "+rs.getString("emaiId"));	
				
				System.out.println(rs.getString(1)+"   "+rs.getString(2)+"   "+rs.getString(3));
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
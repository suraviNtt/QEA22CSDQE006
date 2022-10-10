package jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class B {
	
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost/qea22csdqe006";
		String username = "root";
		String password = "";
		
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			
			PreparedStatement ps = connection.prepareStatement("insert into employee value( ? , ? , ? , ?)");
			ps.setInt(1, 104);
			ps.setString(2, "Shreyash");
			ps.setString(3, "Centrall");
			ps.setString(4, "Chennai");
			ps.execute();
			ps.setInt(1, 105);
			ps.setString(2, "Ravi");
			ps.setString(3, "park Street");
			ps.setString(4, "Kolkata");
			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

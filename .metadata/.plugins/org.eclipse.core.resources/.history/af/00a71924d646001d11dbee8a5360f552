package jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class C {
	
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost/qea22csdqe006";
		String username = "root";
		String password = "";
		
		try {
			Connection conn = DriverManager.getConnection(url, username, password);
			
			PreparedStatement ps = conn.prepareStatement("Update employee set ename=(?) where eid=(?) ");		
			ps.setString(1, "Yash");
			ps.setInt(2, 103);
			ps.execute();
			ps.setString(1, "Soumya");
			ps.setInt(2, 104);
			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

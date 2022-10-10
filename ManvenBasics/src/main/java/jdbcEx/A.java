package jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class A {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost/qea22csdqe006";
		String username = "root";
		String password = "";

		try {
			Connection conn = DriverManager.getConnection(url, username, password);

			Statement stm = conn.createStatement();
			stm.execute("insert into employee value( 100 , 'Suravi' , 'Sompuragate' , 'Bangalore')");

			ResultSet rs = stm.executeQuery("Select * from employee");
			while (rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

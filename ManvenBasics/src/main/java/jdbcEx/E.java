package jdbcEx;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class E {

	public static void main(String[] args) throws IOException {

		String url = "jdbc:mysql://localhost/qea22csdqe006";
		String username = "root";
		String password = "";

		try {
			Connection conn = DriverManager.getConnection(url, username, password);

			PreparedStatement stm = conn.prepareStatement("insert into blobex value( ? , ?)");
			stm.setInt(1, 106);
			FileReader f = new FileReader("E://testfile.txt");
			stm.setClob(2, f);
			stm.execute();
			stm.setInt(1, 107);
			FileReader f1 = new FileReader("E://testfile.txt");
			stm.setClob(2, f1);
			stm.execute();

			ResultSet rs = stm.executeQuery("Select * from blobex");
			int n = 0;
			while (rs.next()) {
				int i = rs.getInt(1);
				System.out.println(i);
				Clob c = rs.getClob(2);
				Reader r = c.getCharacterStream();
				FileWriter fw = new FileWriter("E://testfile" + n + ".txt");
				int start;
				while ((start = r.read()) != -1) {
					fw.write(start);
				}
				fw.close();
				n++;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

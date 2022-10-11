package jdbcEx;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class D {
	public static void main(String[] args) throws IOException {

		String url = "jdbc:mysql://localhost/qea22csdqe006";
		String username = "root";
		String password = "";

		try {
			Connection conn = DriverManager.getConnection(url, username, password);

			PreparedStatement stm = conn.prepareStatement("insert into blobex value( ? , ?)");
			stm.setInt(1, 102);
			FileInputStream f = new FileInputStream("E://avatargirl.jpg");
			stm.setBlob(2, f);
			stm.execute();
			stm.setInt(1, 103);
			FileInputStream f1 = new FileInputStream("E://avatargirl.jpg");
			stm.setBlob(2, f1);
			stm.execute();

			ResultSet rs = stm.executeQuery("Select * from blobex");
			while (rs.next()) {
				int i = rs.getInt(1);
				System.out.println(i);
				Blob b = rs.getBlob(2);
				byte[] arr = b.getBytes(1, (int) b.length());
				FileOutputStream fo = new FileOutputStream("E://avatargirl"+i+".jpg");
				fo.write(arr);
				fo.close();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

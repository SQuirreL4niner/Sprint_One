package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		String query = "SELECT TWO FROM TEST";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","admin","none");
			Statement okay = con.createStatement();
			ResultSet okayokay = okay.executeQuery(query);
			while (okayokay.next())
			{
				System.out.println(okayokay.getString(1));
				
				
			}
				
				
				
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}

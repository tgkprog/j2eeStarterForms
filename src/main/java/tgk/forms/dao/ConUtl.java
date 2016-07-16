package tgk.forms.dao;

import java.sql.*;

public class ConUtl {
	
	public static void close(Connection con){
		if(con != null){
			try {
				con.close();
			} catch (Exception e) {
				// iggy
			}
		}
	}

	public static Connection getCon() throws Exception {

		// mysql driver
		String driver = "com.mysql.jdbc.Driver";

		// the "url" to our DB, the last part is the name of the DB
		String url = "jdbc:mysql://localhost/d2";

		// the default DB username and password may be the same as your control
		// panel login

		String name = "root";
		String pass = "p1";

		// Test the DB connection by making an empty table
		// String tableStr = "CREATE.....table test (testid mediumint(8), name
		// varchar(100))";
		Class.forName(driver);

		// initialize the Connection, with our DB info ...
		Connection con = DriverManager.getConnection(url, name, pass);
		return con;
	}
}
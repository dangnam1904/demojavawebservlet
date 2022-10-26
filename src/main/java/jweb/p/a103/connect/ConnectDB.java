package jweb.p.a103.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	public static Connection getConnection() {

		String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=JWEB.P.A103;";
		String USER_NAME = "sa";
		String PASSWORD = "dangnam";
		Connection conn = null;
		try {

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println(e);
		}
		return conn;
	}

}

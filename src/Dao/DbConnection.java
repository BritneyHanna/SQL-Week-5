package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	private final static String URL = "jdbc:mysql://localhost:3306/shoes";
	private final static String USERNAME = "root";
	private final static String PASSWORD = "password";
	private static Connection connection;
	private static DbConnection instance;

	private DbConnection(Connection connection) {
		this.connection = connection;

	}

	public static Connection getConnection() {

		if (instance == null) {
			try {
				connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				instance = new DbConnection(connection);
				System.out.println("Connected Successfully");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return DbConnection.connection;
	}

}

//
//	public static void main(String[] args) throws SQLException {
//		Connection conn = null;
//		final String connectionStr = "jdbc:mysql://localhost:3306/shoes";
//
//		try {
//			System.out.println("Attempting to connect to DB...");
//
//			conn = DriverManager.getConnection(connectionStr, "root", "password");
//
//			System.out.println("Successfully connected to Shoes DB\n");
//
//		} catch (SQLException e) {
//			System.out.println("Unable to connect to Database");
//			e.printStackTrace();
//
//		} finally {
//			if (conn != null) {
//				System.out.println("\nClosing DB connection...");
//
//				conn.close();
//
//				System.out.println("Successfully disconnected from DB");
//
//			}
//		}
//
//	}

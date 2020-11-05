package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ShoeDao {
	private Connection connection;
	private final String CREATE_NEW_SHOE_QUERY = "INSERT INTO shoes(shoe_id,shoe_name) VALUES (?,?)";
	private final String DELETE_SHOE_BY_ID_QUERY = "DELETE FROM shoes WHERE shoe_id = ? ";
	private final String DISPLAY_SHOE_BY_ID = " SELECT * FROM shoes WHERE shoe_id = ?";
	private final String UPDATE_SHOE_BY_ID = "UPDATE shoes SET shoe_id = ? WHERE shoe_name = ?";

	public ShoeDao() {
		connection = DbConnection.getConnection();
	}

	public void createNewShoe(int shoe_id, String shoe_name) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(CREATE_NEW_SHOE_QUERY);
		ps.setInt(1, shoe_id);
		ps.setString(2, shoe_name);
		ps.executeUpdate();
	}

	public void deleteShoebyId(int shoe_id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(DELETE_SHOE_BY_ID_QUERY);

		ps.setInt(1, shoe_id);
		ps.executeUpdate();
	}

	public void displayShoebyId(int shoe_id) throws SQLException {

		PreparedStatement ps = connection.prepareStatement(DISPLAY_SHOE_BY_ID);

		ps.setInt(1, shoe_id);
		ps.executeQuery();
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println("The shoe id and name are: " + rs.getInt("shoe_id") + " " + rs.getString("shoe_name"));
		}

	}

	public void updateShoebyId(String shoe_name, int shoe_id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(UPDATE_SHOE_BY_ID);
		ps.setInt(1, shoe_id);
		ps.setString(2, shoe_name);
		ps.executeUpdate();

	}
}

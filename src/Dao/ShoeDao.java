package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ShoeDao {
	private Connection connection;
	private final String CREATE_NEW_SHOE_QUERY = "INSERT INTO shoes(shoe_id,shoe_name) VALUES (?,?)";

	public ShoeDao() {
		connection = DbConnection.getConnection();
	}

	public void createNewShoe(int shoe_id, String shoe_name) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(CREATE_NEW_SHOE_QUERY);
		ps.setInt(1, shoe_id);
		ps.setString(2, shoe_name);
		ps.executeUpdate();
	}

}

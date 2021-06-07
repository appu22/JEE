package com.amazon.registerapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.amazon.registerapp.dbconstants.DBConstants;
import com.amazon.registerapp.dto.RegisterDTO;

public class RegisterDaoImple implements RegisterDao {

	@Override
	public void save(RegisterDTO dto) throws SQLException {

		System.out.println("===save method invoking===");
		Connection connection = null;
		try {
			Class.forName(DBConstants.DRIVER);
			connection = DriverManager.getConnection(DBConstants.URL, DBConstants.USERNAME, DBConstants.PASSWORD);
			connection.setAutoCommit(false);
			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into register_table values(?,?,?,?,?)");
		preparedStatement.setInt(1, 4);
			preparedStatement.setString(2, dto.getName());
			preparedStatement.setString(3, dto.getMobileNo());
			preparedStatement.setString(4, dto.getEmail());
			preparedStatement.setString(5, dto.getPassword());
			int inserted = preparedStatement.executeUpdate();
			System.out.println("Row insterd ==" + inserted);
			preparedStatement.close();
			connection.commit();

		} catch (ClassNotFoundException | SQLException exception) {
			exception.printStackTrace();
			connection.rollback();

		} finally {
			connection.close();
		}

	}

}

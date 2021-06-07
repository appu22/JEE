package com.xworkz.flipkartapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.flipkartapp.dbconstants.DBConstants;
import com.xworkz.flipkartapp.dto.FlipkartappRegisterDTO;

public class FlipkartRegisterDAOImple implements FlipkartRegisterDAO {

	@Override
	public void saveRegister(FlipkartappRegisterDTO dto) throws Exception{
		System.out.println("saveRegister invoking...");
		Class.forName(DBConstants.DRIVER);
		Connection connc = null;
		try (Connection connection = DriverManager.getConnection(DBConstants.URL, DBConstants.USERNAME,
				DBConstants.PASSWORD)) {
			connc = connection;
			connection.setAutoCommit(false);
			String sql = "insert into flipkart_register_table values(?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareCall(sql);
			preparedStatement.setInt(1, 3);
			preparedStatement.setString(2, dto.getName());
			preparedStatement.setString(3, dto.getLastName());
			preparedStatement.setString(4, dto.getMobileNo());
			preparedStatement.setString(5, dto.getEmailId());
			preparedStatement.executeUpdate();
			connection.commit();

		} catch (Exception e) {
			e.printStackTrace();
			connc.rollback();
		}
	}

}

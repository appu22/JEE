package com.amazon.registerapp.dao;

import java.sql.SQLException;

import com.amazon.registerapp.dto.RegisterDTO;

public interface RegisterDao {
	
	void save(RegisterDTO dto) throws SQLException;

}

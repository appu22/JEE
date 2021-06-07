package com.xworkz.flipkartapp.dao;

import java.sql.SQLException;

import com.xworkz.flipkartapp.dto.FlipkartappRegisterDTO;

public interface FlipkartRegisterDAO {

	
	void saveRegister(FlipkartappRegisterDTO dto)throws Exception;
	
	
}

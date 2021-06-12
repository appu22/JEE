package com.xworkz.instaregisterapp.dao;

import java.sql.SQLException;

import com.xworkz.instaregisterapp.dto.InstaRegisterDTO;

public interface InstaRegisterDAO {
	
	
	void save(InstaRegisterDTO dto)throws SQLException ;

}

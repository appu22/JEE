package com.xworkz.flipkartapp.service;

import java.sql.SQLException;

import com.xworkz.flipkartapp.dto.FlipkartappRegisterDTO;

public interface FlipkartRegisterService {
	// bydefualt public
	void validateAndSave(FlipkartappRegisterDTO dto);

}

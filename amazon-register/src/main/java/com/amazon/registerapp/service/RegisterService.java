package com.amazon.registerapp.service;

import com.amazon.registerapp.dto.RegisterDTO;

public interface RegisterService {

	void validateAndSave(RegisterDTO dto);
}

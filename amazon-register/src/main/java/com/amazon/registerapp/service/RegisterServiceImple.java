package com.amazon.registerapp.service;

import com.amazon.registerapp.dao.RegisterDao;
import com.amazon.registerapp.dao.RegisterDaoImple;
import com.amazon.registerapp.dto.RegisterDTO;

public class RegisterServiceImple implements RegisterService {

//	RegisterDao dao;
	private  RegisterDao dao = new RegisterDaoImple();

	public RegisterServiceImple() {
		System.out.println("========RegisterServiceImple =====");
		
	}

	@Override
	public void validateAndSave(RegisterDTO dto) {
		System.out.println("====validateAndSave invoking===");
		try {
			if (dto.getName() != null) {
				dao.save(dto);
			} else {
				System.out.println("Enter Name  ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

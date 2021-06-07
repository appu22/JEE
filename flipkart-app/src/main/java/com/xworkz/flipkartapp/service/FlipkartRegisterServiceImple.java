package com.xworkz.flipkartapp.service;

import java.sql.SQLException;

import com.xworkz.flipkartapp.dao.FlipkartRegisterDAO;
import com.xworkz.flipkartapp.dao.FlipkartRegisterDAOImple;
import com.xworkz.flipkartapp.dto.FlipkartappRegisterDTO;

public class FlipkartRegisterServiceImple implements FlipkartRegisterService {

	FlipkartRegisterDAO daoimple = new FlipkartRegisterDAOImple();

	public FlipkartRegisterServiceImple() {
		System.out.println("FlipkartRegisterServiceImple object created......");
	}

	@Override
	public void validateAndSave(FlipkartappRegisterDTO dto) {
		System.out.println("validateAndSave invoking....");
		boolean flag = true;
		try {
			if (dto.getName() != null) {
				
				System.out.println("Enterd name is  " + dto.getName());
			}
			if (dto.getLastName() != null) {
				System.out.println("Enterd LastName is  " + dto.getLastName());
			}
			if (dto.getMobileNo() != null) {
				System.out.println("Enterd Mobile no is  " + dto.getMobileNo());
			}
			if (dto.getEmailId() != null) {
				System.out.println("Enterd email id  is  " + dto.getEmailId());
			}
			if (flag) {
				daoimple.saveRegister(dto);
			}

			else {
				System.out.println("Please enter Valid Input .....! ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
//			flag=false;
//			return flag;
//		} else if (dto.getLastName() != null) {
//			flag = true;
//			System.out.println("Please enter last name ");
//		} else if (dto.getMobileNo() != null) {
//			flag = true;
//			System.out.println("Please enter Mobile no ");
//		} else if (dto.getEmailId() != null) {
//			flag = true;
//			System.out.println("Please enter Email_ID");
//		}
//		try {
//			daoimple.saveRegister(dto);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
	}

}

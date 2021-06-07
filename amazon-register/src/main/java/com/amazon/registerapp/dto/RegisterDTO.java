package com.amazon.registerapp.dto;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class RegisterDTO {

	private int registerId;
	@NonNull
	private String name;
	@NonNull
	private String mobileNo;
	@NonNull
	private String email;
	@NonNull
	private String password;

	public RegisterDTO() {
		System.out.println(getClass().getName()+" RegisterDTO");
	}
}

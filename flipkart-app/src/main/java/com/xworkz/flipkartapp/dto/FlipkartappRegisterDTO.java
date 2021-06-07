package com.xworkz.flipkartapp.dto;

import java.io.Serializable;


import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor

public class FlipkartappRegisterDTO  implements Serializable{
	
	private int id;
	@NonNull
	private String name;
	@NonNull
	private String lastName;
	@NonNull
	private String mobileNo;
	@NonNull
	private String emailId;
	public FlipkartappRegisterDTO() {
		System.out.println("+++++++++++++++ FlipkartappRegisterDTO  OBJECT CREATED.++++++++");
	}

}

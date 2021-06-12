package com.xworkz.instaregisterapp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.internal.NotNull;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "insta_register_table")
public class InstaRegisterDTO implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "R_ID")
	private int id;

	@NonNull
	@Column(name = "R_NAME")
	private String name;
	@NonNull
	@Column(name = "R_LAST_NAME")
	private String lastname;

	@NonNull
	@Column(name = "R_MOBILE_NO")
	private String mobileNo;

	@NonNull
	@Column(name = "R_GENDER")
	private String gender;

	public InstaRegisterDTO() {
		System.out.println(this.getClass().getName() + " object created  InstaRegisterDTO ");

	}

}

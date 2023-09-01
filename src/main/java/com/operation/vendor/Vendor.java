package com.operation.vendor;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Vendor {
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String password;
	private String address;
	private String city;
	private String area;
	private String postCode;
	private String photo;
	
}

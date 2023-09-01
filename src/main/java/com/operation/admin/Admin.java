package com.operation.admin;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Service
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Admin {

	
	private int id;
	private String name;
	private String email;
	private String password;
}

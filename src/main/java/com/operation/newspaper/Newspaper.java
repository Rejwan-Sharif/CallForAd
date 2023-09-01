package com.operation.newspaper;

import java.sql.Date;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Service
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Newspaper {
	
	private int id;
	private String newspaperName;
	private String name;
	private String organizationName;
	private String phone;
	private String email;
	private Date publishDate;
	private String adTitle;
	private String adDescription;
	private String document;
	private String publishStatus;
	
}

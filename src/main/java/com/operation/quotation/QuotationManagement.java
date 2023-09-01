package com.operation.quotation;

import java.sql.Date;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuotationManagement {

	private int quotationId;
	private int adId;
	private int vendorId;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private Date fromDate;
	private Date toDate;
	private String address;
	private String message;
	
	
}

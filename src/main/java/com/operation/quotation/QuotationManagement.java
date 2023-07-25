package com.operation.quotation;

import java.sql.Date;

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
	
	
	public QuotationManagement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QuotationManagement(int quotationId, int adId, int vendorId, String firstName, String lastName, String email,
			String phone, Date fromDate, Date toDate, String address, String message) {
		super();
		this.quotationId = quotationId;
		this.adId = adId;
		this.vendorId = vendorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.address = address;
		this.message = message;
		
	}

	public int getQuotationId() {
		return quotationId;
	}

	public void setQuotationId(int quotationId) {
		this.quotationId = quotationId;
	}

	public int getAdId() {
		return adId;
	}

	public void setAdId(int adId) {
		this.adId = adId;
	}

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}

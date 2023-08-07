package com.operation.hireAd;

import org.springframework.stereotype.Service;

@Service
public class HireAd {
	
  private int adId;
  private String title;
  private String location;
  private String name;
  private String phone;
  private String email;
  private String address;
  private String type;
  private String purpose;
  private String city;
  private String facing;
  private String otherInfo;
  private int vendorId;
public HireAd(int adId, String title, String location, String name, String phone, String email, String address,
		String type, String purpose, String city, String facing, String otherInfo, int vendorId) {
	super();
	this.adId = adId;
	this.title = title;
	this.location = location;
	this.name = name;
	this.phone = phone;
	this.email = email;
	this.address = address;
	this.type = type;
	this.purpose = purpose;
	this.city = city;
	this.facing = facing;
	this.otherInfo = otherInfo;
	this.vendorId = vendorId;
}

public HireAd() {
	super();
	// TODO Auto-generated constructor stub
}
	
public int getVendorId() {
	return vendorId;
}

public void setVendorId(int vendorId) {
	this.vendorId = vendorId;
}

public int getAdId() {
	return adId;
}

public void setAdId(int adId) {
	this.adId = adId;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getPurpose() {
	return purpose;
}

public void setPurpose(String purpose) {
	this.purpose = purpose;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getFacing() {
	return facing;
}

public void setFacing(String facing) {
	this.facing = facing;
}

public String getOtherInfo() {
	return otherInfo;
}

public void setOtherInfo(String otherInfo) {
	this.otherInfo = otherInfo;
}
  
  
}

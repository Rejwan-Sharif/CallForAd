package com.operation.ad;

public class AdManagement {
	
	private int id;
	private String title;
	private String location;
	private String type;
	private String status;
	private double height;
	private double width;
	private String area;
	private String purpose;
	private String facing;
	private double price;
	private String title_image;
	private String second_image;
	private String third_image;
	private String fourth_image;
	private String final_image;
	private String other_details;
	private String adStatus;
	private int vendorId;
	
	

	public AdManagement(int id, String title, String location, String type, String status, double height, double width,
			String area, String purpose, String facing, double price, String title_image, String second_image,
			String third_image, String fourth_image, String final_image, String other_details, String adStatus,
			int vendorId) {
		super();
		this.id = id;
		this.title = title;
		this.location = location;
		this.type = type;
		this.status = status;
		this.height = height;
		this.width = width;
		this.area = area;
		this.purpose = purpose;
		this.facing = facing;
		this.price = price;
		this.title_image = title_image;
		this.second_image = second_image;
		this.third_image = third_image;
		this.fourth_image = fourth_image;
		this.final_image = final_image;
		this.other_details = other_details;
		this.adStatus = adStatus;
		this.vendorId = vendorId;
	}

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public AdManagement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getFacing() {
		return facing;
	}

	public void setFacing(String facing) {
		this.facing = facing;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTitle_image() {
		return title_image;
	}

	public void setTitle_image(String title_image) {
		this.title_image = title_image;
	}

	public String getSecond_image() {
		return second_image;
	}

	public void setSecond_image(String second_image) {
		this.second_image = second_image;
	}

	public String getThird_image() {
		return third_image;
	}

	public void setThird_image(String third_image) {
		this.third_image = third_image;
	}

	public String getFourth_image() {
		return fourth_image;
	}

	public void setFourth_image(String fourth_image) {
		this.fourth_image = fourth_image;
	}

	public String getFinal_image() {
		return final_image;
	}

	public void setFinal_image(String final_image) {
		this.final_image = final_image;
	}

	public String getOther_details() {
		return other_details;
	}

	public void setOther_details(String other_details) {
		this.other_details = other_details;
	}

	public String getAdStatus() {
		return adStatus;
	}

	public void setAdStatus(String adStatus) {
		this.adStatus = adStatus;
	}
	
	
	

}

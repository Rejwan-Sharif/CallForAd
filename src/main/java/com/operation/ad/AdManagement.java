package com.operation.ad;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Service
@Data
@NoArgsConstructor
@AllArgsConstructor
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
	private String promotionStatus;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String photo;
	private String city;

}

package com.operation.hireAd;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor

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
  
  
}

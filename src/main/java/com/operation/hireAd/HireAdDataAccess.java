package com.operation.hireAd;

import java.sql.PreparedStatement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operation.db;

@Service


public class HireAdDataAccess {
	
	@Autowired
	HireAd hire;
	
	PreparedStatement pst;
		
	
	
	public HireAd insertAd(HireAd hire) {
		try {
			
			pst = db.get().prepareStatement("insert into hire_ad values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
			pst.setString(1, null);
			pst.setString(2, hire.getTitle());
			pst.setString(3, hire.getLocation());
			pst.setString(4, hire.getName());
			pst.setString(5, hire.getPhone());
			pst.setString(6, hire.getEmail());
			pst.setString(7, hire.getAddress());
			pst.setString(8, hire.getType());
			pst.setString(9, hire.getPurpose());
			pst.setString(10, hire.getCity());
			pst.setString(11, hire.getFacing());
			pst.setString(12, hire.getOtherInfo());
			pst.setInt(13, hire.getVendorId());
			pst.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return hire;
	}
}

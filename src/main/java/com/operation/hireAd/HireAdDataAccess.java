package com.operation.hireAd;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.operation.db;

@Service


public class HireAdDataAccess {
	
	
	
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
	
	public List<HireAd>getAllAd(HireAd  hire){
		List<HireAd>hList = new ArrayList<>();
		try {
			pst  = db.get().prepareStatement("select * from hire_ad");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				hire.setAdId(rs.getInt(1));
				hire.setTitle(rs.getString(2));
				hire.setLocation(rs.getString(3));
				hire.setName(rs.getString(4));
				hire.setPhone(rs.getString(5));
				hire.setEmail(rs.getString(6));
				hire.setAddress(rs.getString(7));
				hire.setType(rs.getString(8));
				hire.setPurpose(rs.getString(9));
				hire.setCity(rs.getString(10));
				hire.setFacing(rs.getString(11));
				hire.setOtherInfo(rs.getString(12));
				hire.setVendorId(rs.getInt(13));
				hList.add(hire);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return hList;
	}
	
	
}

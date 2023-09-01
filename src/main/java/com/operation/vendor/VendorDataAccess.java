package com.operation.vendor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Service;

import com.operation.db;

@Service
public class VendorDataAccess {
	
public PreparedStatement pst;
	
	public Vendor vendorSignUp(Vendor vs) {
		
		try {
			pst = db.get().prepareStatement("insert into vendor values(?,?,?,?,?,?,?,?,?,?,?)");
			pst.setString(1, null);
			pst.setString(2, vs.getFirstName());
			pst.setString(3, vs.getLastName());
			pst.setString(4, vs.getEmail());
			pst.setString(5, vs.getPhone());
			pst.setString(6, vs.getPassword());
			pst.setString(7, vs.getAddress());
			pst.setString(8, vs.getCity());
			pst.setString(9, vs.getArea());
			pst.setString(10, vs.getPostCode());
			pst.setString(11,vs.getPhoto());
			pst.executeUpdate();
			return vs;
		}catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	
	public Vendor login(Vendor vs) {
		Vendor vn = null;
		try {
			pst = db.get().prepareStatement("select * from vendor where email =? and password =?");
			pst.setString(1, vs.getEmail());
			pst.setString(2, vs.getPassword());
			ResultSet rs  =  pst.executeQuery();
			while(rs.next()) {
				vn = new Vendor();
				vn.setId(rs.getInt(1));
				vn.setEmail(rs.getString(4));
				vn.setPassword(rs.getString(6));
			}	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
		return vn;
	}
	

}

package com.operation.quotation;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.operation.db;

public class QuotationDataAccess {
	
	public PreparedStatement pst;
	
	public QuotationManagement insertQuotation(QuotationManagement qm) {
		
		try {
			pst = db.get().prepareStatement("insert into ad_quotation values(?,?,?,?,?,?,?,?,?,?,?)");
			
			pst.setString(1, null);
			pst.setString(2, qm.getFirstName());
			pst.setString(3, qm.getLastName());
			pst.setString(4, qm.getEmail());
			pst.setString(5, qm.getPhone());
			pst.setDate(6, qm.getFromDate());
			pst.setDate(7, qm.getToDate());
			pst.setString(8, qm.getAddress());
			pst.setString(9, qm.getMessage());
			pst.setInt(10, qm.getAdId());
			pst.setInt(11, qm.getVendorId());
			pst.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return qm;
	}
	
	public List<QuotationManagement> qList;
	public  List<QuotationManagement>quotList(int vendorId){
		  qList = new ArrayList<>();
		  QuotationManagement qm = null;
		 try {
			pst =  db.get().prepareStatement("select * from ad_quotation where vendorId = ? order by quotation_id desc");
			pst.setInt(1, vendorId);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				 qm = new QuotationManagement();
				 qm.setQuotationId(rs.getInt(1));
				 qm.setFirstName(rs.getString(2));
				 qm.setLastName(rs.getString(3));
				 qm.setEmail(rs.getString(4));
				 qm.setPhone(rs.getString(5));
				 qm.setFromDate(rs.getDate(6));
				 qm.setToDate(rs.getDate(7));
				 qm.setAddress(rs.getString(8));
				 qm.setMessage(rs.getString(9));
				 qm.setAdId(rs.getInt(10));
				 qm.setVendorId(rs.getInt(11));
				 qList.add(qm);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		 return qList;
	}
	
	
	public  QuotationManagement viewFullQuot(int adId){
		 
		  QuotationManagement qm = null;
		 try {
			pst =  db.get().prepareStatement("select * from ad_quotation where quotation_id = ?");
			pst.setInt(1, adId);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				 qm = new QuotationManagement();
				 qm.setQuotationId(rs.getInt(1));
				 qm.setFirstName(rs.getString(2));
				 qm.setLastName(rs.getString(3));
				 qm.setEmail(rs.getString(4));
				 qm.setPhone(rs.getString(5));
				 qm.setFromDate(rs.getDate(6));
				 qm.setToDate(rs.getDate(7));
				 qm.setAddress(rs.getString(8));
				 qm.setMessage(rs.getString(9));
				 qm.setAdId(rs.getInt(10));
				 qm.setVendorId(rs.getInt(11));
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		 return qm;
	}
	 
	
	
}

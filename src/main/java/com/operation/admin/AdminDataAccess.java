package com.operation.admin;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.operation.db;
import com.operation.ad.AdManagement;

public class AdminDataAccess {

	PreparedStatement pst;
	
	public Admin login(Admin ad) {
		Admin admin = null;
		try {
			pst = db.get().prepareStatement("select * from admin_login where email =? and password =?");
			pst.setString(1, ad.getEmail());
			pst.setString(2, ad.getPassword());
			ResultSet rs  =  pst.executeQuery();
			
			while(rs.next()) {
				admin = new Admin();
				ad.setEmail(rs.getString(3));
				ad.setPassword(rs.getString(4));
			}	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return admin;
	}
	
	
	
//	show Data in admin Table
	
	public List<AdManagement> adminAdList;
	public List<AdManagement>showAdList(){
		adminAdList = new ArrayList<>();
		AdManagement adList;
		try {
			
			pst =  db.get().prepareStatement("select vendor_id ,ad_id, title,ad_status from ad order by ad_id desc");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				adList = new AdManagement();
				adList.setVendorId(rs.getInt(1));
				adList.setId(rs.getInt(2));
				adList.setTitle(rs.getString(3));
				adList.setAdStatus(rs.getString(4));
				adminAdList.add(adList);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return adminAdList;
	}
	
	
	  public AdManagement adminAdById(int id) {
	    	 AdManagement ad = null;
	    	 try {
				pst = db.get().prepareStatement("select  * from ad where  ad_id = "+id);
				ResultSet rs = pst.executeQuery();
				while(rs.next()) {
					ad = new AdManagement();
					ad.setId(rs.getInt(1));
					ad.setTitle(rs.getString(2));
					ad.setLocation(rs.getString(3));
					ad.setType(rs.getString(4));
					ad.setStatus(rs.getString(5));
					ad.setHeight(rs.getDouble(6));
					ad.setWidth(rs.getDouble(7));
					ad.setArea(rs.getString(8));
					ad.setPurpose(rs.getString(9));
					ad.setFacing(rs.getString(10));
					ad.setPrice(rs.getDouble(11));
					ad.setTitle_image(rs.getString(12));
					ad.setSecond_image(rs.getString(13));
					ad.setThird_image(rs.getString(14));
					ad.setFourth_image(rs.getString(15));
					ad.setFinal_image(rs.getString(16));
					ad.setOther_details(rs.getString(17));
					ad.setAdStatus(rs.getString(18));
					ad.setVendorId(rs.getInt(19));
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
	    	 
	    	 return ad;
	     }
	  
	  public void updateStatus(AdManagement adm) {
		  
		  try {
			pst = db.get().prepareStatement("update ad set ad_status =? where ad_id = ?");
			pst.setString(1, adm.getAdStatus());
			pst.setInt(2, adm.getId());
			pst.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	  }
	  
		public List<AdManagement> showAllList;
		public List<AdManagement>showList(){
			showAllList = new ArrayList<>();
			AdManagement adList;
			try {
				
				pst =  db.get().prepareStatement("select * from ad where ad_status = ? order by ad_id desc");
				pst.setString(1, "Approved");
				ResultSet rs = pst.executeQuery();
				while(rs.next()) {
					adList = new AdManagement();
					adList.setId(rs.getInt(1));
					adList.setTitle(rs.getString(2));
					adList.setLocation(rs.getString(3));
					adList.setType(rs.getString(4));
					adList.setStatus(rs.getString(5));
					adList.setHeight(rs.getDouble(6));
					adList.setWidth(rs.getDouble(7));
					adList.setArea(rs.getString(8));
					adList.setPurpose(rs.getString(9));
					adList.setFacing(rs.getString(10));
					adList.setPrice(rs.getDouble(11));
					adList.setTitle_image(rs.getString(12));
					adList.setSecond_image(rs.getString(13));
					adList.setThird_image(rs.getString(15));
					adList.setFourth_image(rs.getString(15));
					adList.setFinal_image(rs.getString(16));
					adList.setOther_details(rs.getString(17));
					adList.setAdStatus(rs.getString(18));
					adList.setVendorId(rs.getInt(19));
					showAllList.add(adList);
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
			return showAllList;
		}
		
		public AdManagement getAdById(int id) {
	    	 AdManagement ad = null;
	    	 try {
				pst = db.get().prepareStatement("select  * from ad where  ad_id = "+id);
				ResultSet rs = pst.executeQuery();
				while(rs.next()) {
					ad = new AdManagement();
					ad.setId(rs.getInt(1));
					ad.setTitle(rs.getString(2));
					ad.setLocation(rs.getString(3));
					ad.setType(rs.getString(4));
					ad.setStatus(rs.getString(5));
					ad.setHeight(rs.getDouble(6));
					ad.setWidth(rs.getDouble(7));
					ad.setArea(rs.getString(8));
					ad.setPurpose(rs.getString(9));
					ad.setFacing(rs.getString(10));
					ad.setPrice(rs.getDouble(11));
					ad.setTitle_image(rs.getString(12));
					ad.setSecond_image(rs.getString(13));
					ad.setThird_image(rs.getString(14));
					ad.setFourth_image(rs.getString(15));
					ad.setFinal_image(rs.getString(16));
					ad.setOther_details(rs.getString(17));
					ad.setAdStatus(rs.getString(18));
					ad.setVendorId(rs.getInt(19));
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
	    	 
	    	 return ad;
	     }
	  
}

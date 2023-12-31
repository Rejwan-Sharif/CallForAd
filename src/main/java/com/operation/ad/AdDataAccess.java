package com.operation.ad;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.operation.db;

@Service

public class AdDataAccess{
  
  public PreparedStatement pst;
  
  
  
  public void postAd(AdManagement ad) {
	  
	  
	  try {
		 pst =  db.get().prepareStatement("insert into ad values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		 pst.setString(1, null);
		 pst.setString(2, ad.getTitle());
		 pst.setString(3, ad.getLocation());
		 pst.setString(4, ad.getType());
		 pst.setString(5, ad.getStatus());
		 pst.setDouble(6, ad.getHeight());
		 pst.setDouble(7, ad.getWidth());
		 pst.setString(8, ad.getArea());
		 pst.setString(9, ad.getPurpose());
		 pst.setString(10, ad.getFacing());
		 pst.setDouble(11, ad.getPrice());
		 pst.setString(12, ad.getTitle_image());
		 pst.setString(13, ad.getSecond_image());
		 pst.setString(14, ad.getThird_image());
		 pst.setString(15, ad.getFourth_image());
		 pst.setString(16, ad.getFinal_image());
		 pst.setString(17, ad.getOther_details());
		 pst.setString(18, "Pending");
		 pst.setInt(19, ad.getVendorId());
		 pst.setString(20, "Not Promoted");
		 
		 pst.executeUpdate();
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
  }
    public List<AdManagement> adList;
    
     public List<AdManagement> showAd(int vendorId){
    	 adList = new ArrayList<>();
    	 AdManagement add;
    	 try {
			pst = db.get().prepareStatement("select ad_id, title,location,type,title_image,ad_status from ad where vendor_id  = ? order by ad_id desc");
			pst.setInt(1, vendorId);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				add = new AdManagement();
				add.setId(rs.getInt(1));
				add.setTitle(rs.getString(2));
				add.setLocation(rs.getString(3));
				add.setType(rs.getString(4));
				add.setTitle_image(rs.getString(5));
				add.setAdStatus(rs.getString(6));
				adList.add(add);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			
		}
    	 
    	 return adList;
     }
     
     
     public AdManagement updateAd(AdManagement adm) {
    	
    	 try {
    		 pst = db.get().prepareStatement("update ad set title = ?, location = ?, type = ?, status =?, height= ?,width = ?,area = ?,"
    		 		+ "purpose = ?, facing = ?, price =?, title_image = ?,second_image = ?,third_image =?, fourth_image = ?,final_image = ?,"
    		 		+ "other_details = ?, ad_status = ? where ad_id = ?");
    		 pst.setString(1, adm.getTitle());
    		 pst.setString(2, adm.getLocation());
    		 pst.setString(3, adm.getType());
    		 pst.setString(4, adm.getStatus());
    		 pst.setDouble(5, adm.getHeight());
    		 pst.setDouble(6, adm.getWidth());
    		 pst.setString(7, adm.getArea());
    		 pst.setString(8, adm.getPurpose());
    		 pst.setString(9, adm.getFacing());
    		 pst.setDouble(10, adm.getPrice());
    		 pst.setString(11, adm.getTitle_image());
    		 pst.setString(12, adm.getSecond_image());
    		 pst.setString(13, adm.getThird_image());
    		 pst.setString(14, adm.getFourth_image());
    		 pst.setString(15, adm.getFinal_image());
    		 pst.setString(16, adm.getOther_details());
    		 pst.setString(17, "Pending");
    		 pst.setInt(18, adm.getId());
  
    		 
    		 pst.executeUpdate();
    			return adm;	 
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
    	 return null;
     }
     
     public AdManagement adById(int id) {
    	 AdManagement ad = null;
    	 
    	 try {
			pst = db.get().prepareStatement("select a.ad_id,a.title,a.location,a.type,a.status,a.height,a.width,a.area,a.purpose,a.facing,"
					+ "a.price,a.title_image,a.second_image,a.third_image,a.fourth_image,a.final_image,a.other_details, b.first_name, b.last_name,b.email,b.phone, b.city,b.photo from ad a join vendor b on (a.vendor_id = b.id) where a.ad_id = ?");
			pst.setInt(1,id);
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
				ad.setPromotionStatus(rs.getString(18));
				ad.setFirstName(rs.getString(18));
				ad.setLastName(rs.getString(19));
				ad.setEmail(rs.getString(20));
				ad.setPhone(rs.getString(21));
				ad.setCity(rs.getString(22));
				ad.setPhoto(rs.getString(23));
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
    	 
    	 return ad;
     }
  
     
     public boolean delete(int id){
	     try {
	        
	       pst = db.get().prepareStatement("DELETE FROM ad WHERE ad_id = ?");
	         pst.setInt(1, id);
	         pst.executeUpdate();
	         return true;
	     } catch (Exception e) {
	    	 System.out.println(e);
	     }  return false;
     }
     
     
  
  
}

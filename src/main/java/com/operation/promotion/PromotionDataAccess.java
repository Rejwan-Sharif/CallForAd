package com.operation.promotion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.operation.db;

public class PromotionDataAccess {

	PreparedStatement pst;
	
	public Promotion insertPromotion(Promotion pm) {
		
		try {
			pst = db.get().prepareStatement("insert into promotion values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			pst.setString(1, null);
			pst.setInt(2, pm.getAdId());
			pst.setString(3,pm.getPromotionCategory());
			pst.setString(4, pm.getEmail());
			pst.setString(5, pm.getCardNumber());
			pst.setString(6, pm.getExpireDate());
			pst.setString(7, pm.getCvv());
			pst.setString(8, pm.getCardHolderName());
			pst.setString(9, pm.getMfs());
			pst.setString(10, pm.getMfsNumber());
			pst.setString(11, pm.getTsNumber());
			pst.setDouble(12, pm.getSubTotal());
			pst.setDouble(13, pm.getVat());
			pst.setDouble(14, pm.getTotal());
			pst.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		return pm;
	}
	
	public List<Promotion> showPromotion(Promotion pm){
		List<Promotion>promoList  = new  ArrayList<>();
		
		try {
			pst = db.get().prepareStatement("select  * from promotion order by promotionId desc");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				pm = new  Promotion(); 
				pm.setPromotionId(rs.getInt(1));
				pm.setAdId(rs.getInt(2));
				pm.setPromotionCategory(rs.getString(3));
				pm.setEmail(rs.getString(4));
				pm.setCardNumber(rs.getString(5));
				pm.setExpireDate(rs.getString(6));
				pm.setCvv(rs.getString(7));
				pm.setCardHolderName(rs.getString(8));
				pm.setMfs(rs.getString(9));
				pm.setMfsNumber(rs.getString(10));
				pm.setTsNumber(rs.getString(11));
				pm.setSubTotal(rs.getDouble(12));
				pm.setVat(rs.getDouble(13));
				pm.setTotal(rs.getDouble(14));
			 	promoList.add(pm);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return  promoList;
	}
	
	public Promotion getPromoById(int adId) {
		Promotion  promo=  null;
		try {
			pst  = db.get().prepareStatement("select * from promotion where adId = ?");
			pst.setInt(1, adId);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				promo = new Promotion();
				promo.setPromotionId(rs.getInt(1));
				promo.setAdId(rs.getInt(2));
				promo.setPromotionCategory(rs.getString(3));
				promo.setEmail(rs.getString(4));
				promo.setCardNumber(rs.getString(5));
				promo.setExpireDate(rs.getString(6));
				promo.setCvv(rs.getString(7));
				promo.setCardHolderName(rs.getString(8));
				promo.setMfs(rs.getString(9));
				promo.setMfsNumber(rs.getString(10));
				promo.setTsNumber(rs.getString(11));
				promo.setSubTotal(rs.getDouble(12));
				promo.setVat(rs.getDouble(13));
				promo.setTotal(rs.getDouble(14));
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		return promo;
		
	}
	
}

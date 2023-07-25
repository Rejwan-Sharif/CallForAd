package com.operation.newspaper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.operation.db;

public class NewspaperDataAccess {
 PreparedStatement pst;
 
 public Newspaper insertData(Newspaper nm) {
	  try {
		pst =db.get().prepareStatement("insert into newspaper values(?,?,?,?,?,?,?,?,?,?,?)");
		pst.setString(1, null);
		pst.setString(2, nm.getNewspaperName());
		pst.setString(3, nm.getName());
		pst.setString(4, nm.getOrganizationName());
		pst.setString(5, nm.getPhone());
		pst.setString(6, nm.getEmail());
		pst.setDate(7, nm.getPublishDate());
		pst.setString(8, nm.getAdTitle());
		pst.setString(9, nm.getAdDescription());
		pst.setString(10, nm.getDocument());
		pst.setString(11, "Pending");
		pst.executeUpdate();
	} catch (Exception e) {
		// TODO: handle exception
	}
	 return nm;
 }
 

public List<Newspaper>showAd(Newspaper nm){
	List<Newspaper> adList = new ArrayList<>();
	try {
		pst = db.get().prepareStatement("select * from newspaper  order by id desc");
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			nm  =  new Newspaper();
			nm.setId(rs.getInt(1));
			nm.setNewspaperName(rs.getString(2));
			nm.setName(rs.getString(3));
			nm.setOrganizationName(rs.getString(4));
			nm.setPhone(rs.getString(5));
			nm.setEmail(rs.getString(6));
			nm.setPublishDate(rs.getDate(7));
			nm.setAdTitle(rs.getString(8));
			nm.setAdDescription(rs.getString(9));
			nm.setDocument(rs.getString(10));
			nm.setPublishStatus(rs.getString(11));
			adList.add(nm);
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
	
	return adList;
}

 public Newspaper viewFullAd(int id) {
	 Newspaper  nm = null;
	 try {
		pst = db.get().prepareStatement("select * from newspaper  where id =  ?");
		pst.setInt(1, id);
		ResultSet  rs = pst.executeQuery();
		while(rs.next()) {
			nm = new  Newspaper();
			nm.setId(rs.getInt(1));
			nm.setNewspaperName(rs.getString(2));
			nm.setName(rs.getString(3));
			nm.setOrganizationName(rs.getString(4));
			nm.setPhone(rs.getString(5));
			nm.setEmail(rs.getString(6));
			nm.setPublishDate(rs.getDate(7));
			nm.setAdTitle(rs.getString(8));
			nm.setAdDescription(rs.getString(9));
			nm.setDocument(rs.getString(10));
			nm.setPublishStatus(rs.getString(11));
			
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
	 return nm;
 }
 
 public Newspaper updateStatus(Newspaper  nm) {
	 
	try {
		pst = db.get().prepareStatement("update newspaper set publish_status = ? where id = ?");
		pst.setString(1, nm.getPublishStatus());
		pst.setInt(2, nm.getId());
		pst.executeUpdate();
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
	 
	 return nm;
 }
 
}

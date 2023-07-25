package com.operation.admin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.operation.ad.AdManagement;




@CrossOrigin(origins = "http://localhost:4200")
@RestController


public class AdminController {
	 
	@PostMapping(value = "/adminLogin")
	public  Admin adminLogin(@RequestBody Admin ad) {
		AdminDataAccess admin = new AdminDataAccess();
		return admin.login(ad);
	}
	
	public List<AdManagement>adList = new ArrayList<>();
	@GetMapping(value ="/showAdminData")
	public List<AdManagement> getAd(AdminDataAccess adm){
		adm = new AdminDataAccess();
		adList = adm.showAdList();
		return adList;
	}
	
	@GetMapping(value ="/adminAd/{id}")
	public AdManagement  getAdById(@PathVariable("id") int id) {
		
		AdminDataAccess adData = new AdminDataAccess();
		  return adData.adminAdById(id);
		
	}
	
	@PostMapping(value =  "/updateAdStatus")
	public void updateAdData(@RequestBody AdManagement ad) {
		AdminDataAccess adData =  new AdminDataAccess();
		 adData.updateStatus(ad);
	}
	
	public List<AdManagement>allData=new ArrayList<>();
	@GetMapping(value ="/showAllData")
	public List<AdManagement> getAllAd(AdminDataAccess adm){
		adm = new  AdminDataAccess();
		allData =  adm.showList();
		return allData;
	}
	
	@GetMapping(value ="/detailAd/{id}")
	public AdManagement  getDetailAd(@PathVariable("id") int id) {
		AdManagement ad;
		AdminDataAccess adData = new AdminDataAccess();
		ad =  adData.adminAdById(id);
		return ad;
	}
	
	

}

package com.operation.ad;



import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class AdController {

	@PostMapping(value = "/adData")
	public void adSubmission(@RequestBody AdManagement ad) {
		AdDataAccess data = new AdDataAccess();
		data.postAd(ad);
	}
	
	
	
	@GetMapping(value = "/getData/{vendorId}")
	public List<AdManagement> getAd(@PathVariable("vendorId") int vendorId){
		AdDataAccess adData = new AdDataAccess();
		return adData.showAd(vendorId);
		
	}
	
	@GetMapping(value ="/ad/{id}")
	public AdManagement  getAdById(@PathVariable("id") int id) {
		AdManagement ad;
		AdDataAccess adData = new AdDataAccess();
		ad =  adData.adById(id);
		return ad;
	}
	@PostMapping(value =  "/update")
	public AdManagement updateAdData(@RequestBody AdManagement ad) {
		AdDataAccess adData =  new AdDataAccess();
		return adData.updateAd(ad);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public boolean deleteAd(@PathVariable("id") int id) {
		AdDataAccess adData = new AdDataAccess();
		return adData.delete(id);
	}
	
}

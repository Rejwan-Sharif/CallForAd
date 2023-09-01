package com.operation.ad;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@Service
public class AdController {
	
	@Autowired
	AdDataAccess data;
	
	@Autowired
	AdManagement ad;
	
	@PostMapping(value = "/adData")
	public void adSubmission(@RequestBody AdManagement ad) {
		data.postAd(ad);
	}
	
	
	
	@GetMapping(value = "/getData/{vendorId}")
	public List<AdManagement> getAd(@PathVariable("vendorId") int vendorId){
		return data.showAd(vendorId);
		
	}
	
	@GetMapping(value ="/ad/{id}")
	public AdManagement  getAdById(@PathVariable("id") int id) {
		return ad =  data.adById(id);
		
	}
	
	@PostMapping(value =  "/update")
	public AdManagement updateAdData(@RequestBody AdManagement ad) {
		return data.updateAd(ad);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public boolean deleteAd(@PathVariable("id") int id) {
		return data.delete(id);
	}
	
}

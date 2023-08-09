package com.operation.newspaper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Service
@CrossOrigin(originPatterns = "http://localhost:4200")
@RestController

public class NewspaperController {
	
	@Autowired
	NewspaperDataAccess nda;
	
	@PostMapping(value = "/newspaperDataInsert")
	public Newspaper dataInsert(@RequestBody Newspaper nm) {
		return nda.insertData(nm);
	}
	
	@GetMapping(value = "/showNewspaperAd")
	public List<Newspaper>showAllAd(Newspaper nm){
		return nda.showAd(nm); 
	}
	
	@GetMapping(value = "/viewAdDetails/{id}")
	public Newspaper getAllAd(@PathVariable("id") int id) {
		 return nda.viewFullAd(id);
	}
	
	@PostMapping(value = "/updateStatus")
	public Newspaper updateAdStatus(@RequestBody Newspaper nm){
		return nda.updateStatus(nm);
	}
	
	
}

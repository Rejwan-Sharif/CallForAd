package com.operation.newspaper;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(originPatterns = "http://localhost:4200")
@RestController

public class NewspaperController {

	@PostMapping(value = "/newspaperDataInsert")
	public Newspaper dataInsert(@RequestBody Newspaper nm) {
		NewspaperDataAccess nda =  new NewspaperDataAccess();
		return nda.insertData(nm);
	}
	
	@GetMapping(value = "/showNewspaperAd")
	public List<Newspaper>showAllAd(Newspaper nm){
		NewspaperDataAccess nda = new NewspaperDataAccess();
		return nda.showAd(nm); 
	}
	
	@GetMapping(value = "/viewAdDetails/{id}")
	public Newspaper getAllAd(@PathVariable("id") int id) {
		NewspaperDataAccess nda = new NewspaperDataAccess();
		 return nda.viewFullAd(id);
	}
	
	@PostMapping(value = "/updateStatus")
	public Newspaper updateAdStatus(@RequestBody Newspaper nm){
		NewspaperDataAccess nda = new NewspaperDataAccess();
		return nda.updateStatus(nm);
	}
	
	
}

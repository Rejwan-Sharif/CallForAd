package com.operation.hireAd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(originPatterns = "http://localhost:4200")
@RestController

@Service

public class HireAdController {
	@Autowired
	HireAdDataAccess hda;
	
	@PostMapping(value = "/hireAdInsert")
	public HireAd saveData(@RequestBody HireAd hire) {
	 return	hda.insertAd(hire);
	}
	
	@GetMapping(value = "/getHireAd")
	public List<HireAd>getHireData(HireAd hire){
	 return	hda.getAllAd(hire);
	}
}

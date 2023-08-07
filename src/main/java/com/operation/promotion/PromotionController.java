package com.operation.promotion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(originPatterns = "http://localhost:4200")
@RestController

@Service
public class PromotionController {
	
	@Autowired
   PromotionDataAccess pda;
	
	@PostMapping(value="/insertPromotion")
	public Promotion dataPromotion(@RequestBody Promotion pm) {
		return pda.insertPromotion(pm);
	}
	
	@GetMapping(value = "/getPromoData")
	public  List<Promotion>getPromotion(Promotion pm){
		return pda.showPromotion(pm);
	}
	
	@GetMapping(value = "/getPromoById/{adId}")
	public Promotion getPromoDataById(@PathVariable("adId")int adId) {

		 return pda.getPromoById(adId);
	}
}

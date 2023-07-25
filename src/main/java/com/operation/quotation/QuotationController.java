package com.operation.quotation;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class QuotationController {

	@PostMapping(value = "/sendQuotation")
	public QuotationManagement sendQuotation(@RequestBody QuotationManagement qm) {
		QuotationDataAccess qData= new QuotationDataAccess();
		return qData.insertQuotation(qm);
	}
	
	
	@GetMapping(value = "/getQuotation/{vendorId}")
	public List<QuotationManagement> getQuotation(@PathVariable("vendorId") int vendorId){
		QuotationDataAccess qData = new QuotationDataAccess();
		return qData.quotList(vendorId);
	}
	
	@GetMapping(value  = "/getFullQuotation/{quotationId}")
	public QuotationManagement getFulQuot(@PathVariable("quotationId") int quotationId){
		QuotationDataAccess viewQ = new QuotationDataAccess();
		return viewQ.viewFullQuot(quotationId);
	}

	
	
}

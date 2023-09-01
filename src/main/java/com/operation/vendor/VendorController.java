package com.operation.vendor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@Service
public class VendorController {

	@Autowired
	VendorDataAccess vd;
	
	@PostMapping(value = "/vendorSignUp")
	public void vendorInfoSave(@RequestBody Vendor vs) {
		vd.vendorSignUp(vs);
		
	}
	
	@PostMapping(value = "/vendorlogin")
	public  Vendor vendorLogin(@RequestBody Vendor v) {
		return vd.login(v);
	}
	
	
	
}

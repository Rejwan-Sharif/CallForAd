package com.operation.vendor;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class VendorController {

	@PostMapping(value = "/vendorSignUp")
	public void vendorInfoSave(@RequestBody Vendor vs) {
		VendorDataAccess vd = new VendorDataAccess();
		vd.vendorSignUp(vs);
		
	}
	
	@PostMapping(value = "/vendorlogin")
	public  Vendor vendorLogin(@RequestBody Vendor vd) {
		VendorDataAccess vl = new VendorDataAccess();
		return vl.login(vd);
	}
	
	
	
}

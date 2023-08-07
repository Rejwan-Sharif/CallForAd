package com.operation.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(originPatterns = "http://localhost:4200")
@RestController


public class MailController {

	@Autowired
	EmailSenderService email;
	
	@PostMapping("/mail")
	public boolean sendMail(@RequestBody Mail mail) {
		return email.sendEmail(mail.getTo(), mail.getSubject(), mail.getBody());
	}
}

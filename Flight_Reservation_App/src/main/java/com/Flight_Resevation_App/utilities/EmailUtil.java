package com.Flight_Resevation_App.utilities;

import java.io.File;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtil {

	@Autowired
	JavaMailSender MailSender;
	
	public void sendItinerary(String toAddress, String filePath) {
		
	MimeMessage message = MailSender.createMimeMessage();
	 try {
		MimeMessageHelper messageHelper= new MimeMessageHelper(message,true);
		messageHelper.setTo(toAddress);
		messageHelper.setText("Itinerary of Flight");
		messageHelper.setSubject("Please find the attached");
		
		// Attach file in your email..
		messageHelper.addAttachment("Itinerary", new File(filePath));
		MailSender.send(message);
	    }
	 catch(Exception e) {
		e.printStackTrace();
	}
  }
}

	
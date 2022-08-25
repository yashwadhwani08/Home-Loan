package com.barclays.homeLoanApplication.service;

import com.barclays.homeLoanApplication.entity.EmailDetails;

public interface EmailService {
	String sendSimpleMail(EmailDetails details);
	String sendMailWithAttachment(EmailDetails details);
}

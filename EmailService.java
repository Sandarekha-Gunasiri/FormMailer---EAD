package com.uom.ead.emailSender;

import com.uom.ead.emailSender.EmailDetails;
public interface EmailService {
    String sendSimpleMail(EmailDetails emailDetails);

}

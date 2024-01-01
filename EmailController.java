package com.uom.ead.emailSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    @Autowired private EmailService emailService;

;    @GetMapping("/")
    public String hello(){
            return "Hello World";
    }

    @PostMapping("/sendMail")
    public String sendMail(Student student){
        EmailDetails details = new EmailDetails("gunasirigcs.20@uom.lk",
                "I am " + student.getFullName() + " of index " + student.getIndexNo() + ". I am from batch " + student.getBatch() + ". This is regarding the 5 module registration. Please find my registration PDF in the attachment. \n Thank you.\nBest Regards,\n" + student.getRegisteredName(),
                "Registration for semester " + student.getSemesterNo());
        String status = emailService.sendSimpleMail(details);
        return status;
    }
}
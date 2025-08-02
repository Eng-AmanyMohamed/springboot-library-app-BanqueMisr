package com.yourorg.library.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notify")
public class NotificationController {
    @Autowired
    private  NotificationService emailService;
    @Autowired
    @Qualifier("sms")
    private NotificationService smsService;



    @GetMapping("/email")
    public String notifyEmail() {
        return emailService.sendNotification("Email notification sent!");
    }

    @GetMapping("/sms")
    public String notifySms() {
        return smsService.sendNotification("SMS notification sent!");
    }
}

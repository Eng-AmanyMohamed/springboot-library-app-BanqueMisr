package com.yourorg.library.Service.implementation;


import com.yourorg.library.Service.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Qualifier("sms")
@Service
public class SmsNotificationService implements NotificationService {
    @Override
    public String sendNotification(String notification) {
        return notification;
    }
}

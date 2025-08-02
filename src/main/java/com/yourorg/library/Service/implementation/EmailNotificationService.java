package com.yourorg.library.Service.implementation;


import com.yourorg.library.Service.NotificationService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary
@Service
public class EmailNotificationService implements NotificationService {
    @Override
    public String sendNotification(String notification) {
        return notification;
    }
}

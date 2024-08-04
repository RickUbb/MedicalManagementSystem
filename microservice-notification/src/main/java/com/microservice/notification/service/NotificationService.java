package com.microservice.notification.service;

import com.microservice.notification.entities.Notification;
import com.microservice.notification.persistence.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;

public class NotificationService implements INotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    @Override
    public List<Notification> findAll() {
        return (List<Notification>) notificationRepository.findAll();
    }

    @Override
    public Notification findById(Long id) {
        return notificationRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Notification notification) {
        notificationRepository.save(notification);
    }

    @Override
    public void deleteById(Long id) {
        notificationRepository.deleteById(id);
    }

    @Override
    public void sendNotification(String recipient, String message) {
        Notification notification = Notification.builder()
                .recipient(recipient)
                .message(message)
                .sentDate(LocalDateTime.now())
                .build();
        notificationRepository.save(notification);
    }
}

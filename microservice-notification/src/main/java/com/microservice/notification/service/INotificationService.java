package com.microservice.notification.service;

import com.microservice.notification.entities.Notification;

import java.util.List;

public interface INotificationService {
    List<Notification> findAll();
    Notification findById(Long id);
    void save(Notification notification);
    void deleteById(Long id);
    void sendNotification(String recipient, String message);
}

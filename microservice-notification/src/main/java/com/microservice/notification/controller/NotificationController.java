package com.microservice.notification.controller;

import com.microservice.notification.entities.Notification;
import com.microservice.notification.service.INotificationService;
import com.microservice.notification.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/notifications")
public class NotificationController {
    @Autowired
    private INotificationService notificationService;

    @GetMapping
    public ResponseEntity<?> findAllNotifications() {
        return ResponseEntity.ok(notificationService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findNotificationById(Long id) {
        return ResponseEntity.ok(notificationService.findById(id));
    }

    @PostMapping("/send")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveNotification(@RequestBody Notification notification) {
        notificationService.save(notification);
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<?> updateNotification(@RequestBody Long id, @RequestParam String recipient, @RequestParam String message) {
        notificationService.sendNotification(recipient, message);
        return ResponseEntity.ok("Notification updated");
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> deleteNotification(@PathVariable Long id) {
        notificationService.deleteById(id);
        return ResponseEntity.ok("Notification deleted");
    }

    @PostMapping("/send")
    public ResponseEntity<String> sendNotification(@RequestParam String recipient, @RequestParam String message) {
        notificationService.sendNotification(recipient, message);
        return ResponseEntity.ok("Notification sent");
    }
}
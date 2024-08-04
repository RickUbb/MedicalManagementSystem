package com.microservice.notification.persistence;

import com.microservice.notification.entities.Notification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface NotificationRepository extends CrudRepository<Notification, Long> {
}

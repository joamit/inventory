package io.joamit.inventory.service;

import io.joamit.inventory.domain.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    public void notify(Notification notification, String username){
        simpMessagingTemplate.convertAndSendToUser(username, "/queue/notify", notification);
    }
}

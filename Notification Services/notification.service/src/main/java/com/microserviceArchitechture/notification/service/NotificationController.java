package com.microserviceArchitechture.notification.service;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification")
public class NotificationController {
	
	@GetMapping(value="/{notificationId}")
	public Notifications getValue(@PathVariable("notificationId")String notificationId) {
		
//		String description;
		Notifications notificationsOne=new Notifications(notificationId,"Hi this is Notification description"+notificationId);
		return notificationsOne;
		
	}
}
package com.microserviceArchitechture.user.service;

public class Notifications {

	private String notificationId;
	private String description;
	
	
	
	public Notifications() {
		super();
	}

	public Notifications(String notificationId, String description) {
		super();
		this.notificationId = notificationId;
		this.description = description;
	}

	public String getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(String notificationId) {
		this.notificationId = notificationId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Notifications [notificationId=" + notificationId + ", description=" + description + "]";
	}
	
	
	
}

package com.microserviceArchitechture.user.service;

public class User {
	
	private String userId;
	private String userName;
	private String userPhoneNumber;
	
	private Posts posts;
	private Notifications notifications;
	
	
	
	
	public User() {
		super();
	}



	public User(String userId, String userName, String userPhoneNumber, Posts posts, Notifications notifications) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPhoneNumber = userPhoneNumber;
		this.posts = posts;
		this.notifications = notifications;
	}



	public Posts getPosts() {
		return posts;
	}



	public void setPosts(Posts posts) {
		this.posts = posts;
	}



	public Notifications getNotifications() {
		return notifications;
	}



	public void setNotifications(Notifications notifications) {
		this.notifications = notifications;
	}



	public User(String userId, String userName, String userPhoneNumber) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPhoneNumber = userPhoneNumber;
	}
	
	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPhoneNumber=" + userPhoneNumber + ", posts="
				+ posts + ", notifications=" + notifications + "]";
	}



	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}
	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}
	
}

package com.microserviceArchitechture.user.service;



public class Posts {

	private String postId;
	private String postDescription;
	
	public Posts(String postId, String postDescription) {
		super();
		this.postId = postId;
		this.postDescription = postDescription;
	}

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public String getPostDescription() {
		return postDescription;
	}

	public void setPostDescription(String postDescription) {
		this.postDescription = postDescription;
	}

	public Posts() {
		super();
	}
	
	
	
}

package com.babycare.model.payload;

import com.babycare.model.BaseModel;

public class UserPayload extends BaseModel {
	private Long userId = null;
	private String email = null;
	private String provider = null;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public UserPayload(Long userId) {
		this.userId = userId;
	}
	
	public UserPayload(String email, String provider) {
		this.email = email;
		this.provider = provider;
	}
}

package com.babycare.model.payload;

import com.babycare.model.BaseModel;
import com.google.gson.annotations.SerializedName;

public class UserPayload extends BaseModel {
	@SerializedName("userId")
	private Long userId = null;
	@SerializedName("email")
	private String email = null;
	@SerializedName("provider")
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

	public UserPayload() {
	}
}

package com.babycare.model.payload;


import com.babycare.model.BaseModel;
import com.google.gson.annotations.SerializedName;

public class Session extends BaseModel implements Cloneable {

	@SerializedName("sessionId")
	protected Long sessionId;
	@SerializedName("user")
	protected User user;
	@SerializedName("pushId")
	protected String pushId;
	@SerializedName("hardwareId")
	protected String hardwareId;
	@SerializedName("platform")
	protected String platform;
	@SerializedName("status")
	protected Integer status;
	@SerializedName("userId")
	protected Long userId;

	public Session() {}

	public Session(Long sessionId) {
		this.sessionId = sessionId;
	}
	
	public Session(String hardwareId) {
		this.hardwareId = hardwareId;
	}
	
	public Session(Long sessionId, String pushId) {
		this.sessionId = sessionId;
		this.pushId = pushId;
	}
	
	public Session(Long sessionId, Integer status) {
		this.sessionId = sessionId;
		this.status = status;
	}
	
	public Session(String hardareId, Integer status) {
		this.hardwareId = hardareId;
		this.status = status;
	}
	
	public Long getSessionId() {
		return sessionId;
	}

	public Session setSessionId(Long sessionId) {
		this.sessionId = sessionId;
		return this;
	}

	public User getUser() {
		return user;
	}

	public Session setUser(User user) {
		this.user = user;
		return this;
	}

	public String getPushId() {
		return pushId;
	}

	public Session setPushId(String pushId) {
		this.pushId = pushId;
		return this;
	}

	public String getHardwareId() {
		return hardwareId;
	}

	public Session setHardwareId(String hardwareId) {
		this.hardwareId = hardwareId;
		return this;
	}

	public String getPlatform() {
		return platform;
	}

	public Session setPlatform(String platform) {
		this.platform = platform;
		return this;
	}

	public Integer getStatus() {
		return status;
	}

	public Session setStatus(Integer status) {
		this.status = status;
		return this;
	}

	public Long getUserId() {
		return userId;
	}

	public Session setUserId(Long userId) {
		this.userId = userId;
		return this;
	}

	@Override
	public Session clone() throws CloneNotSupportedException { 
		Session clone= (Session) super.clone();
		return clone;
	}
}

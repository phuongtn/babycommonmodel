package com.babycare.model.payload;
import com.babycare.model.BaseModel;
import com.google.gson.annotations.SerializedName;

public class SessionPayload extends BaseModel {

	@SerializedName("sessionId")
	private Long sessionId;

	@SerializedName("pushId")
	private String pushId;

	@SerializedName("hardwareId")
	private String hardwareId;

	@SerializedName("platform")
	private String platform;

	@SerializedName("status")
	private Integer status;

	@SerializedName("userId")
	private Long userId;

	public Long getSessionId() {
		return sessionId;
	}

	public void setSessionId(Long sessionId) {
		this.sessionId = sessionId;
	}

	public String getPushId() {
		return pushId;
	}

	public void setPushId(String pushId) {
		this.pushId = pushId;
	}

	public String getHardwareId() {
		return hardwareId;
	}

	public void setHardwareId(String hardwareId) {
		this.hardwareId = hardwareId;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public SessionPayload(Long sessionId) {
		this.sessionId = sessionId;
	}
	
	public SessionPayload(String hardwareId) {
		this.hardwareId = hardwareId;
	}
	
	public SessionPayload(Long sessionId, String pushId) {
		this.sessionId = sessionId;
		this.pushId = pushId;
	}
	
	public SessionPayload(Long sessionId, Integer status) {
		this.sessionId = sessionId;
		this.status = status;
	}
	
	public SessionPayload(String hardareId, Integer status) {
		this.hardwareId = hardareId;
		this.status = status;
	}
	
	public SessionPayload() {
		
	}
}

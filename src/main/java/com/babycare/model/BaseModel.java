package com.babycare.model;

public abstract class BaseModel {
	
	private Long requestBySessionId;

	protected String getVersion() {
		return "0.0.1-SNAPSHOT";
	}

	public Long getRequestBySessionId() {
		return requestBySessionId;
	}

	public void setRequestBySessionId(Long requestBySessionId) {
		this.requestBySessionId = requestBySessionId;
	}

}

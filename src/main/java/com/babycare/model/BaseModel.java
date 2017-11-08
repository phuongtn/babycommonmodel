package com.babycare.model;

import com.google.gson.annotations.SerializedName;

public abstract class BaseModel {
	@SerializedName("requestBySessionId")
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

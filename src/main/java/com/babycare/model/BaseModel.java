package com.babycare.model;

import com.google.gson.annotations.SerializedName;

public abstract class BaseModel {
	@SerializedName("error")
	protected Error error;
	
	protected String getVersion() {
		return "0.0.1-SNAPSHOT";
	}
	
	protected void setError(Error error) {
		this.error = error;
	}
	
	protected Error getError() {
		return error;
	}
}

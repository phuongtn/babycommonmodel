package com.babycare.model;

import javax.persistence.Transient;

import com.google.gson.annotations.SerializedName;

public abstract class BaseModel {
	@SerializedName("error")
	@Transient
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

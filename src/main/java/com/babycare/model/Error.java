package com.babycare.model;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class Error extends BaseModel implements Serializable {
	private static final long serialVersionUID = 6292223602774584810L;
	
	@SerializedName("errorcode")
	private Long errorcode;
	
	@SerializedName("message")
	private String message;
	
	public Long getErrorcode() {
		return errorcode;
	}
	
	public void setErrorcode(Long errorcode) {
		this.errorcode = errorcode;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public Error(Long errorCode, String message) {
		this.errorcode = errorCode;
		this.message = message;
	}
}

package com.babycare.model;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class Error extends BaseModel implements Serializable {
	private static final long serialVersionUID = 6292223602774584810L;
	
	@SerializedName("errorcode")
	private Long errorcode;
	
	@SerializedName("message")
	private String message;

	@SerializedName("exception")
	private String exception;

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

	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}
	
	public Error(Long errorCode, String message, String exception) {
		this.errorcode = errorCode;
		this.message = message;
		this.exception = exception;
	}

}

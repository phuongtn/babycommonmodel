package com.babycare.model.response;

import com.babycare.model.BaseModel;
import com.google.gson.annotations.SerializedName;

public class CommonResponse extends BaseModel {
	@SerializedName("isSuccess")
	private Boolean isSuccess;
	@SerializedName("mesage")
	private String mesage;

	public CommonResponse() {
	}

	public CommonResponse(String message, Boolean isSuccess) {
		this.isSuccess = isSuccess;
		this.mesage = message;
	}

	public String getMesage() {
		return mesage;
	}

	public CommonResponse setMesage(String mesage) {
		this.mesage = mesage;
		return this;
	}

	public Boolean getIsSuccess() {
		return isSuccess;
	}

	public CommonResponse setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
		return this;
	}
}

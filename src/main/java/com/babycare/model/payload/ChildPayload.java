package com.babycare.model.payload;

import com.babycare.model.BaseModel;

public class ChildPayload extends BaseModel {
	private Long id;
	private Long userId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
}

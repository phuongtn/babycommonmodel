package com.babycare.model.payload;

import com.babycare.model.BaseModel;
import com.google.gson.annotations.SerializedName;

public class ChildPayload extends BaseModel {
	@SerializedName("childId")
	private Long childId;

	@SerializedName("userId")
	private Long userId;
	
	public Long getUserId() {
		return userId;
	}
	public ChildPayload setUserId(Long userId) {
		this.userId = userId;
		return this;
	}
	public Long getChildId() {
		return childId;
	}
	public ChildPayload setChildId(Long childId) {
		this.childId = childId;
		return this;
	}
	
	public ChildPayload() {
	}
}

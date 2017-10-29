package com.babycare.model.payload;

import com.babycare.model.BaseModel;
import com.google.gson.annotations.SerializedName;

public class PushMessage extends BaseModel {
	@SerializedName("messageId")
	protected String messageId;

	public PushMessage() {
	}
	
	public PushMessage(String messageId) {
		this.messageId = messageId;
	}

	public String getMessageId() {
		return messageId;
	}

	public PushMessage setMessageId(String messageId) {
		this.messageId = messageId;
		return this;
	}

}

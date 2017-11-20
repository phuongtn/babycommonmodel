package com.babycare.model.payload;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

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

	@Override
	public boolean equals(Object rhs) {
		return EqualsBuilder.reflectionEquals(this, rhs, false);
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this, false);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}

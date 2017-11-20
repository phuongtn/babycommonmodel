package com.babycare.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.SerializedName;

public class ContentPushMessage {
	@SerializedName("childId")
	private Long childId;
	@SerializedName("contentId")
	private Long contentId;

	public Long getChildId() {
		return childId;
	}

	public ContentPushMessage setChildId(Long childId) {
		this.childId = childId;
		return this;
	}

	public Long getContentId() {
		return contentId;
	}

	public ContentPushMessage setContentId(Long contentId) {
		this.contentId = contentId;
		return this;
	}

	public ContentPushMessage() {

	}

	public ContentPushMessage(Long childId, Long contentId) {
		this.childId = childId;
		this.contentId = contentId;
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

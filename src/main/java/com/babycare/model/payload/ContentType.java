package com.babycare.model.payload;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.babycare.model.BaseModel;
import com.google.gson.annotations.SerializedName;

public class ContentType extends BaseModel implements Cloneable {
	private static final long serialVersionUID = 1L;
	@SerializedName("contentTypeId")
	protected Long contentTypeId;
	@SerializedName("type")
	protected String type;

	public Long getContentTypeId() {
		return contentTypeId;
	}

	public ContentType setContentTypeId(Long contentTypeId) {
		this.contentTypeId = contentTypeId;
		return this;
	}

	public String getType() {
		return type;
	}

	public ContentType setType(String type) {
		this.type = type;
		return this;
	}

	public ContentType() {
	}

	@Override
	public ContentType clone() throws CloneNotSupportedException {
		ContentType clone = (ContentType) super.clone();
		return clone;
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

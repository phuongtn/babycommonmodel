package com.babycare.model.payload;

import com.babycare.model.BaseModel;
import com.google.gson.annotations.SerializedName;

public class ContentType extends BaseModel implements Cloneable {
	@SerializedName("contentTypeId")
	protected Integer contentTypeId;
	@SerializedName("type")
	protected String type;

	public Integer getContentTypeId() {
		return contentTypeId;
	}

	public ContentType setContentTypeId(Integer contentTypeId) {
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
}

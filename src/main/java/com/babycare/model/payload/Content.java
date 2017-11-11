package com.babycare.model.payload;

import com.babycare.model.BaseModel;
import com.google.gson.annotations.SerializedName;

public class Content extends BaseModel implements Cloneable {
	private static final long serialVersionUID = 1L;


	@SerializedName("contentId")
	protected Long contentId;

	@SerializedName("contentTypeId")
	protected Long contentTypeId;

	@SerializedName("contentType")
	protected ContentType contentType;

	@SerializedName("header")
	protected String header;

	@SerializedName("content")
	protected String content;

	@SerializedName("mediaType")
	protected Integer mediaType;

	@SerializedName("start")
	protected Integer start;

	@SerializedName("end")
	protected Integer end;

	@SerializedName("timeUnit")
	protected Integer timeUnit;

	@SerializedName("babyType")
	protected Integer babyType;

	@SerializedName("bloodType")
	protected Integer bloodType;

	@SerializedName("gender")
	protected Integer gender;

	@SerializedName("region")
	protected Integer region;

	public Long getContentId() {
		return contentId;
	}

	public Long getContentTypeId() {
		return contentTypeId;
	}

	public ContentType getContentType() {
		return contentType;
	}

	public String getHeader() {
		return header;
	}

	public String getContent() {
		return content;
	}

	public Integer getMediaType() {
		return mediaType;
	}

	public Integer getEnd() {
		return end;
	}

	public Integer getStart() {
		return start;
	}

	public Integer getTimeUnit() {
		return timeUnit;
	}

	public Integer getBabyType() {
		return babyType;
	}

	public Integer getGender() {
		return gender;
	}

	public Integer getRegion() {
		return region;
	}

	public Integer getBloodType() {
		return bloodType;
	}

	public Content setBabyType(Integer babyType) {
		this.babyType = babyType;
		return this;
	}

	public Content setBloodType(Integer bloodType) {
		this.bloodType = bloodType;
		return this;
	}

	public Content setGender(Integer gender) {
		this.gender = gender;
		return this;
	}

	public Content setContentId(Long contentId) {
		this.contentId = contentId;
		return this;
	}

	public Content setRegion(Integer region) {
		this.region = region;
		return this;
	}

	public Content setTimeUnit(Integer timeUnit) {
		this.timeUnit = timeUnit;
		return this;
	}

	public Content setContentTypeId(Long contentTypeId) {
		this.contentTypeId = contentTypeId;
		return this;
	}

	public Content setContentType(ContentType contentType) {
		this.contentType = contentType;
		return this;
	}

	public Content setHeader(String header) {
		this.header = header;
		return this;
	}

	public Content setContent(String content) {
		this.content = content;
		return this;
	}

	public Content setMediaType(Integer mediaType) {
		this.mediaType = mediaType;
		return this;
	}

	public Content setStart(Integer start) {
		this.start = start;
		return this;
	}

	public Content setEnd(Integer end) {
		this.end = end;
		return this;
	}

	public Content() {

	}

	@Override
	public Content clone() throws CloneNotSupportedException {
		Content clone = (Content) super.clone();
		return clone;
	}
}

package com.babycare.model.payload;

import com.google.gson.annotations.SerializedName;

public class ContentBuilder {
	@SerializedName("childId")
	private Long childId;

	@SerializedName("contentTypeId")
	private Long contentTypeId;

	@SerializedName("pagerRequest")
	private PagerRequest pagerRequest;

	@SerializedName("weekNumber")
	private Integer weekNumber;

	@SerializedName("isNearestWeekNumber")
	private Boolean isNearestWeekNumber;

	public Long getChildId() {
		return childId;
	}

	public Long getContentTypeId() {
		return contentTypeId;
	}

	public PagerRequest getPagerRequest() {
		return pagerRequest;
	}

	public Integer getWeekNumber() {
		return weekNumber;
	}

	public Boolean getIsNearestWeekNumber() {
		return isNearestWeekNumber;
	}

	public void setWeekNumber(Integer weekNumber) {
		this.weekNumber = weekNumber;
	}

	public void setPagerRequest(PagerRequest pagerRequest) {
		this.pagerRequest = pagerRequest;
	}

	public void setIsNearestWeekNumber(Boolean isNearestWeekNumber) {
		this.isNearestWeekNumber = isNearestWeekNumber;
	}

	public void setContentTypeId(Long contentTypeId) {
		this.contentTypeId = contentTypeId;
	}

	public void setChildId(Long childId) {
		this.childId = childId;
	}
}

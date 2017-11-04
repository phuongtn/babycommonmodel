package com.babycare.model.payload;

import com.babycare.model.BaseModel;
import com.google.gson.annotations.SerializedName;

public class PagerRequest extends BaseModel {
	@SerializedName("page")
	private Integer page;
	@SerializedName("size")
	private Integer size;

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public PagerRequest() {
	}
	
	public PagerRequest(Integer page, Integer size) {
		this.page = page;
		this.size = size;
	}
}

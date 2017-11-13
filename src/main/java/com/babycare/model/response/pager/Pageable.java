package com.babycare.model.response.pager;

import com.google.gson.annotations.SerializedName;

public class Pageable {
	@SerializedName("sort")
	private Sort sort;
	@SerializedName("offset")
	private Integer offset;
	@SerializedName("pageSize")
	private Integer pageSize;
	@SerializedName("pageNumber")
	private Integer pageNumber;
	@SerializedName("paged")
	private Boolean paged;
	@SerializedName("unpaged")
	private Boolean unpaged;

	public Sort getSort() {
		return sort;
	}

	public void setSort(Sort sort) {
		this.sort = sort;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Boolean getPaged() {
		return paged;
	}

	public void setPaged(Boolean paged) {
		this.paged = paged;
	}

	public Boolean getUnpaged() {
		return unpaged;
	}

	public void setUnpaged(Boolean unpaged) {
		this.unpaged = unpaged;
	}
	
	public Pageable() {

	}
}

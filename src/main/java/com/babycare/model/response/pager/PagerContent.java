package com.babycare.model.response.pager;

import java.util.List;

import com.babycare.model.BaseModel;
import com.google.gson.annotations.SerializedName;

public class PagerContent<T extends BaseModel> extends BaseModel {
	@SerializedName("content")
	private List<T> content;
	@SerializedName("last")
	private Boolean last;
	@SerializedName("totalElements")
	private Long totalElements;
	@SerializedName("totalPages")
	private Integer totalPages;
	@SerializedName("size")
	private Integer size;
	@SerializedName("number")
	private Integer number;
	@SerializedName("sort")
	private Sort sort;
	@SerializedName("first")
	private Boolean first;
	@SerializedName("numberOfElements")
	private Integer numberOfElements;
	@SerializedName("pageable")
	private Pageable pageable;

	public Boolean getLast() {
		return last;
	}

	public void setLast(Boolean last) {
		this.last = last;
	}

	public Long getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(Long totalElements) {
		this.totalElements = totalElements;
	}

	public Integer getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Sort getSort() {
		return sort;
	}

	public void setSort(Sort sort) {
		this.sort = sort;
	}

	public Boolean getFirst() {
		return first;
	}

	public void setFirst(Boolean first) {
		this.first = first;
	}

	public Integer getNumberOfElements() {
		return numberOfElements;
	}

	public void setNumberOfElements(Integer numberOfElements) {
		this.numberOfElements = numberOfElements;
	}

	public List<T> getContent() {
		return content;
	}

	public void setContent(List<T> content) {
		this.content = content;
	}

	public Pageable getPageable() {
		return pageable;
	}

	public void setPageable(Pageable pageable) {
		this.pageable = pageable;
	}

}

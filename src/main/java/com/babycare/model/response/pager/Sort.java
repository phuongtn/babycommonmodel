package com.babycare.model.response.pager;

import com.google.gson.annotations.SerializedName;

public class Sort {
	@SerializedName("sorted")
	private Boolean sorted;
	@SerializedName("unsorted")
	private Boolean unsorted;
	public Boolean getSorted() {
		return sorted;
	}
	public void setSorted(Boolean sorted) {
		this.sorted = sorted;
	}
	public Boolean getUnsorted() {
		return unsorted;
	}
	public void setUnsorted(Boolean unsorted) {
		this.unsorted = unsorted;
	}
	
	public Sort() {

	}
}

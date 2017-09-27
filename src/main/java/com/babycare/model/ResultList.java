package com.babycare.model;

import java.util.List;

public class ResultList<T extends BaseModel> extends BaseModel {
	private List<T> resultList;

	public List<T> getResultList() {
		return resultList;
	}

	public void setResultList(List<T> resultList) {
		this.resultList = resultList;
	}

	public ResultList(List<T> resultList) {
		this.resultList = resultList;
	}
}

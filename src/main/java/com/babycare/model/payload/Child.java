package com.babycare.model.payload;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.babycare.model.BaseModel;
import com.google.gson.annotations.SerializedName;

public class Child extends BaseModel implements Cloneable {
	private static final long serialVersionUID = 1L;
	@SerializedName("childId")
	protected Long childId;
	@SerializedName("userId")
	protected Long userId;
	@SerializedName("name")
	protected String name;
	@SerializedName("dob")
	protected Long dob;
	@SerializedName("babyType")
	protected Integer babyType;
	@SerializedName("blood")
	protected Integer blood;
	@SerializedName("gender")
	protected Integer gender;
	@SerializedName("region")
	protected Integer region;
	@SerializedName("user")
	protected User user;

	public Child setUserId(Long userId) {
		this.userId = userId;
		return this;
	}

	public Long getChildId() {
		return childId;
	}

	public Child setChildId(Long childId) {
		this.childId = childId;
		return this;
	}
	
	public Child() {
	}

	public String getName() {
		return name;
	}
	public Child setName(String name) {
		this.name = name;
		return this;
	}

	public Long getDob() {
		return dob;
	}

	public Child setDob(Long dob) {
		this.dob = dob;
		return this;
	}
	public Integer getBabyType() {
		return babyType;
	}
	public Child setBabyType(Integer babyType) {
		this.babyType = babyType;
		return this;
	}
	public Integer getBlood() {
		return blood;
	}
	public Child setBlood(Integer blood) {
		this.blood = blood;
		return this;
	}
	public Integer getGender() {
		return gender;
	}
	public Child setGender(Integer gender) {
		this.gender = gender;
		return this;
	}
	public Integer getRegion() {
		return region;
	}
	public Child setRegion(Integer region) {
		this.region = region;
		return this;
	}
	public Long getUserId() {
		return userId;
	}
	
	@Override
	public Child clone() throws CloneNotSupportedException { 
		Child clone= (Child) super.clone();
		return clone;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

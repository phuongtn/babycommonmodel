package com.babycare.model.payload;


import com.babycare.model.BaseModel;
import com.google.gson.annotations.SerializedName;

public class User extends BaseModel implements Cloneable {
	@SerializedName("userId")
	protected Long userId;
	@SerializedName("name")
	protected String name;
	@SerializedName("dob")
	protected Long dob;
	@SerializedName("email")
	protected String email;
	@SerializedName("provider")
	protected String provider;

	public User() {}

	public User(Long userId) {
		this.userId = userId;
	}

	public User(String email, String provider) {
		this.email = email;
		this.provider = provider;
	}

	public User setUserId(Long userId) {
		this.userId = userId;
		return this;
	}

	public User setName(String name) {
		this.name = name;
		return this;
	}

	public User setDob(Long dob) {
		this.dob = dob;
		return this;
	}

	public User setEmail(String email) {
		this.email = email;
		return this;
	}

	public User setProvider(String provider) {
		this.provider = provider;
		return this;
	}

	public Long getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}

	public Long getDob() {
		return dob;
	}

	public String getProvider() {
		return provider;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public User clone() throws CloneNotSupportedException { 
		User clone= (User) super.clone();
		return clone;
	}
}

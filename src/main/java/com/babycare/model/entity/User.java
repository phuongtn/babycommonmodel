package com.babycare.model.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.babycare.model.BaseModel;
import com.babycare.model.Error;
import com.google.gson.annotations.SerializedName;

/*@Table(name = "user", catalog = "babycare", uniqueConstraints = {
@UniqueConstraint(columnNames = "email"),
@UniqueConstraint(columnNames = "provider") })*/
@Entity
@Table(name = "user", catalog = "babycare")
public class User extends BaseModel implements Serializable {

	private static final long serialVersionUID = -3922441868508208542L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="userid")
	@SerializedName("userId")
	private Long userId;

	@Column(name="name")
	@SerializedName("name")
	private String name;


	@Column(name="dob")
	@SerializedName("dob")
	private Long dob;

	@Column(name="email")
	@SerializedName("email")
	private String email;

	@Column(name="provider")
	@SerializedName("provider")
	private String provider;

	@OneToMany(mappedBy = "user")
	@SerializedName("children")
	private Set<Child> children;

	public User() {}

	public User(Error error) {
		setError(error);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getDob() {
		return dob;
	}

	public void setDob(Long dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public Set<Child> getChildren() {
		return children;
	}

	public void setChildren(Set<Child> children) {
		this.children = children;
	}
	
}

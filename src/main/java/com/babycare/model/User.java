package com.babycare.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


@Entity
@Table(name = "user", catalog = "babycare")
public class User extends BaseModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3922441868508208542L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="userid")
	private Long userId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="hardwareid")
	private String hardwareId;
	
	@Column(name="babydob")
	private Long babyDob;

	@Column(name="dob")
	private Long dob;

	@Column(name="status")
	private Integer status;

	@Column(name="provider")
	private String provider;

	@Column(name="pushid")
	private String pushId;

	@Column(name="password")
	private String password;

	@Column(name="lastactivetimestamp")
	private Long lastactivetimestamp;
	
	@Column(name="email")
	private String email;

	@Column(name="platform")
	private String platform;

	public User() {}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getHardwareId() {
		return hardwareId;
	}


	public void setHardwareId(String hardwareId) {
		this.hardwareId = hardwareId;
	}


	public Long getBabyDob() {
		return babyDob;
	}


	public void setBabyDob(Long babyDob) {
		this.babyDob = babyDob;
	}


	public Long getDob() {
		return dob;
	}


	public void setDob(Long dob) {
		this.dob = dob;
	}


	public Integer getStatus() {
		return status;
	}


	public void setStatus(Integer status) {
		this.status = status;
	}


	public String getProvider() {
		return provider;
	}


	public void setProvider(String provider) {
		this.provider = provider;
	}


	public String getPushId() {
		return pushId;
	}


	public void setPushId(String pushId) {
		this.pushId = pushId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Long getLastactivetimestamp() {
		return lastactivetimestamp;
	}


	public void setLastactivetimestamp(Long lastactivetimestamp) {
		this.lastactivetimestamp = lastactivetimestamp;
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
	
}

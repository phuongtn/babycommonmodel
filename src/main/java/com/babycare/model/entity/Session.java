package com.babycare.model.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.babycare.model.BaseModel;
import com.google.gson.annotations.SerializedName;

@Entity
@Table(name = "session", catalog = "babycare")
public class Session extends BaseModel implements Serializable {

	private static final long serialVersionUID = 856603274488076082L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="sessionid")
	@SerializedName("sessionId")
	private Long sessionId;

	@ManyToOne(optional = false)
	@JoinColumn(name = "userid", referencedColumnName = "userid", 
		foreignKey = @ForeignKey(name = "FK_session_user"))
	private User user;


	@Column(name="pushid")
	@SerializedName("pushId")
	private String pushId;

	@Column(name="hardwareid")
	@SerializedName("hardwareId")
	private String hardwareId;

	@Column(name="platform")
	@SerializedName("platform")
	private String platform;
	private Integer status;

	@Transient
	@SerializedName("userId")
	private Long userId;

	public String getHardwareId() {
		return hardwareId;
	}

	public void setHardwareId(String hardwareId) {
		this.hardwareId = hardwareId;
	}

	public Long getSessionId() {
		return sessionId;
	}
	public void setSessionId(Long sessionId) {
		this.sessionId = sessionId;
	}

	public String getPushId() {
		return pushId;
	}

	public void setPushId(String pushId) {
		this.pushId = pushId;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Session() {

	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

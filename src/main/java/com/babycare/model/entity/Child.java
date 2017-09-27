package com.babycare.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.babycare.model.BaseModel;
import com.google.gson.annotations.SerializedName;

@Entity
@Table(name = "children", catalog = "babycare")
public class Child extends BaseModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1416878046123153824L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="childid")
	@SerializedName("childId")
	private Long childId;

	@Column(name="userid")
	@SerializedName("userId")
	private Long userId;

/*	@ManyToOne(optional = false)
	@JoinColumn(name = "userid", referencedColumnName = "userid", 
	foreignKey = @ForeignKey(name = "FK_children_user"))*/
/*	@ManyToOne
	@JoinColumn(name="userid")
	private User user;
*/
	@Column(name="name")
	@SerializedName("name")
	private String name;

	@Column(name="dob")
	@SerializedName("dob")
	private Long dob;

	@Column(name="babytype")
	@SerializedName("babyType")
	private Integer babyType;

	@Column(name="blood")
	@SerializedName("blood")
	private Integer blood;

	@Column(name="gender")
	@SerializedName("gender")
	private Integer gender;

	@Column(name="region")
	@SerializedName("region")
	private Integer region;

	public Child() {}

	public Long getChildId() {
		return childId;
	}

	public void setChildId(Long childId) {
		this.childId = childId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

/*	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}*/

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

	public Integer getBabyType() {
		return babyType;
	}

	public void setBabyType(Integer babyType) {
		this.babyType = babyType;
	}

	public Integer getBlood() {
		return blood;
	}

	public void setBlood(Integer blood) {
		this.blood = blood;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Integer getRegion() {
		return region;
	}

	public void setRegion(Integer region) {
		this.region = region;
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

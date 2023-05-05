package com.productServce.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="user_product_info")

public class productEntity implements Serializable
{
	
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
    
	@Column(name="devcieId")
	private String deviceId;
	@Column(name="userId")
	private String userId;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="referralCdoe")
	private String referralCdoe;

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getReferralCdoe() {
		return referralCdoe;
	}

	public void setReferralCdoe(String referralCdoe) {
		this.referralCdoe = referralCdoe;
	}
	
	

}

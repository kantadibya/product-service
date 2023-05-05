package com.productServce.dto;

public class serviceDto {
	
	private String deviceId;
	private String userId;
	private String email;
	private String password;
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
	@Override
	public String toString() {
		return "serviceDto [deviceId=" + deviceId + ", userId=" + userId + ", email=" + email + ", password=" + password
				+ ", referralCdoe=" + referralCdoe + "]";
	}
	

}

package com.cryp.harsh.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity

public class TwoFactorOtp {
	
	@Id
	private String id;
	private String otp;
	
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@OneToOne
	private User user;
	
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private String jwt;

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}

	
	public TwoFactorOtp(String id, String otp, User user, String jwt) {
		super();
		this.id = id;
		this.otp = otp;
		this.user = user;
		this.jwt = jwt;
	}
	
	public TwoFactorOtp() {}
	
	
}
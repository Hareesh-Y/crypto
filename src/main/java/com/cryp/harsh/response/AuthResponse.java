package com.cryp.harsh.response;

public class AuthResponse {
	
	private String jwt;
	private boolean status;
	private String message;
	private boolean isTwoFactorAuthEnabled;
	private String session;
	
	
	public String getJwt() {
		return jwt;
	}
	public void setJwt(String jwt) {
		this.jwt = jwt;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isTwoFactorAuthEnabled() {
		return isTwoFactorAuthEnabled;
	}
	public void setTwoFactorAuthEnabled(boolean isTwoFactorAuthEnabled) {
		this.isTwoFactorAuthEnabled = isTwoFactorAuthEnabled;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public AuthResponse(String jwt, boolean status, String message, boolean isTwoFactorAuthEnabled, String session) {
		super();
		this.jwt = jwt;
		this.status = status;
		this.message = message;
		this.isTwoFactorAuthEnabled = isTwoFactorAuthEnabled;
		this.session = session;
	}
	
	public AuthResponse() {}

}
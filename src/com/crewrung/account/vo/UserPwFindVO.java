package com.crewrung.account.vo;

public class UserPwFindVO {
	
	private String email;
	
	public UserPwFindVO(){}

	public UserPwFindVO(String email) {
		super();
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserPwFindVO [email=" + email + "]";
	}
	
	
	
	
	
	
}

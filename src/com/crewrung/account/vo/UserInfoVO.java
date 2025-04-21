package com.crewrung.account.vo;

import java.time.LocalDate;

public class UserInfoVO {
    private String userId;
    private String email;
    private String phoneNumber;
    private String nickname;
    private String gender;
    private String location;     // city_name + gu_name
    private LocalDate birthDate;
    
    
	public UserInfoVO(String userId, String email, String phoneNumber, String nickname, String gender, String location,
			LocalDate birthDate) {
		super();
		this.userId = userId;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.nickname = nickname;
		this.gender = gender;
		this.location = location;
		this.birthDate = birthDate;
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


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public LocalDate getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}


	@Override
	public String toString() {
		return "UserInfoVO [userId=" + userId + ", email=" + email + ", phoneNumber=" + phoneNumber + ", nickname="
				+ nickname + ", gender=" + gender + ", location=" + location + ", birthDate=" + birthDate + "]";
	}
	
	
    
    
    
    
    
}

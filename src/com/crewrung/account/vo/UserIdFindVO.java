package com.crewrung.account.vo;

public class UserIdFindVO {
	
	private String userId;
	private String question;
	private String answer;
	
	
	public UserIdFindVO(String userId, String question, String answer) {
		super();
		this.userId = userId;
		this.question = question;
		this.answer = answer;
	}


	@Override
	public String toString() {
		return "UserIdFindVO [userId=" + userId + ", question=" + question + ", answer=" + answer + "]";
	}
	
	
	
	

}

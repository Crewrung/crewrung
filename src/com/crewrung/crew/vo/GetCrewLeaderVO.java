package com.crewrung.crew.vo;

public class GetCrewLeaderVO {
	private String name;
	private String nickname;
	
	public GetCrewLeaderVO(String name, String nickname) {
		super();
		this.name = name;
		this.nickname = nickname;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	@Override
	public String toString() {
		return "GetCrewLeaderVO [name=" + name + ", nickname=" + nickname + "]";
	}
	
}

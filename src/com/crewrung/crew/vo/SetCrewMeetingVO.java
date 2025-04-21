package com.crewrung.crew.vo;

public class SetCrewMeetingVO {
	private String title;
	private String image;
	private String meetingDate;
	private int maxMember;
	private int guNumber;
	
	public SetCrewMeetingVO(){}

	public SetCrewMeetingVO(String title, String image, String meetingDate, int maxMember, int guNumber) {
		super();
		this.title = title;
		this.image = image;
		this.meetingDate = meetingDate;
		this.maxMember = maxMember;
		this.guNumber = guNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getMeetingDate() {
		return meetingDate;
	}

	public void setMeetingDate(String meetingDate) {
		this.meetingDate = meetingDate;
	}

	public int getMaxMember() {
		return maxMember;
	}

	public void setMaxMember(int maxMember) {
		this.maxMember = maxMember;
	}

	public int getGuNumber() {
		return guNumber;
	}

	public void setGuNumber(int guNumber) {
		this.guNumber = guNumber;
	}

	@Override
	public String toString() {
		return "SetCrewMeetingVO [title=" + title + ", image=" + image + ", meetingDate=" + meetingDate + ", maxMember="
				+ maxMember + ", guNumber=" + guNumber + "]";
	};
}

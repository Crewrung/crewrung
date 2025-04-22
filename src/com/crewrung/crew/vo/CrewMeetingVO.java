package com.crewrung.crew.vo;

public class CrewMeetingVO {
	private String image;
	private String title;
	private String content;
	private String meetingDate;
	private String guName;
	private String hostName;
	
	public CrewMeetingVO(){}

	public CrewMeetingVO(String image, String title, String content, String meetingDate, String guName,
			String hostName) {
		this.image = image;
		this.title = title;
		this.content = content;
		this.meetingDate = meetingDate;
		this.guName = guName;
		this.hostName = hostName;
	}
	
	public CrewMeetingVO(String image, String title, String content, String meetingDate, String guName) {
		this(image, title, content, meetingDate, guName,null);
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getMeetingDate() {
		return meetingDate;
	}

	public void setMeetingDate(String meetingDate) {
		this.meetingDate = meetingDate;
	}

	public String getGuName() {
		return guName;
	}

	public void setGuName(String guName) {
		this.guName = guName;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	@Override
	public String toString() {
		return "CrewMeetingVO [image=" + image + ", title=" + title + ", content=" + content + ", meetingDate="
				+ meetingDate + ", guName=" + guName + ", hostName=" + hostName + "]";
	}
}

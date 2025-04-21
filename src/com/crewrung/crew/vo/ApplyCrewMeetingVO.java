package com.crewrung.crew.vo;

public class ApplyCrewMeetingVO {
	private int crewParticipantNumber;
	private int crewMeetingNumber;
	private int crewMemberNumber;
	private String applyDate;
	
	public ApplyCrewMeetingVO(){}

	public ApplyCrewMeetingVO(int crewParticipantNumber, int crewMeetingNumber, int crewMemberNumber,
			String applyDate) {
		this.crewParticipantNumber = crewParticipantNumber;
		this.crewMeetingNumber = crewMeetingNumber;
		this.crewMemberNumber = crewMemberNumber;
		this.applyDate = applyDate;
	}

	public int getCrewParticipantNumber() {
		return crewParticipantNumber;
	}

	public void setCrewParticipantNumber(int crewParticipantNumber) {
		this.crewParticipantNumber = crewParticipantNumber;
	}

	public int getCrewMeetingNumber() {
		return crewMeetingNumber;
	}

	public void setCrewMeetingNumber(int crewMeetingNumber) {
		this.crewMeetingNumber = crewMeetingNumber;
	}

	public int getCrewMemberNumber() {
		return crewMemberNumber;
	}

	public void setCrewMemberNumber(int crewMemberNumber) {
		this.crewMemberNumber = crewMemberNumber;
	}

	public String getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + crewMeetingNumber;
		result = prime * result + crewMemberNumber;
		result = prime * result + crewParticipantNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApplyCrewMeetingVO other = (ApplyCrewMeetingVO) obj;
		if (crewMeetingNumber != other.crewMeetingNumber)
			return false;
		if (crewMemberNumber != other.crewMemberNumber)
			return false;
		if (crewParticipantNumber != other.crewParticipantNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CrewMeetingParticipantVO [crewParticipantNumber=" + crewParticipantNumber + ", crewMeetingNumber="
				+ crewMeetingNumber + ", crewMemberNumber=" + crewMemberNumber + ", applyDate=" + applyDate + "]";
	};
}	

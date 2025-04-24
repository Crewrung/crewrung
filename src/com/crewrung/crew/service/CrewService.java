package com.crewrung.crew.service;

import java.util.Collection;

import com.crewrung.crew.dao.CrewDAO;
import com.crewrung.crew.vo.ApplyCrewMeetingVO;
import com.crewrung.crew.vo.CrewAppliesVO;
import com.crewrung.crew.vo.CrewMeetingParticipantVO;
import com.crewrung.crew.vo.CrewMeetingVO;
import com.crewrung.crew.vo.CrewMemberVO;
import com.crewrung.crew.vo.CrewVO;


public class CrewService {
	private CrewDAO crewDAO;
	
	public CrewService(CrewDAO crewDAO) {
		this.crewDAO = crewDAO;
	}
	
	public boolean isCrewLeaderService(int crewNumber, String crewLeaderId){
		return crewDAO.isCrewLeader(crewNumber, crewLeaderId);
	}
	
	public boolean isCrewMeetingHostService(CrewMeetingVO cm){
		return crewDAO.isCrewMeetingHost(cm);
	}
	
	public boolean setCrewMeetingService(CrewMeetingVO cm){
		return crewDAO.addCrewMeeting(cm);
	}
	
	public boolean applyCrewMeetingService(ApplyCrewMeetingVO acm){
		return crewDAO.applyCrewMeeting(acm);
	}
	
	public Collection<CrewMeetingParticipantVO> getCrewMeetingParticipantsService(int crewMeetingNumber){
		return crewDAO.getCrewMeetingParticipants(crewMeetingNumber);
	}
	
	public CrewMeetingParticipantVO getCrewMeetingHostService(int crewMeetingNumber){
		return crewDAO.getCrewMeetingHost(crewMeetingNumber);
	}
	
	public boolean addCrewMeetingService(CrewMeetingVO cm){
		return crewDAO.addCrewMeeting(cm);
	}
	
	public CrewMeetingVO getCrewMeetingService(int crewMeetingNumber){
		return crewDAO.getCrewMeeting(crewMeetingNumber);
	}
	
	public Collection<CrewMeetingVO> getCrewMeetingsInfoService(int crewNumber){
		return crewDAO.getCrewMeetingsInfo(crewNumber);
	}
	
	public boolean removeCrewApplesService(CrewAppliesVO ca){
		return crewDAO.removeCrewApplies(ca);
	}
	
	public boolean addCrewMemberService(CrewMemberVO cm){
		return crewDAO.addCrewMember(cm);
	}
	
	public boolean removeCrewMemberService(CrewMemberVO cm){
		return crewDAO.removeCrewMember(cm);
	}
}
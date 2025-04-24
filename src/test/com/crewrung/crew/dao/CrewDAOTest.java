package test.com.crewrung.crew.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import com.crewrung.crew.dao.CrewDAO;
import com.crewrung.crew.vo.ApplyCrewMeetingVO;
import com.crewrung.crew.vo.CrewAppliesVO;
import com.crewrung.crew.vo.CrewMeetingVO;
import com.crewrung.crew.vo.CrewMemberVO;
import com.crewrung.flashMob.dao.FlashMobDAO;
import com.crewrung.flashMob.vo.FlashMobMainViewVO;
import com.crewrung.crew.dao.CrewDAO;
import com.crewrung.crew.vo.AllCrewVO;
import com.crewrung.crew.vo.CrewApplicationVO;
import com.crewrung.crew.vo.CrewCommentVO;
import com.crewrung.crew.vo.CrewLeaderVO;
import com.crewrung.crew.vo.CrewManagePageVO;
import com.crewrung.crew.vo.CrewVO;
import com.crewrung.crew.vo.PromotionVO;
import com.crewrung.db.DBCP;

public class CrewDAOTest {
	private SqlSession session;
	private CrewDAO dao;

	@Before
	public void setUp() throws Exception {
		session = DBCP.getSqlSessionFactory().openSession(true);
		dao = new CrewDAO(session);
	}

	@After
	public void tearDown() throws Exception {
		if (session != null) {
			session.rollback(); // �׽�Ʈ ������ �ѹ�
			session.close();
		}
	}

//	@Test
//	public void successSetCrewMeeting() {
//		assertTrue(dao.setCrewMeeting(new CrewMeetingVO("", "�� ����", "�� ����", "2025-01-11", 6, 1111000000, 2)));
//	}
//
//	@Test
//	public void failSetCrewMeeting() {
//		try {
//			dao.setCrewMeeting(new CrewMeetingVO("", "�� ����", "�� ����", "2025-12-11", 6, 1000000, 2));
//		} catch (Exception e) {
//			assertTrue(e.getClass() == PersistenceException.class);
//		}
//	}
//
//	@Test
//	public void successApplyCrewMeeting() {
//		assertTrue(dao.applyCrewMeeting(new ApplyCrewMeetingVO(11, 31)));
//	}
//
//	@Test
//	public void failApplyCrewMeeting() {
//		try {
//			dao.applyCrewMeeting(new ApplyCrewMeetingVO(1, 2));
//		} catch (Exception e) {
//			assertTrue(e.getClass() == PersistenceException.class);
//		}
//	}
//	
//	@Test
//	public void successGetCrewMeetingParticipants() {
//		assertNotNull(dao.getCrewMeetingParticipants(4));
//	}
//	
//	@Test
//	public void failGetCrewMeetingParticipants() {
//		assertEquals(dao.getCrewMeetingParticipants(343243).size(),0);
//	}
//	
//	@Test
//	public void successGetCrewMeetingHost() {
//		assertNotNull(dao.getCrewMeetingHost(1));
//	}
//	
//	@Test
//	public void failGetCrewMeetingHost() {
//		assertNull(dao.getCrewMeetingHost(23323));
//	}
	
//	@Test
//	public void successAddCrewMeeting() {
//		assertTrue(dao.addCrewMeeting(new CrewMeetingVO("�౸ ��� �������Ǻ�", "��� �����", "2025-04-30", 4, 1, 11, 1171000000)));
//	}
//	
//	@Test
//	public void failAddCrewMeeting() {
//		try {
//			dao.addCrewMeeting(new CrewMeetingVO("�౸ ��� �������Ǻ�", "��� �����", "2025-04-30", 4, 1, 11, 232332));
//		} catch (Exception e) {
//			assertTrue(e.getClass() == PersistenceException.class);
//		}
//	}
	
//	@Test
//	public void successGetCrewMeeting() {
//		assertNotNull(dao.getCrewMeeting(50));
//	}
	
//	@Test
//	public void failGetCrewMeeting() {
//		assertNull(dao.getCrewMeeting(3232233));
//	}
	
//	@Test
//	public void successGetCrewMeetingInfo() {
//		assertNotNull(dao.getCrewMeetingsInfo(1));
//	}
	
//	@Test
//	public void failGetCrewMeetingInfo() {
//		assertEquals(dao.getCrewMeetingsInfo(12234).size(), 0);
//	}
	
//	@Test
//	public void successRemoveCrewApplies() {
//		assertTrue(dao.removeCrewApplies(new CrewAppliesVO(301, 1)));
//	}
//	
//	@Test
//	public void failRemoveCrewApplies() {
//		assertFalse(dao.removeCrewApplies(new CrewAppliesVO(301, 3213121)));
//	}
	
//	@Test
//	public void successAddCrewMember() {
//		assertTrue(dao.addCrewMember(new CrewMemberVO(1, "gaerin01")));
//	}
//	
//	@Test
//	public void failAddCrewMember() {
//		try{
//			dao.addCrewMember(new CrewMemberVO(1, "gaerin01"));
//		}catch(Exception e){
//			assertTrue(e.getClass() == PersistenceException.class);
//		}
//		
//	}
	
//	@Test
//	public void successRemoveCrewMember() {
//		assertTrue(dao.removeCrewMember(new CrewMemberVO(1, 3)));
//	}
//	
//	@Test
//	public void failRemoveCrewMember() {
//		assertFalse(dao.removeCrewMember(new CrewMemberVO(30231, 3213121)));
//	}
	
	@Test //ȫ���ϴ� ũ������ ��ȸ(����� ���� ���� ���)
	public void ȫ��ũ��������ȸ�׽�Ʈ1() {
		List<PromotionVO> result = dao.getAllPromotionCrew();
		assertNotEquals(7, result.size());
	}

	@Test //ȫ���ϴ� ũ������ ��ȸ(����� ���� ���)
	public void ȫ��ũ��������ȸ�׽�Ʈ2() {
		List<PromotionVO> result = dao.getAllPromotionCrew();
		assertEquals(6, result.size());
	}

	@Test //��� ũ������ ��ȸ(����� ���� ���� ���)
	public void ���ũ��������ȸ�׽�Ʈ1() {
		List<AllCrewVO> result = dao.getAllCrew();
		assertNotEquals(9, result.size());
	}

	@Test //��� ũ������ ��ȸ(����� ���� ���)
	public void ���ũ��������ȸ�׽�Ʈ2() {
		List<AllCrewVO> result = dao.getAllCrew();
		assertNotEquals(10, result.size());
	}

	@Test //���� ����� ��� ũ������ ��ȸ(����� ���� ���� ���)
	public void ��������ȸ��ũ��������ȸ�׽�Ʈ1() {
		Map<String, String> filter = new HashMap<>();
		filter.put("interestCategory", null);
		filter.put("guName", "������");
		filter.put("ageRange", null);
		List<AllCrewVO> result = dao.getAllCrewByFilter(filter);
		boolean found = result.stream()
				.anyMatch(crew -> "��걸".equals(crew.getGuName()));
		assertFalse(found);
	}

	@Test //���� ����� ��� ũ������ ��ȸ(����� ���� ���)
	public void ��������ȸ��ũ��������ȸ�׽�Ʈ2() {
		Map<String, String> filter = new HashMap<>();
		filter.put("interestCategory", "�");
		filter.put("guName", "���ı�");
		List<AllCrewVO> result = dao.getAllCrewByFilter(filter);
		boolean found = result.stream()
				.anyMatch(crew -> "������ũ".equals(crew.getCrewName()));
		assertTrue(found);
	}

	@Test //ũ�� ������ ��ȸ(����� ���� ���� ���)
	public void ũ���������ȸ�׽�Ʈ1() {
		AllCrewVO result = dao.getCrewDetail(7);
		assertNotEquals("������ũ", result.getCrewName());
	}

	@Test //ũ�� ������ ��ȸ(����� ���� ���)
	public void ũ���������ȸ�׽�Ʈ2() {
		AllCrewVO result = dao.getCrewDetail(7);
		assertEquals("��������", result.getCrewName());
	}

	@Test //ũ���� ���� ��ȸ(����� ���� ���� ���)
	public void ũ����������ȸ�׽�Ʈ1() {
		CrewLeaderVO result = dao.getCrewLeader(7);
		assertNotEquals("�̻���", result.getName());
	}

	@Test //ũ���� ���� ��ȸ(����� ���� ���)
	public void ũ����������ȸ�׽�Ʈ2() {
		CrewLeaderVO result = dao.getCrewLeader(7);
		assertEquals("�̿���", result.getName());
	}

	@Test //ũ�� �����ϱ�(����� ���� ���� ���)
	public void ũ������׽�Ʈ1() {
		int result = 0;
		result = dao.addCrew(new CrewVO("��������", "kyeongmin56", "�Բ� �� �������� Ȱ���ؿ�!", "�", "20��-30��", "crew1.jpg", "���� �ٷ� �����ϼ���!", 'Y', 1111000000));
		assertNotEquals(result, 1);
	}

	@Test //ũ�� �����ϱ�(����� ���� ���)
	public void ũ������׽�Ʈ2() {
		int result = 0;
		result = dao.addCrew(new CrewVO("��������", "kyeongmin56", "�Բ� �� �������� Ȱ���ؿ�!", "�", "20��-30��", "crew11jpg", "���� �ٷ� �����ϼ���!", 'Y', 1111000000));
		assertEquals(result, 1);
	}

	@Test //ũ�� �����ϱ�(����� ���� ���� ���)
	public void ũ������׽�Ʈ1() {
		int result = 0;
		result = dao.updateCrew(new CrewVO(11, "��������", "kyeongmin56", "�Բ� �� �������� Ȱ���ؿ�!", "�", "20��-30��", "crew1.jpg", "���� �ٷ� �����ϼ���!", 'Y', 1111000000));
		assertNotEquals(result, 0);
	}

	@Test //ũ�� �����ϱ�(����� ���� ���)
	public void ũ������׽�Ʈ2() {
		int result = 0;
		result = dao.updateCrew(new CrewVO(7, "��������", "kyeongmin56", "�Բ� �� �������� Ȱ���ؿ�!", "�", "20��-30��", "crew1.jpg", "���� �ٷ� �����ϼ���!", 'Y', 1111000000));
		assertEquals(result, 1);
	}

	@Test //ũ�� ��ü ��� ���� ��ȸ(����� ���� ���� ���)
	public void ũ���۰�����ȸ�׽�Ʈ1() {
		int result = 0;
		result = dao.getCommentCount(5);
		assertNotEquals(result, 1);
	}

	@Test //ũ�� ��ü ��� ���� ��ȸ(����� ���� ���)
	public void ũ���۰�����ȸ�׽�Ʈ2() {
		int result = 0;
		result = dao.getCommentCount(5);
		assertEquals(result, 2);
	}

	@Test //ũ�� ��� �ۼ������� �� ��� ���� ��ȸ(����� ���� ���� ���)
	public void ũ���۳�����ȸ�׽�Ʈ1() {
		List<CrewCommentVO> result = new ArrayList<>();
		result = dao.getCrewCommentDetail(9);
		boolean found = result.stream()
				.anyMatch(crew -> "leesanghyeok".equals(crew.getNickname()));
		assertTrue(found);
	}

	@Test //ũ�� ��� �ۼ������� �� ��� ���� ��ȸ(����� ���� ���)
	public void ũ���۳�����ȸ�׽�Ʈ2() {
		List<CrewCommentVO> result = new ArrayList<>();
		result = dao.getCrewCommentDetail(9);
		boolean found = result.stream()
				.anyMatch(crew -> "sgim".equals(crew.getNickname()));
		assertTrue(found);
	}

	@Test //ũ�� ���� ��û(����� ���� ���� ���)
	public void ũ�簡�Խ�û�׽�Ʈ1() {
		int result = 0;
		result = dao.applyToCrew(new CrewApplicationVO(8, "cunjabag4556", "� ���ƿ�. �Բ� �ؿ�!"));
		assertNotEquals(result, 1);
	}

	@Test //ũ�� ���� ��û(����� ���� ���)
	public void ũ�簡�Խ�û�׽�Ʈ2() {
		int result = 0;
		result = dao.applyToCrew(new CrewApplicationVO(8, "cunjabag45", "� ���ƿ�. �Բ� �ؿ�!"));
		assertEquals(result, 1);
	}

	@Test //ũ�� ���������� ��ȸ(ũ�簡�Խ�û��)(����� ���� ���� ���)
	public void ũ�������������ũ�簡�Խ�û����ȸ�׽�Ʈ1() {
		List<CrewManagePageVO> result = new ArrayList<>();
		result = dao.getCrewApplicants(1);
		boolean found = result.stream()
				.anyMatch(crew -> "jseo1".equals(crew.getNickname()));
		assertFalse(found);
	}

	@Test //ũ�� ���������� ��ȸ(ũ�簡�Խ�û��)(����� ���� ���)
	public void ũ�������������ũ�簡�Խ�û����ȸ�׽�Ʈ2() {
		List<CrewManagePageVO> result = new ArrayList<>();
		result = dao.getCrewApplicants(1);
		boolean found = result.stream()
				.anyMatch(crew -> "jseo".equals(crew.getNickname()));
		assertTrue(found);
	}

	@Test //ũ�� ���������� ��ȸ(ũ���)(����� ���� ���� ���)
	public void ũ�������������ũ�����ȸ�׽�Ʈ1() {
		List<CrewManagePageVO> result = new ArrayList<>();
		result = dao.getCrewMember(2);
		boolean found = result.stream()
				.anyMatch(crew -> "ygim1".equals(crew.getNickname()));
		assertFalse(found);
	}

	@Test //ũ�� ���������� ��ȸ(ũ���)(����� ���� ���)
	public void ũ�������������ũ�����ȸ�׽�Ʈ2() {
		List<CrewManagePageVO> result = new ArrayList<>();
		result = dao.getCrewMember(2);
		boolean found = result.stream()
				.anyMatch(crew -> "ygim".equals(crew.getNickname()));
		assertTrue(found);
	}
}

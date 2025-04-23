package test.com.crewrung.flashMob.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.crewrung.account.vo.UserInfoVO;
import com.crewrung.db.DBCP;
import com.crewrung.flashMob.dao.FlashMobDAO;
import com.crewrung.flashMob.service.FlashMobService;
import com.crewrung.flashMob.vo.FlashMobMainViewVO;
import com.crewrung.flashMob.vo.FlashMobVO;

public class FlashMobServiceTest {
	private SqlSession session;
	private FlashMobDAO dao;
	private FlashMobService service;

	@Before
	public void setUp() throws Exception {
		session = DBCP.getSqlSessionFactory().openSession(false);
		dao = new FlashMobDAO(session);
		service = new FlashMobService(dao);
	}

	@After
	public void tearDown() throws Exception {
		if (session != null) {
			session.rollback(); // 테스트 끝나면 롤백
			session.close();
		}
	}

	// 기능1: 전체 번개모임 조회
	@Test
	public void successGetAllFlashMobs() {
		List<FlashMobMainViewVO> result = service.getAllFlashMobs();
		assertTrue(result != null && result.size() > 0);
	}

	// 기능2: 필터링 조회
	@Test
	public void successGetAllFlashMobsByFilter() {
		Map<String, String> filter = new HashMap<>();
		filter.put("interestCategory", "운동");

		List<FlashMobMainViewVO> result = service.getAllFlashMobsByFilter(filter);
		assertTrue(result != null && result.size() > 0);
	}

	@Test
	public void failGetAllFlashMobsByFilter() {
		Map<String, String> filter = new HashMap<>();
		filter.put("interestCategory", "없는카테고리");

		List<FlashMobMainViewVO> result = service.getAllFlashMobsByFilter(filter);
		assertTrue(result.isEmpty());
	}

	// 기능3: 상세 조회
	@Test
	public void successGetFlashMobDetail() {
		FlashMobVO result = service.getFlashMobDetail(1);
		assertNotNull(result);
		assertEquals("래핑 플래시몹 모집", result.getTitle());
	}

	@Test
	public void failGetFlashMobDetail() {
		FlashMobVO result = service.getFlashMobDetail(99999);
		assertNull(result);
	}

	// 기능4: 참가자인가
	@Test
	public void successIsFlashMobParticipant() {
		boolean result = service.isFlashParticipants("hyunjoo482", 1);
		assertTrue(result);
	}

	@Test
	public void failIsFlashMobParticipant() {
		boolean result = service.isFlashParticipants("없는아이디", 1);
		assertFalse(result);
	}

	// 기능5: 주최자인가
	@Test
	public void successIsFlashMobHost() {
		boolean result = service.isFlashMobHost("hyunjoo482", 1);
		assertTrue(result);
	}

	@Test
	public void failIsFlashMobHost() {
		boolean result = service.isFlashMobHost("다른아이디", 1);
		assertFalse(result);
	}

	// 기능6: 주최자 조회
	@Test
	public void successGetFlashMobHost() {
		UserInfoVO host = service.getFlashMobHost(1);
		assertNotNull(host);
		assertEquals("hyunjoo482", host.getUserId());
	}

	@Test
	public void failGetFlashMobHost() {
		UserInfoVO host = service.getFlashMobHost(999999);
		assertNull(host);
	}

	// 기능7: 참석자 조회
	@Test
	public void successGetFlashMobParticipants() {
		List<UserInfoVO> participants = service.getFlashMobParticipants("hyunjoo482", 1);
		assertTrue(participants != null && participants.size() > 0);
	}

	@Test
	public void failGetFlashMobParticipants() {
		List<UserInfoVO> participants = service.getFlashMobParticipants("hyunjoo482", 999999);
		assertTrue(participants.isEmpty());
	}

}

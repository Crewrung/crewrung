package test.com.crewrung.crew.service;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.crewrung.crew.dao.CrewDAO;
import com.crewrung.crew.service.CrewService;
import com.crewrung.crew.vo.CrewMeetingVO;
import com.crewrung.crew.vo.CrewMemberVO;
import com.crewrung.db.DBCP;

public class CrewServiceTest {
	private SqlSession session;
	private CrewDAO dao;
	private CrewService service;
	
	@Before
	public void setUp() throws Exception {
		session = DBCP.getSqlSessionFactory().openSession(false);
		dao = new CrewDAO(session);
		service = new CrewService(dao);
	}

	@After
	public void tearDown() throws Exception {
		if (session != null) {
			session.rollback(); // 테스트 끝나면 롤백
			session.close();
		}
	}

	//@Test
	public void successSetCrewMeetingService() {
	}

	//@Test
	public void successIsCrewLeaderService() {
		assertTrue(service.isCrewLeaderService(1,"seunghyun007"));
	}
	
	@Test
	public void successIsCrewMeetingHostService() {
		assertTrue(service.isCrewMeetingHostService(new CrewMeetingVO(1,1, 31)));
	}
}

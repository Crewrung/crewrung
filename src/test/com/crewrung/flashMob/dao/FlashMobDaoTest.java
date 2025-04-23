package test.com.crewrung.flashMob.dao;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.crewrung.db.DBCP;
import com.crewrung.flashMob.dao.FlashMobDAO;
import com.crewrung.flashMob.vo.FlashMobMainViewVO;

public class FlashMobDaoTest {
	 private SqlSession session;
	 private FlashMobDAO dao;

	 @Before
	 public void setUp() throws Exception {
	        
		 session = DBCP.getSqlSessionFactory().openSession(false);
		 dao = new FlashMobDAO(session);
	 }

	 @After
	 public void tearDown() throws Exception {
		 if (session != null) {
	        session.rollback(); // �뀒�뒪�듃 �걹�굹硫� 濡ㅻ갚
	        session.close();
	       }
	 }

	 @Test
	 public void getAllBoardCommentCreate() {
	   List<FlashMobMainViewVO> result = dao.getAllFlashMobs();
	   assertTrue(result.size() == 30);
	 }
	 
}

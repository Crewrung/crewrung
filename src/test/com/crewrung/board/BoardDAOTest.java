package test.com.crewrung.board;

import static org.junit.Assert.*;
import java.util.*;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.*;
import com.crewrung.db.DBCP;
import com.crewrung.board.dao.BoardDAO_Complete;

import com.crewrung.board.vo.*;

public class BoardDAOTest {
    private SqlSession session;
    private BoardDAO_Complete dao;

    @Before
    public void setUp() throws Exception {
        SqlSessionFactory factory = DBCP.getSqlSessionFactory();
        session = factory.openSession(false);
        dao = new BoardDAO_Complete(factory);
    }

    @After
    public void tearDown() throws Exception {
        if (session != null) {
            session.rollback();
            session.close();
        }
    }


    // from BoardCommentCreateDAOTest
        @Test
        public void successtestInsertComment() {
            BoardCommentCreateVO comment = new BoardCommentCreateVO(30, "seulbin59", "Test Comment");
            int result = dao.insertComment(comment);
            assertEquals(1, result);
        }

    // from BoardCommentCreateDAOTest
        @Test
        public void failtestInsertComment() {
            BoardCommentCreateVO comment = new BoardCommentCreateVO(30, "seusdfn54", "Test Comment");
            try{
               dao.insertComment(comment);
            }catch (Exception e) {
                System.out.println("¤Ë¼ÅÇä¤©¤· " + e.getMessage());
            }
        }

    // from BoardCommentCreateDAOTest
        @Test
        public void testGetAllComments1() {
            List<BoardCommentListVO> comments = dao.getAllComments();
            assertNotNull(comments);
        }

    // from BoardCommentDeleteDAOTest
        @Test
        public void testDeleteComment() {
            BoardCommentDeleteVO vo = new BoardCommentDeleteVO(1L, "seulbin59");
            int result = dao.deleteComment(vo);
            assertEquals(1, result);
        }

    // from BoardCommentListDAOTest
        @Test
        public void testGetAllComments() {
            assertNotNull(dao.getAllComments());
        }

    // from BoardCommentUpdateDAOTest
        @Test
        public void testUpdateComment() {
            BoardCommentUpdateVO vo = new BoardCommentUpdateVO(1L, "seulbin59", "asfwaefsd");
            int result = dao.updateComment(vo);
            assertEquals(1, result);
        }

    // from BoardCreateDAOTest
        @Test
        public void testInsertBoard() throws Exception {
            SqlSessionFactory factory = DBCP.getSqlSessionFactory();
            BoardCreateVO vo = new BoardCreateVO("jungwoo58", "sdfds", "sdfdsfdssd", new Date(), 0);
            int result = dao.insertBoard(vo);
            assertEquals(1, result);
            tearDown();
        }

    // from BoardDeleteDAOTest
        @Test
        public void testDeleteBoard() {
            BoardDeleteVO vo = new BoardDeleteVO(60L, "gimsubin94");
            int result = dao.deleteBoard(vo);
            assertEquals(1, result);
        }

    // from BoardDetailDAOTest
        @Test
        public void testGetBoardDetail() {
            assertNotNull(dao.getBoardDetail(1L));
        }

    // from BoardListDAOTest
        @Test
        public void testGetAllBoards() {
            assertNotNull(dao.getAllBoards());
        }

    // from BoardRecentDAOTest
        @Test
        public void testGetRecentBoards() {
            assertNotNull(dao.getRecentBoards());
        }

    // from BoardRecommendDAOTest
        @Test
        public void testRecommendBoard() {
            BoardRecommendVO vo = new BoardRecommendVO(1L);
            int result = dao.recommendBoard(vo);
            assertEquals(1, result);
        }

    // from BoardUpdateDAOTest
        @Test
        public void testUpdateBoard() throws Exception {
            BoardUpdateVO vo = new BoardUpdateVO(1L, "joosung88", "jhhgjg", "fgjhghj");
            int result = dao.updateBoard(vo);
            assertEquals(1, result);
            tearDown();
        }

    // from BoardViewIncrementDAOTest
        @Test
        public void testIncrementView() {
            BoardViewIncrementVO vo = new BoardViewIncrementVO(1L);
            int result = dao.incrementView(vo);
            assertEquals(1, result);
        }
}

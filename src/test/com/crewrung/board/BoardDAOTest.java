package test.com.crewrung.board;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.crewrung.board.dao.BoardDAO;
import com.crewrung.board.vo.BoardCommentListVO;
import com.crewrung.board.vo.BoardCommentVO;
import com.crewrung.board.vo.BoardDetailVO;
import com.crewrung.board.vo.BoardVO;
import com.crewrung.db.DBCP;

public class BoardDAOTest {
    private SqlSession session;
    private BoardDAO dao;

    @Before
    public void setUp() throws Exception {
        SqlSessionFactory factory = DBCP.getSqlSessionFactory();
        session = factory.openSession(false);
        dao = new BoardDAO(factory);
    }

    @After
    public void tearDown() throws Exception {
        if (session != null) {
            session.rollback();
            session.close();
        }
    }

    // 1) ��� ���� ����
    @Test
    public void testInsertCommentSuccess() {
        BoardCommentVO comment = new BoardCommentVO(30, "seulbin59", "Test Comment");
        int result = dao.insertComment(comment);
        assertEquals(1, result);
    }

    // 2) ��� ���� ���� (�������� �ʴ� ����� ��)
    @Test
    public void testInsertCommentFailure() {
        BoardCommentVO comment = new BoardCommentVO(30, "invalidUser", "Should Fail");
        try {
            dao.insertComment(comment);
            fail("Expected an exception on invalid commenter");
        } catch (Exception e) {
            // ���� �߻� ���
        }
    }

    // 3) ��� ��� ��ȸ
    @Test
    public void testGetAllComments() {
        List<BoardCommentListVO> comments = dao.getAllComments();
        assertNotNull(comments);
    }

    // 4) ��� ����
    @Test
    public void testDeleteComment() {
        BoardCommentVO vo = new BoardCommentVO(1L, "seulbin59");
        int result = dao.deleteComment(vo);
        assertEquals(1, result);
    }

    // 5) �Խñ� ����
    @Test
    public void testInsertBoard() {
        BoardDetailVO vo = new BoardDetailVO(
            "jungwoo58",
            "Sample Title",
            "Sample Content",
            new Date(),
            0
        );
        int result = dao.insertBoard(vo);
        assertEquals(1, result);
    }

    // 6) �Խñ� ����
    @Test
    public void testDeleteBoard() {
        BoardVO vo = new BoardVO(40L, "gimsubin94", "dsgfsaergedf");
        int result = dao.deleteBoard(vo);
        assertEquals(1, result);
    }

    // 7) �Խñ� �� ��ȸ
    @Test
    public void testGetBoardDetail() {
        BoardDetailVO detail = dao.getBoardDetail(1L);
        assertNotNull(detail);
    }

    // 8) ��ü �Խñ� ��ȸ
    @Test
    public void testGetAllBoards() {
        List<BoardVO> boards = dao.getAllBoards();
        assertNotNull(boards);
    }

    // 10) �Խñ� ����
    @Test
    public void testUpdateBoard() {
        BoardVO vo = new BoardVO(1L, "joosung88", "Updated Title", "Updated Content");
        int result = dao.updateBoard(vo);
        assertEquals(1, result);
    }

}


package com.crewrung.board.dao;

import com.crewrung.board.vo.BoardCommentCreateVO;
import com.crewrung.board.vo.BoardCommentDeleteVO;
import com.crewrung.board.vo.BoardCommentListVO;
import com.crewrung.board.vo.BoardCommentUpdateVO;
import com.crewrung.board.vo.BoardCreateVO;
import com.crewrung.board.vo.BoardDeleteVO;
import com.crewrung.board.vo.BoardDetailVO;
import com.crewrung.board.vo.BoardListVO;
import com.crewrung.board.vo.BoardRecentVO;
import com.crewrung.board.vo.BoardRecommendVO;
import com.crewrung.board.vo.BoardUpdateVO;
import com.crewrung.board.vo.BoardViewIncrementVO;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class BoardDAO_Complete {

    // from BoardCommentCreateDAO 1

        private SqlSessionFactory sqlSessionFactory;

        public BoardDAO_Complete(SqlSessionFactory sqlSessionFactory) {
            this.sqlSessionFactory = sqlSessionFactory;
        }


        public int insertComment(BoardCommentCreateVO comment) {
            try (SqlSession session = sqlSessionFactory.openSession()) {
                int result = session.insert("boardMapper.insertBoardComment", comment);
                return result;
            }
        }

        public List<BoardCommentCreateVO> getAllComments1() {
            try (SqlSession session = sqlSessionFactory.openSession()) {
                return session.selectList("boardMapper.getAllBoardCommentCreate");
            }
        }


    // from BoardCommentDeleteDAO 2

        public int deleteComment(BoardCommentDeleteVO vo) {
            try (SqlSession session = sqlSessionFactory.openSession()) {
                int result = session.delete("boardMapper.deleteComment", vo);
                return result;
            }
        }

    // from BoardCommentListDAO 3

        public List<BoardCommentListVO> getAllComments() {
            try (SqlSession session = sqlSessionFactory.openSession()) {
                return session.selectList("boardMapper.getAllComments");
            }
        }

    // from BoardCommentUpdateDAO 4

        public int updateComment(BoardCommentUpdateVO vo) {
            try (SqlSession session = sqlSessionFactory.openSession()) {
                int result = session.update("boardMapper.updateComment", vo);
                return result;
            }
        }

    // from BoardCreateDAO 5

        public int insertBoard(BoardCreateVO vo) {
            try (SqlSession session = sqlSessionFactory.openSession()) {
                int result = session.insert("boardMapper.insertBoard", vo);
                return result;
            }
        }

    // from BoardDeleteDAO 6

        public int deleteBoard(BoardDeleteVO vo) {
            try (SqlSession session = sqlSessionFactory.openSession()) {
                int result = session.delete("boardMapper.deleteBoard", vo);

                return result;
            }
        }

    // from BoardDetailDAO 7

        public BoardDetailVO getBoardDetail(Long boardNumber) {
            try (SqlSession session = sqlSessionFactory.openSession()) {
                return session.selectOne("boardMapper.getBoardDetail", boardNumber);
            }
        }

    // from BoardListDAO 8

        public List<BoardListVO> getAllBoards() {
            try (SqlSession session = sqlSessionFactory.openSession()) {
                return session.selectList("boardMapper.getAllBoards");
            }
        }

    // from BoardRecentDAO 9

        public List<BoardRecentVO> getRecentBoards() {
            try (SqlSession session = sqlSessionFactory.openSession()) {
                return session.selectList("boardMapper.getRecentBoards");
            }
        }

    // from BoardRecommendDAO 10

        public int recommendBoard(BoardRecommendVO vo) {
            try (SqlSession session = sqlSessionFactory.openSession()) {
                int result = session.update("boardMapper.recommendBoard", vo);
                return result;
            }
        }

    // from BoardUpdateDAO 11

        public int updateBoard(BoardUpdateVO vo) {
            try (SqlSession session = sqlSessionFactory.openSession()) {
                int result = session.update("boardMapper.updateBoard", vo);
                return result;
            }
        }

    // from BoardViewIncrementDAO 12

        public int incrementView(BoardViewIncrementVO vo) {
            try (SqlSession session = sqlSessionFactory.openSession()) {
                int result = session.update("boardMapper.incrementView", vo);
                return result;
            }
        }

}

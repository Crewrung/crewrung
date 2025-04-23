package com.crewrung.board.vo;

import java.util.Date;

public class BoardCommentListVO {
    private Long boardCommentNumber;
    private String boardComment;
    private Date commentDate;
    private String commenter;

    public BoardCommentListVO() {}

    public BoardCommentListVO(Long boardCommentNumber, String boardComment, Date commentDate, String commenter) {
		super();
		this.boardCommentNumber = boardCommentNumber;
		this.boardComment = boardComment;
		this.commentDate = commentDate;
		this.commenter = commenter;
	}

	public Long getBoardCommentNumber() { return boardCommentNumber; }
    public void setBoardCommentNumber(Long boardCommentNumber) { this.boardCommentNumber = boardCommentNumber; }

    public String getComment() { return boardComment; }
    public void setComment(String comment) { this.boardComment = comment; }

    public Date getCommentDate() { return commentDate; }
    public void setCommentDate(Date commentDate) { this.commentDate = commentDate; }

    public String getCommenter() { return commenter; }
    public void setCommenter(String commenter) { this.commenter = commenter; }

    @Override
    public String toString() {
        return "BoardCommentListVO{" +
               "boardCommentNumber=" + boardCommentNumber + ", " +
               "comment='" + boardComment + "', " +
               "commentDate=" + commentDate + ", " +
               "commenter='" + commenter + "'" +
               "}";
    }
}

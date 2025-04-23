package com.crewrung.board.vo;

public class BoardCommentCreateVO {
    private long boardNumber;
    private String currentUser;
    private String commentText;

    public BoardCommentCreateVO() {}

    public BoardCommentCreateVO(int boardNumber, String currentUser, String commentText) {
		super();
		this.boardNumber = boardNumber;
		this.currentUser = currentUser;
		this.commentText = commentText;
	}

	public long getBoardNumber() { return boardNumber; }
    public void setBoardNumber(int i) { this.boardNumber = i; }

    public String getCurrentUser() { return currentUser; }
    public void setCurrentUser(String currentUser) { this.currentUser = currentUser; }

    public String getCommentText() { return commentText; }
    public void setCommentText(String commentText) { this.commentText = commentText; }

    @Override
    public String toString() {
        return "BoardCommentCreateVO{" +
               "boardNumber=" + boardNumber + ", " +
               "currentUser='" + currentUser + "', " +
               "commentText='" + commentText + "'" +
               "}";
    }
}

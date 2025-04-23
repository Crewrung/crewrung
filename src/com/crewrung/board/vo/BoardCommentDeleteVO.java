package com.crewrung.board.vo;

public class BoardCommentDeleteVO {
    private Long commentNumber;
    private String currentUser;

    public BoardCommentDeleteVO() {}

    
    
    public BoardCommentDeleteVO(Long commentNumber, String currentUser) {
		super();
		this.commentNumber = commentNumber;
		this.currentUser = currentUser;
	}



	public Long getCommentNumber() { return commentNumber; }
    public void setCommentNumber(Long commentNumber) { this.commentNumber = commentNumber; }

    public String getCurrentUser() { return currentUser; }
    public void setCurrentUser(String currentUser) { this.currentUser = currentUser; }

    @Override
    public String toString() {
        return "BoardCommentDeleteVO{" +
               "commentNumber=" + commentNumber + ", " +
               "currentUser='" + currentUser + "'" +
               "}";
    }
}

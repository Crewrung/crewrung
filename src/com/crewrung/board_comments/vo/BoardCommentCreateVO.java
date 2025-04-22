package com.crewrung.board_comments.vo;

public class BoardCommentCreateVO {
    private Long boardNumber;
    private String currentUser;
    private String commentText;

    public BoardCommentCreateVO() {}

    public Long getBoardNumber() { return boardNumber; }
    public void setBoardNumber(Long boardNumber) { this.boardNumber = boardNumber; }

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

package com.crewrung.board_comments.vo;

public class BoardCommentUpdateVO {
    private Long commentNumber;
    private String currentUser;
    private String newComment;

    public BoardCommentUpdateVO() {}

    public Long getCommentNumber() { return commentNumber; }
    public void setCommentNumber(Long commentNumber) { this.commentNumber = commentNumber; }

    public String getCurrentUser() { return currentUser; }
    public void setCurrentUser(String currentUser) { this.currentUser = currentUser; }

    public String getNewComment() { return newComment; }
    public void setNewComment(String newComment) { this.newComment = newComment; }

    @Override
    public String toString() {
        return "BoardCommentUpdateVO{" +
               "commentNumber=" + commentNumber + ", " +
               "currentUser='" + currentUser + "', " +
               "newComment='" + newComment + "'" +
               "}";
    }
}

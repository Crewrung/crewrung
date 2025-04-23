package com.crewrung.board.vo;

public class BoardUpdateVO {
    private Long boardNumber;
    private String currentUser;
    private String newTitle;
    private String newContent;

    public BoardUpdateVO() {}
    
    

    public BoardUpdateVO(Long boardNumber, String currentUser, String newTitle, String newContent) {
		super();
		this.boardNumber = boardNumber;
		this.currentUser = currentUser;
		this.newTitle = newTitle;
		this.newContent = newContent;
	}



	public Long getBoardNumber() { return boardNumber; }
    public void setBoardNumber(Long boardNumber) { this.boardNumber = boardNumber; }

    public String getCurrentUser() { return currentUser; }
    public void setCurrentUser(String currentUser) { this.currentUser = currentUser; }

    public String getNewTitle() { return newTitle; }
    public void setNewTitle(String newTitle) { this.newTitle = newTitle; }

    public String getNewContent() { return newContent; }
    public void setNewContent(String newContent) { this.newContent = newContent; }

    @Override
    public String toString() {
        return "BoardUpdateVO{" +
               "boardNumber=" + boardNumber + ", " +
               "currentUser='" + currentUser + "', " +
               "newTitle='" + newTitle + "', " +
               "newContent='" + newContent + "'" +
               "}";
    }
}

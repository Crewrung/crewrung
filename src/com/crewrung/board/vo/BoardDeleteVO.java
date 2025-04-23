package com.crewrung.board.vo;

public class BoardDeleteVO {
    private Long boardNumber;
    private String currentUser;

    public BoardDeleteVO() {}

    
    
    public BoardDeleteVO(Long boardNumber, String currentUser) {
		super();
		this.boardNumber = boardNumber;
		this.currentUser = currentUser;
	}



	public Long getBoardNumber() { return boardNumber; }
    public void setBoardNumber(Long boardNumber) { this.boardNumber = boardNumber; }

    public String getCurrentUser() { return currentUser; }
    public void setCurrentUser(String currentUser) { this.currentUser = currentUser; }

    @Override
    public String toString() {
        return "BoardDeleteVO{" +
               "boardNumber=" + boardNumber + ", " +
               "currentUser='" + currentUser + "'" +
               "}";
    }
}

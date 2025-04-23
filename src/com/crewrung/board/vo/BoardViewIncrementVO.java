package com.crewrung.board.vo;

public class BoardViewIncrementVO {
    private Long boardNumber;

    public BoardViewIncrementVO() {}

   
    public BoardViewIncrementVO(Long boardNumber) {
		super();
		this.boardNumber = boardNumber;
	}

	public Long getBoardNumber() { return boardNumber; }
    public void setBoardNumber(Long boardNumber) { this.boardNumber = boardNumber; } 

    @Override
    public String toString() {
        return "BoardViewIncrementVO{" +
               "boardNumber=" + boardNumber +
               "}";
    }
}

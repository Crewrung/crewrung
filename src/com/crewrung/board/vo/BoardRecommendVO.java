package com.crewrung.board.vo;

public class BoardRecommendVO {
    private Long boardNumber;

    public BoardRecommendVO() {}

    
    
    public BoardRecommendVO(Long boardNumber) {
		super();
		this.boardNumber = boardNumber;
	}



	public Long getBoardNumber() { return boardNumber; }
    public void setBoardNumber(Long boardNumber) { this.boardNumber = boardNumber; }

    @Override
    public String toString() {
        return "BoardRecommendVO{" +
               "boardNumber=" + boardNumber +
               "}";
    }
}

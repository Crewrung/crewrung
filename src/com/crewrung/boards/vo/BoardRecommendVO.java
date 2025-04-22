package com.crewrung.boards.vo;

public class BoardRecommendVO {
    private Long boardNumber;

    public BoardRecommendVO() {}

    public Long getBoardNumber() { return boardNumber; }
    public void setBoardNumber(Long boardNumber) { this.boardNumber = boardNumber; }

    @Override
    public String toString() {
        return "BoardRecommendVO{" +
               "boardNumber=" + boardNumber +
               "}";
    }
}

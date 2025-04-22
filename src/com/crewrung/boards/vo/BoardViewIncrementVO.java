package com.crewrung.boards.vo;

public class BoardViewIncrementVO {
    private Long boardNumber;

    public BoardViewIncrementVO() {}

    public Long getBoardNumber() { return boardNumber; }
    public void setBoardNumber(Long boardNumber) { this.boardNumber = boardNumber; } 

    @Override
    public String toString() {
        return "BoardViewIncrementVO{" +
               "boardNumber=" + boardNumber +
               "}";
    }
}

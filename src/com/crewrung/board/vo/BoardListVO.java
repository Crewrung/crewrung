package com.crewrung.board.vo;

import java.util.Date;

public class BoardListVO {
    private Long boardNumber;
    private String writerId;
    private String title;
    private String content;
    private Date writingDate;
    private Integer viewCount;

    public BoardListVO() {}

    
    
    public BoardListVO(Long boardNumber, String writerId, String title, String content, Date writingDate,
			Integer viewCount) {
		super();
		this.boardNumber = boardNumber;
		this.writerId = writerId;
		this.title = title;
		this.content = content;
		this.writingDate = writingDate;
		this.viewCount = viewCount;
	}



	public Long getBoardNumber() { return boardNumber; }
    public void setBoardNumber(Long boardNumber) { this.boardNumber = boardNumber; }

    public String getWriterId() { return writerId; }
    public void setWriterId(String writerId) { this.writerId = writerId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public Date getWritingDate() { return writingDate; }
    public void setWritingDate(Date writingDate) { this.writingDate = writingDate; }

    public Integer getViewCount() { return viewCount; }
    public void setViewCount(Integer viewCount) { this.viewCount = viewCount; }

    @Override
    public String toString() {
        return "BoardListVO{" +
               "boardNumber=" + boardNumber + ", " +
               "writerId='" + writerId + "', " +
               "title='" + title + "', " +
               "content='" + content + "', " +
               "writingDate=" + writingDate + ", " +
               "viewCount=" + viewCount +
               "}";
    }
}

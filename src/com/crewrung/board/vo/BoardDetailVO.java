package com.crewrung.board.vo;

import java.util.Date;

public class BoardDetailVO {
    private Long boardNumber;
    private String title;
    private String content;
    private Date writingDate;
    private Integer viewCount;
    private String writer;

    public BoardDetailVO() {}

    
    
    public BoardDetailVO(Long boardNumber, String title, String content, Date writingDate, Integer viewCount,
			String writer) {
		super();
		this.boardNumber = boardNumber;
		this.title = title;
		this.content = content;
		this.writingDate = writingDate;
		this.viewCount = viewCount;
		this.writer = writer;
	}



	public Long getBoardNumber() { return boardNumber; }
    public void setBoardNumber(Long boardNumber) { this.boardNumber = boardNumber; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public Date getWritingDate() { return writingDate; }
    public void setWritingDate(Date writingDate) { this.writingDate = writingDate; }

    public Integer getViewCount() { return viewCount; }
    public void setViewCount(Integer viewCount) { this.viewCount = viewCount; }

    public String getWriter() { return writer; }
    public void setWriter(String writer) { this.writer = writer; }

    @Override
    public String toString() {
        return "BoardDetailVO{" +
               "boardNumber=" + boardNumber + ", " +
               "title='" + title + "', " +
               "content='" + content + "', " +
               "writingDate=" + writingDate + ", " +
               "viewCount=" + viewCount + ", " +
               "writer='" + writer + "'" +
               "}";
    }
}

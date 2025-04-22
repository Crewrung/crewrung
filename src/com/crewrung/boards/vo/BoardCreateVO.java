package com.crewrung.boards.vo;

import java.util.Date;

public class BoardCreateVO {
    private String writerId;
    private String title;
    private String content;
    private Date writingDate;
    private Integer viewCount;

    public BoardCreateVO() {}

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
        return "BoardCreateVO{" +
               "writerId='" + writerId + "', " +
               "title='" + title + "', " +
               "content='" + content + "', " +
               "writingDate=" + writingDate + ", " +
               "viewCount=" + viewCount +
               "}";
    }
}

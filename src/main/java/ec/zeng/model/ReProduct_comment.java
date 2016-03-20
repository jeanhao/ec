package ec.zeng.model;

import java.util.Date;

public class ReProduct_comment {
    private Integer id;

    private String content;

    private Date date;

    private Integer procommentId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getProcommentId() {
        return procommentId;
    }

    public void setProcommentId(Integer procommentId) {
        this.procommentId = procommentId;
    }
}
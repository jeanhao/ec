package ec.zeng.model;

import java.util.Date;

public class System_reply_message {
    private Integer id;

    private String content;

    private Date date;

    private String sayer;

    private Integer sysmessageId;

    private Integer systemMessageId;

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

    public String getSayer() {
        return sayer;
    }

    public void setSayer(String sayer) {
        this.sayer = sayer == null ? null : sayer.trim();
    }

    public Integer getSysmessageId() {
        return sysmessageId;
    }

    public void setSysmessageId(Integer sysmessageId) {
        this.sysmessageId = sysmessageId;
    }

    public Integer getSystemMessageId() {
        return systemMessageId;
    }

    public void setSystemMessageId(Integer systemMessageId) {
        this.systemMessageId = systemMessageId;
    }
}
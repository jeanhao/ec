package ec.zeng.model;

import java.util.Date;

public class Seller_reply_message {
    private Integer id;

    private String content;

    private Date date;

    private String sayer;

    private Integer sellermessageId;

    private Integer sellerMessageId;

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

    public Integer getSellermessageId() {
        return sellermessageId;
    }

    public void setSellermessageId(Integer sellermessageId) {
        this.sellermessageId = sellermessageId;
    }

    public Integer getSellerMessageId() {
        return sellerMessageId;
    }

    public void setSellerMessageId(Integer sellerMessageId) {
        this.sellerMessageId = sellerMessageId;
    }
}
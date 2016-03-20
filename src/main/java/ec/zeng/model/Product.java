package ec.zeng.model;

import java.util.Date;

public class Product {
    private Integer id;

    private Integer attendnum;

    private String brand;

    private Integer commentnum;

    private String headimg;

    private String introduction;

    private Integer isidle;

    private String name;

    private Date releasedate;

    private Integer categoryId;

    private Integer sellerId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAttendnum() {
        return attendnum;
    }

    public void setAttendnum(Integer attendnum) {
        this.attendnum = attendnum;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public Integer getCommentnum() {
        return commentnum;
    }

    public void setCommentnum(Integer commentnum) {
        this.commentnum = commentnum;
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg == null ? null : headimg.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public Integer getIsidle() {
        return isidle;
    }

    public void setIsidle(Integer isidle) {
        this.isidle = isidle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(Date releasedate) {
        this.releasedate = releasedate;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }
}
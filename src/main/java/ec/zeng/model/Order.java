package ec.zeng.model;

import java.util.Date;

public class Order {
    private Integer id;

    private Integer ifpay;

    private Integer ifsent;

    private Date orderdatetime;

    private String postway;

    private Integer quantity;

    private Double totalprice;

    private Integer productId;

    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIfpay() {
        return ifpay;
    }

    public void setIfpay(Integer ifpay) {
        this.ifpay = ifpay;
    }

    public Integer getIfsent() {
        return ifsent;
    }

    public void setIfsent(Integer ifsent) {
        this.ifsent = ifsent;
    }

    public Date getOrderdatetime() {
        return orderdatetime;
    }

    public void setOrderdatetime(Date orderdatetime) {
        this.orderdatetime = orderdatetime;
    }

    public String getPostway() {
        return postway;
    }

    public void setPostway(String postway) {
        this.postway = postway == null ? null : postway.trim();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Double totalprice) {
        this.totalprice = totalprice;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
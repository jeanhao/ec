package ec.zeng.model;

public class License {
    private Integer id;

    private String busscert;

    private String idcard;

    private Integer isdeleted;

    private String organcert;

    private String taxcert;

    private Integer sellerId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBusscert() {
        return busscert;
    }

    public void setBusscert(String busscert) {
        this.busscert = busscert == null ? null : busscert.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public Integer getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Integer isdeleted) {
        this.isdeleted = isdeleted;
    }

    public String getOrgancert() {
        return organcert;
    }

    public void setOrgancert(String organcert) {
        this.organcert = organcert == null ? null : organcert.trim();
    }

    public String getTaxcert() {
        return taxcert;
    }

    public void setTaxcert(String taxcert) {
        this.taxcert = taxcert == null ? null : taxcert.trim();
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }
}
package ec.zeng.model;

public class Specs_amount {
    private Integer id;

    private Double amount;

    private Double prize;

    private String specs;

    private Integer productId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getPrize() {
        return prize;
    }

    public void setPrize(Double prize) {
        this.prize = prize;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs == null ? null : specs.trim();
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}
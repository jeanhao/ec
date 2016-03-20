package ec.zeng.model;

public class Attribute_value {
    private Integer id;

    private String value;

    private Integer attrnameId;

    private Integer productId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public Integer getAttrnameId() {
        return attrnameId;
    }

    public void setAttrnameId(Integer attrnameId) {
        this.attrnameId = attrnameId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}
package ec.zeng.model;

public class Seller {
    private Integer id;

    private String address;

    private Integer attendnum;

    private String cwebsite;

    private String detailinfo;

    private String email;

    private String fax;

    private String headimg;

    private String identity;

    private Integer isaudit;

    private String mainindustry;

    private String name;

    private String phonenum;

    private String postcode;

    private String profile;

    private String reginfo;

    private Integer cityId;

    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getAttendnum() {
        return attendnum;
    }

    public void setAttendnum(Integer attendnum) {
        this.attendnum = attendnum;
    }

    public String getCwebsite() {
        return cwebsite;
    }

    public void setCwebsite(String cwebsite) {
        this.cwebsite = cwebsite == null ? null : cwebsite.trim();
    }

    public String getDetailinfo() {
        return detailinfo;
    }

    public void setDetailinfo(String detailinfo) {
        this.detailinfo = detailinfo == null ? null : detailinfo.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg == null ? null : headimg.trim();
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity == null ? null : identity.trim();
    }

    public Integer getIsaudit() {
        return isaudit;
    }

    public void setIsaudit(Integer isaudit) {
        this.isaudit = isaudit;
    }

    public String getMainindustry() {
        return mainindustry;
    }

    public void setMainindustry(String mainindustry) {
        this.mainindustry = mainindustry == null ? null : mainindustry.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum == null ? null : phonenum.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile == null ? null : profile.trim();
    }

    public String getReginfo() {
        return reginfo;
    }

    public void setReginfo(String reginfo) {
        this.reginfo = reginfo == null ? null : reginfo.trim();
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
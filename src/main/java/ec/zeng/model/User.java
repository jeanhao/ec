package ec.zeng.model;

import java.util.Date;

public class User {
    private Integer id;

    private Date date;

    private String email;

    private String gender;

    private String headimg;

    private Integer isemailactived;

    private String name;

    private String password;

    private String secanswer1;

    private String secanswer2;

    private String secquestion1;

    private String secquestion2;

    private String username;

    private String usertype;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg == null ? null : headimg.trim();
    }

    public Integer getIsemailactived() {
        return isemailactived;
    }

    public void setIsemailactived(Integer isemailactived) {
        this.isemailactived = isemailactived;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSecanswer1() {
        return secanswer1;
    }

    public void setSecanswer1(String secanswer1) {
        this.secanswer1 = secanswer1 == null ? null : secanswer1.trim();
    }

    public String getSecanswer2() {
        return secanswer2;
    }

    public void setSecanswer2(String secanswer2) {
        this.secanswer2 = secanswer2 == null ? null : secanswer2.trim();
    }

    public String getSecquestion1() {
        return secquestion1;
    }

    public void setSecquestion1(String secquestion1) {
        this.secquestion1 = secquestion1 == null ? null : secquestion1.trim();
    }

    public String getSecquestion2() {
        return secquestion2;
    }

    public void setSecquestion2(String secquestion2) {
        this.secquestion2 = secquestion2 == null ? null : secquestion2.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype == null ? null : usertype.trim();
    }
}
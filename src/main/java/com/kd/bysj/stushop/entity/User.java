package com.kd.bysj.stushop.entity;


import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    @NotEmpty(message = "不能为空")
    private Integer id;

    private String userCode;

    private String userName;

    private String userPwd;

    private String userTel;

    private String userEmail;

    private String userSex;

    private Date userRegtime;

    private Integer userAddrid;

    private Integer identify;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel == null ? null : userTel.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public Date getUserRegtime() {
        return userRegtime;
    }

    public void setUserRegtime(Date userRegtime) {
        this.userRegtime = userRegtime;
    }

    public Integer getUserAddrid() {
        return userAddrid;
    }

    public void setUserAddrid(Integer userAddrid) {
        this.userAddrid = userAddrid;
    }

    public Integer getIdentify() {
        return identify;
    }

    public void setIdentify(Integer identify) {
        this.identify = identify;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userCodel=").append(userCode);
        sb.append(", userName=").append(userName);
        sb.append(", userPwd=").append(userPwd);
        sb.append(", userTel=").append(userTel);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", userSex=").append(userSex);
        sb.append(", userRegtime=").append(userRegtime);
        sb.append(", userAddrid=").append(userAddrid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", identify=").append(identify);
        sb.append("]");
        return sb.toString();
    }
}
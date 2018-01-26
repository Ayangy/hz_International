package com.yuwubao.hz_International.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yangyu on 2018/1/25.
 * 系统管理
 */
@Entity
@Table(name = "sys_config")
public class SysConfigEntity {

    /**
     * 主键、自增长
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 登录账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String password;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * banner展示图片url
     */
    private String bannerUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }
}

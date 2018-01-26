package com.yuwubao.hz_International.entities;

import javax.persistence.*;

/**
 * Created by yangyu on 2018/1/25.
 * 商家
 */
@Entity
@Table(name = "store")
public class StoreEntity {

    /**
     * 主键、自增长
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    /**
     * 商家名称
     */
    private String name;

    /**
     * 店铺对应的会员ID
     */
    private int consumerId;

    /**
     * 店铺地址
     */
    private String address;

    /**
     * 店铺联系电话
     */
    private String phone;

    /**
     * 店铺头像url
     */
    private String photoUrl;

    /**
     * 收款二维码url
     */
    private String qrUrl;

    /**
     * 商家详情
     */
    private String detail;

    /**
     * 支付账号
     */
    private String zhifuAccount;

    /**
     * 支付类型：0: 支付宝；1，微信
     */
    private int zhifuType;

    /**
     * 客服电话
     */
    private String customerServicePhone;

    /**
     * 展示图url1
     */
    private String imageUrl1;

    /**
     * 展示图url2
     */
    private String imageUrl2;

    /**
     * 展示图url3
     */
    private String imageUrl3;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(int consumerId) {
        this.consumerId = consumerId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getQrUrl() {
        return qrUrl;
    }

    public void setQrUrl(String qrUrl) {
        this.qrUrl = qrUrl;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getZhifuAccount() {
        return zhifuAccount;
    }

    public void setZhifuAccount(String zhifuAccount) {
        this.zhifuAccount = zhifuAccount;
    }

    public int getZhifuType() {
        return zhifuType;
    }

    public void setZhifuType(int zhifuType) {
        this.zhifuType = zhifuType;
    }

    public String getCustomerServicePhone() {
        return customerServicePhone;
    }

    public void setCustomerServicePhone(String customerServicePhone) {
        this.customerServicePhone = customerServicePhone;
    }

    public String getImageUrl1() {
        return imageUrl1;
    }

    public void setImageUrl1(String imageUrl1) {
        this.imageUrl1 = imageUrl1;
    }

    public String getImageUrl2() {
        return imageUrl2;
    }

    public void setImageUrl2(String imageUrl2) {
        this.imageUrl2 = imageUrl2;
    }

    public String getImageUrl3() {
        return imageUrl3;
    }

    public void setImageUrl3(String imageUrl3) {
        this.imageUrl3 = imageUrl3;
    }
}

package com.yuwubao.hz_International.entities.vo;

import java.math.BigDecimal;

/**
 * Created by yangyu on 2018/1/26.
 */
public class BackstageRechargeVo {

    /**
     * 会员昵称
     */
    private String phone;

    /**
     * 充值金额
     */
    private BigDecimal rechargeMoney;

    /**
     * 赠送积分
     */
    private int bonous;

    /**
     * 支付方式 0(支付宝),1(微信)
     */
    private int type;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public BigDecimal getRechargeMoney() {
        return rechargeMoney;
    }

    public void setRechargeMoney(BigDecimal rechargeMoney) {
        this.rechargeMoney = rechargeMoney;
    }

    public int getBonous() {
        return bonous;
    }

    public void setBonous(int bonous) {
        this.bonous = bonous;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}

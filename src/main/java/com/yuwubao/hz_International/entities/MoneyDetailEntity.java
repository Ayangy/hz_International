package com.yuwubao.hz_International.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by yangyu on 2018/1/25.
 * 消费金记录
 */
@Entity
@Table(name = "money_detail")
public class MoneyDetailEntity {

    /**
     * 主键、自增长
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    /**
     * 会员ID
     */
    private int consumerId;

    /**
     * 收款来源
     */
    private int fromConsumerId;

    /**
     * 生成时间
     */
    private Date createTime;

    /**
     * 金额
     */
    private BigDecimal money;

    /**
     * 0: 失败；1: 成功
     */
    private int status;

    /**
     * 账号
     */
    private String account;

    /**
     * 支付方式，0:支付宝 ；1:现金；2:微信
     */
    private int payType;

    /**
     * 充值积分
     */
    private int bonouse;

    /**
     * 0: 充值；1:消费；2: 兑换积分; 3: 收款
     */
    private int type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(int consumerId) {
        this.consumerId = consumerId;
    }

    public int getFromConsumerId() {
        return fromConsumerId;
    }

    public void setFromConsumerId(int fromConsumerId) {
        this.fromConsumerId = fromConsumerId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getPayType() {
        return payType;
    }

    public void setPayType(int payType) {
        this.payType = payType;
    }

    public int getBonouse() {
        return bonouse;
    }

    public void setBonouse(int bonouse) {
        this.bonouse = bonouse;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}

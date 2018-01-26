package com.yuwubao.hz_International.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by yangyu on 2018/1/25.
 * 礼券记录
 */
@Entity
@Table(name = "gift_detail")
public class GiftDetailEntity {

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
     * 生成时间
     */
    private Date createTime;

    /**
     * 礼券金额
     */
    private BigDecimal money;

    /**
     * 类型：0: 积分兑换；1: 邀请好友
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}

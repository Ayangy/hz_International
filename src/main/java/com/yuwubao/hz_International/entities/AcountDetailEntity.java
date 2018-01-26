package com.yuwubao.hz_International.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by yangyu on 2018/1/25.
 * 账户记录
 */
@Entity
@Table(name = "acount_detail")
public class AcountDetailEntity {

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
     * 操作后的消费金
     */
    private BigDecimal currentMoney;

    /**
     * 操作后福利金
     */
    private BigDecimal currentWelfare;

    /**
     * 操作后积分
     */
    private int currentBonous;

    /**
     * 操作后的礼券
     */
    private BigDecimal currentGift;

    /**
     * 操作类型：0:消费金；1:福利金；2:积分；3:礼券
     */
    private int type;

    /**
     *详情id
     */
    private int detailId;

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

    public BigDecimal getCurrentMoney() {
        return currentMoney;
    }

    public void setCurrentMoney(BigDecimal currentMoney) {
        this.currentMoney = currentMoney;
    }

    public BigDecimal getCurrentWelfare() {
        return currentWelfare;
    }

    public void setCurrentWelfare(BigDecimal currentWelfare) {
        this.currentWelfare = currentWelfare;
    }

    public int getCurrentBonous() {
        return currentBonous;
    }

    public void setCurrentBonous(int currentBonous) {
        this.currentBonous = currentBonous;
    }

    public BigDecimal getCurrentGift() {
        return currentGift;
    }

    public void setCurrentGift(BigDecimal currentGift) {
        this.currentGift = currentGift;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getDetailId() {
        return detailId;
    }

    public void setDetailId(int detailId) {
        this.detailId = detailId;
    }
}

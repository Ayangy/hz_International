package com.yuwubao.hz_International.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yangyu on 2018/1/25.
 * 积分记录
 */
@Entity
@Table(name = "bonous_detail")
public class BonousDetailEntity {

    /**
     * 主键、自增长
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    /**
     * 操作来源id
     */
    private int controlId;

    /**
     * 会员ID
     */
    private int consumerId;

    /**
     * 生成时间
     */
    private Date createTime;

    /**
     * 积分
     */
    private int bonous;

    /**
     * 0:充值积分；1: 兑换礼券，2: 消费金兑换
     */
    private int type ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getControlId() {
        return controlId;
    }

    public void setControlId(int controlId) {
        this.controlId = controlId;
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

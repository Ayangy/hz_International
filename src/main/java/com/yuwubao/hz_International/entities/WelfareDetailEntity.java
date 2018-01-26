package com.yuwubao.hz_International.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by yangyu on 2018/1/25.
 * 福利金记录
 */
@Entity
@Table(name = "welfare_detail")
public class WelfareDetailEntity {

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
     * 福利金额
     */
    private BigDecimal money;

    /**
     * 类型：0: 消费金转入；1:系统自动结转递增， 2：转出到消费金
     */
    private int type;

    /**
     * 生成时间
     */
    private Date createTime;

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

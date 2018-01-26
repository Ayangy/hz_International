package com.yuwubao.hz_International.entities;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by yangyu on 2018/1/25.
 * 消费金充值配置
 */
@Entity
@Table(name = "recharge_config")
public class RechargeConfigEntity {

    /**
     * 主键、自增长
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    /**
     * 消费金额
     */
    private int money;

    /**
     * 积分
     */
    private int bonous;

    /**
     * 最小起充金额
     */
    private BigDecimal minRechargeMoney;

    /**
     * 提示
     */
    private String tip;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getBonous() {
        return bonous;
    }

    public void setBonous(int bonous) {
        this.bonous = bonous;
    }

    public BigDecimal getMinRechargeMoney() {
        return minRechargeMoney;
    }

    public void setMinRechargeMoney(BigDecimal minRechargeMoney) {
        this.minRechargeMoney = minRechargeMoney;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}

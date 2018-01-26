package com.yuwubao.hz_International.entities;

import javax.persistence.*;

/**
 * Created by yangyu on 2018/1/25.
 * 福利金配置
 */
@Entity
@Table(name = "welfare_config")
public class WelfareConfigEntity {

    /**
     * 主键、自增长
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    /**
     * 日利率
     */
    private Float dayRatel;

    /**
     * 用户可提取比例
     */
    private Float maxRate;

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

    public Float getDayRatel() {
        return dayRatel;
    }

    public void setDayRatel(Float dayRatel) {
        this.dayRatel = dayRatel;
    }

    public Float getMaxRate() {
        return maxRate;
    }

    public void setMaxRate(Float maxRate) {
        this.maxRate = maxRate;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}

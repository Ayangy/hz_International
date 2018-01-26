package com.yuwubao.hz_International.entities;

import javax.persistence.*;

/**
 * Created by yangyu on 2018/1/25.
 * 礼券配置
 */
@Entity
@Table(name = "gift_config")
public class GiftConfigEntity {

    /**
     * 主键、自增长
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    /**
     * 兑换礼券
     */
    private int glft;

    /**
     * 消费积分
     */
    private int bonous;

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

    public int getGlft() {
        return glft;
    }

    public void setGlft(int glft) {
        this.glft = glft;
    }

    public int getBonous() {
        return bonous;
    }

    public void setBonous(int bonous) {
        this.bonous = bonous;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}

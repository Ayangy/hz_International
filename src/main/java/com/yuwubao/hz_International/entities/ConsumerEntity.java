package com.yuwubao.hz_International.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by yangyu on 2018/1/25.
 * 会员
 */
@Entity
@Table(name = "consumer")
public class ConsumerEntity {

    /**
     * 主键、自增长
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    /**
     * 是否是店铺0(会员),1(商家)
     */
    private int isStore;

    /**
     * 会员名称
     */
    private String name;

    /**
     * 会员年龄
     */
    private int age;

    /**
     * 性别(0:女；1：男；其他：未知)
     */
    private int sex;

    /**
     * 注册手机号码
     */
    private String phone;

    /**
     * 登陆密码
     */
    private String password;

    /**
     * 注册时间
     */
    private Date createTime;

    /**
     * 邀请人手机号码
     */
    private String invitePhone;

    /**
     * 消费金
     */
    private BigDecimal money;

    /**
     * 福利金
     */
    private BigDecimal welfareMoney;

    /**
     * 福利金昨日收益
     */
    private BigDecimal welfareYesterdayMoney;

    /**
     * 福利金总收益
     */
    private BigDecimal welfareProfitMoney;

    /**
     * 积分
     */
    private int bonous;

    /**
     * 礼券
     */
    private BigDecimal giftMoney;

    /**
     * 充值积分配置id
     */
    private int rechargeConfigId;

    /**
     * 礼券兑换配置id
     */
    private int giftConfigId;

    /**
     * 福利金配置Id
     */
    private int welfareConfigId;

    /**
     *消费金-积分兑换比例
     */
    private Float moneyBonouseConvertRate;

    /**
     *积分礼券兑换比例
     */
    private Float bonouseWelfareConvertRate;

    /**
     * 好友邀请比例
     */
    private int inviteFriendRate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIsStore() {
        return isStore;
    }

    public void setIsStore(int isStore) {
        this.isStore = isStore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getInvitePhone() {
        return invitePhone;
    }

    public void setInvitePhone(String invitePhone) {
        this.invitePhone = invitePhone;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getWelfareMoney() {
        return welfareMoney;
    }

    public void setWelfareMoney(BigDecimal welfareMoney) {
        this.welfareMoney = welfareMoney;
    }

    public BigDecimal getWelfareYesterdayMoney() {
        return welfareYesterdayMoney;
    }

    public void setWelfareYesterdayMoney(BigDecimal welfareYesterdayMoney) {
        this.welfareYesterdayMoney = welfareYesterdayMoney;
    }

    public BigDecimal getWelfareProfitMoney() {
        return welfareProfitMoney;
    }

    public void setWelfareProfitMoney(BigDecimal welfareProfitMoney) {
        this.welfareProfitMoney = welfareProfitMoney;
    }

    public int getBonous() {
        return bonous;
    }

    public void setBonous(int bonous) {
        this.bonous = bonous;
    }

    public BigDecimal getGiftMoney() {
        return giftMoney;
    }

    public void setGiftMoney(BigDecimal giftMoney) {
        this.giftMoney = giftMoney;
    }

    public int getRechargeConfigId() {
        return rechargeConfigId;
    }

    public void setRechargeConfigId(int rechargeConfigId) {
        this.rechargeConfigId = rechargeConfigId;
    }

    public int getGiftConfigId() {
        return giftConfigId;
    }

    public void setGiftConfigId(int giftConfigId) {
        this.giftConfigId = giftConfigId;
    }

    public int getWelfareConfigId() {
        return welfareConfigId;
    }

    public void setWelfareConfigId(int welfareConfigId) {
        this.welfareConfigId = welfareConfigId;
    }

    public Float getMoneyBonouseConvertRate() {
        return moneyBonouseConvertRate;
    }

    public void setMoneyBonouseConvertRate(Float moneyBonouseConvertRate) {
        this.moneyBonouseConvertRate = moneyBonouseConvertRate;
    }

    public Float getBonouseWelfareConvertRate() {
        return bonouseWelfareConvertRate;
    }

    public void setBonouseWelfareConvertRate(Float bonouseWelfareConvertRate) {
        this.bonouseWelfareConvertRate = bonouseWelfareConvertRate;
    }

    public int getInviteFriendRate() {
        return inviteFriendRate;
    }

    public void setInviteFriendRate(int inviteFriendRate) {
        this.inviteFriendRate = inviteFriendRate;
    }
}

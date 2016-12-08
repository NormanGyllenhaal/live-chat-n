package com.rcplatform.livechat.model;



import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "rc_pay_stat_day")

public class PayStatDay implements Serializable {


    @Id
    private Integer id;

    /**
     * 每日购买金币数
     */
    @Column(name = "gold_num")

    private BigDecimal goldNum;

    /**
     * 每日购买金额
     */

    private BigDecimal money;

    /**
     * 购买次数
     */

    private Integer count;

    /**
     * 创建时间
     */
    @Column(name = "create_time")

    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取每日购买金币数
     *
     * @return gold_num - 每日购买金币数
     */
    public BigDecimal getGoldNum() {
        return goldNum;
    }

    /**
     * 设置每日购买金币数
     *
     * @param goldNum 每日购买金币数
     */
    public void setGoldNum(BigDecimal goldNum) {
        this.goldNum = goldNum;
    }

    /**
     * 获取每日购买金额
     *
     * @return money - 每日购买金额
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * 设置每日购买金额
     *
     * @param money 每日购买金额
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * 获取购买次数
     *
     * @return count - 购买次数
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 设置购买次数
     *
     * @param count 购买次数
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", goldNum=").append(goldNum);
        sb.append(", money=").append(money);
        sb.append(", count=").append(count);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
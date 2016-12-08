package com.rcplatform.livechat.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "rc_free_commodity")
public class FreeCommodity implements Serializable {


    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品类型 1 评价 
     */
    private Integer type;

    /**
     * 级别  4 颗星 5 颗星
     */
    private Integer level;

    /**
     * 金币数量
     */
    private BigDecimal gold;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取商品名称
     *
     * @return name - 商品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置商品名称
     *
     * @param name 商品名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取商品类型 1 评价 
     *
     * @return type - 商品类型 1 评价 
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置商品类型 1 评价 
     *
     * @param type 商品类型 1 评价 
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取级别  4 颗星 5 颗星
     *
     * @return level - 级别  4 颗星 5 颗星
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置级别  4 颗星 5 颗星
     *
     * @param level 级别  4 颗星 5 颗星
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取金币数量
     *
     * @return gold - 金币数量
     */
    public BigDecimal getGold() {
        return gold;
    }

    /**
     * 设置金币数量
     *
     * @param gold 金币数量
     */
    public void setGold(BigDecimal gold) {
        this.gold = gold;
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
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", level=").append(level);
        sb.append(", gold=").append(gold);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
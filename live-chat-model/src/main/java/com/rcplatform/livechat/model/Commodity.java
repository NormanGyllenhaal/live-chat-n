package com.rcplatform.livechat.model;



import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "rc_commodity")

public class Commodity implements Serializable {


    public Commodity() {
    }

    public Commodity(Integer appId) {
        this.appId = appId;
    }

    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 应用id
     */
    @Column(name = "app_id")

    private Integer appId;

    /**
     * 商品的名称
     */
    @Column(name = "commodity_name")

    private String commodityName;

    /**
     * 商品的图片
     */
    @Column(name = "commodity_image")

    private String commodityImage;

    /**
     * 商品的金额
     */

    private BigDecimal money;

    /**
     * 金币的数量
     */
    @Column(name = "gold_num")

    private BigDecimal goldNum;

    /**
     * 是否有额外的奖励 1. 有 2 没有
     */

    private Integer bonus;

    /**
     * 商品的优惠金额
     */
    @Column(name = "bonus_num")

    private BigDecimal bonusNum;


    /**
     * ios 产品id
     */
    @Column(name="ios_product_id")

    private String iosProductId;

    /**
     * 产品id
     */
    @Column(name = "product_id")

    private String productId;

    /**
     * 创建的时间
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
     * 获取应用id
     *
     * @return app_id - 应用id
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * 设置应用id
     *
     * @param appId 应用id
     */
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /**
     * 获取商品的名称
     *
     * @return commodity_name - 商品的名称
     */
    public String getCommodityName() {
        return commodityName;
    }

    /**
     * 设置商品的名称
     *
     * @param commodityName 商品的名称
     */
    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    /**
     * 获取商品的图片
     *
     * @return commodity_image - 商品的图片
     */
    public String getCommodityImage() {
        return commodityImage;
    }

    /**
     * 设置商品的图片
     *
     * @param commodityImage 商品的图片
     */
    public void setCommodityImage(String commodityImage) {
        this.commodityImage = commodityImage;
    }

    /**
     * 获取商品的金额
     *
     * @return money - 商品的金额
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * 设置商品的金额
     *
     * @param money 商品的金额
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * 获取金币的数量
     *
     * @return gold_num - 金币的数量
     */
    public BigDecimal getGoldNum() {
        return goldNum;
    }

    /**
     * 设置金币的数量
     *
     * @param goldNum 金币的数量
     */
    public void setGoldNum(BigDecimal goldNum) {
        this.goldNum = goldNum;
    }

    /**
     * 获取是否有额外的奖励 1. 有 2 没有
     *
     * @return bonus - 是否有额外的奖励 1. 有 2 没有
     */
    public Integer getBonus() {
        return bonus;
    }

    /**
     * 设置是否有额外的奖励 1. 有 2 没有
     *
     * @param bonus 是否有额外的奖励 1. 有 2 没有
     */
    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    /**
     * 获取商品的优惠金额
     *
     * @return bonus_num - 商品的优惠金额
     */
    public BigDecimal getBonusNum() {
        return bonusNum;
    }

    /**
     * 设置商品的优惠金额
     *
     * @param bonusNum 商品的优惠金额
     */
    public void setBonusNum(BigDecimal bonusNum) {
        this.bonusNum = bonusNum;
    }

    /**
     * 获取产品id
     *
     * @return product_id - 产品id
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置产品id
     *
     * @param productId 产品id
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * 获取创建的时间
     *
     * @return create_time - 创建的时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建的时间
     *
     * @param createTime 创建的时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public String getIosProductId() {
        return iosProductId;
    }

    public void setIosProductId(String iosProductId) {
        this.iosProductId = iosProductId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Commodity{");
        sb.append("id=").append(id);
        sb.append(", appId=").append(appId);
        sb.append(", commodityName='").append(commodityName).append('\'');
        sb.append(", commodityImage='").append(commodityImage).append('\'');
        sb.append(", money=").append(money);
        sb.append(", goldNum=").append(goldNum);
        sb.append(", bonus=").append(bonus);
        sb.append(", bonusNum=").append(bonusNum);
        sb.append(", iosProductId='").append(iosProductId).append('\'');
        sb.append(", productId='").append(productId).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}
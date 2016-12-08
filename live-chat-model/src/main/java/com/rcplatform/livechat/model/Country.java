package com.rcplatform.livechat.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "rc_country")
public class Country implements Serializable {
    @Id
    private Integer id;

    /**
     * 国家代码
     */
    @Column(name = "country_code")
    private Integer countryCode;

    /**
     * 国家名称英文
     */
    @Column(name = "country_name_en")
    private String countryNameEn;

    /**
     * 国家名称中文
     */
    @Column(name = "country_name_cn")
    private String countryNameCn;

    /**
     * iso缩写
     */
    private String ab;

    @Column(name = "time_difference")
    private Integer timeDifference;

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
     * 获取国家代码
     *
     * @return country_code - 国家代码
     */
    public Integer getCountryCode() {
        return countryCode;
    }

    /**
     * 设置国家代码
     *
     * @param countryCode 国家代码
     */
    public void setCountryCode(Integer countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * 获取国家名称英文
     *
     * @return country_name_en - 国家名称英文
     */
    public String getCountryNameEn() {
        return countryNameEn;
    }

    /**
     * 设置国家名称英文
     *
     * @param countryNameEn 国家名称英文
     */
    public void setCountryNameEn(String countryNameEn) {
        this.countryNameEn = countryNameEn;
    }

    /**
     * 获取国家名称中文
     *
     * @return country_name_cn - 国家名称中文
     */
    public String getCountryNameCn() {
        return countryNameCn;
    }

    /**
     * 设置国家名称中文
     *
     * @param countryNameCn 国家名称中文
     */
    public void setCountryNameCn(String countryNameCn) {
        this.countryNameCn = countryNameCn;
    }

    /**
     * 获取iso缩写
     *
     * @return ab - iso缩写
     */
    public String getAb() {
        return ab;
    }

    /**
     * 设置iso缩写
     *
     * @param ab iso缩写
     */
    public void setAb(String ab) {
        this.ab = ab;
    }

    /**
     * @return time_difference
     */
    public Integer getTimeDifference() {
        return timeDifference;
    }

    /**
     * @param timeDifference
     */
    public void setTimeDifference(Integer timeDifference) {
        this.timeDifference = timeDifference;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", countryCode=").append(countryCode);
        sb.append(", countryNameEn=").append(countryNameEn);
        sb.append(", countryNameCn=").append(countryNameCn);
        sb.append(", ab=").append(ab);
        sb.append(", timeDifference=").append(timeDifference);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
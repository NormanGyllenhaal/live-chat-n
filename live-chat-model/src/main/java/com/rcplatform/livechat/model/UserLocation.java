package com.rcplatform.livechat.model;



import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_user_location")

public class UserLocation implements Serializable {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user_id")

    private Integer userId;

    /**
     * 经度
     */

    private String longitude;

    /**
     * 纬度
     */

    private String latitude;

    /**
     * ip地址
     */

    private String ip;

    /**
     * 大洲名称
     */

    private String continent;

    /**
     * 大洲代码
     */
    @Column(name = "continent_code")

    private String continentCode;

    /**
     * 国家代码
     */
    @Column(name = "country_code")

    private String countryCode;

    /**
     * 国家
     */

    private String country;

    /**
     * 所在时区
     */
    @Column(name = "time_zone")

    private String timeZone;

    /**
     * 区域代码
     */
    @Column(name = "subdivision_code")

    private String subdivisionCode;

    /**
     * 区域
     */

    private String subdivision;

    /**
     * 城市代码
     */
    @Column(name = "city_code")

    private String cityCode;

    /**
     * 1.打开 2 关闭
     */
    @Column(name = "location_open")

    private Integer locationOpen;

    /**
     * 城市
     */

    private String city;

    /**
     * 创建时间
     */
    @Column(name = "create_time")

    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name="update_time")

    private Date updateTime;

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
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取经度
     *
     * @return longitude - 经度
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * 设置经度
     *
     * @param longitude 经度
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取纬度
     *
     * @return latitude - 纬度
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * 设置纬度
     *
     * @param latitude 纬度
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * 获取ip地址
     *
     * @return ip - ip地址
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置ip地址
     *
     * @param ip ip地址
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 获取大洲名称
     *
     * @return continent - 大洲名称
     */
    public String getContinent() {
        return continent;
    }

    /**
     * 设置大洲名称
     *
     * @param continent 大洲名称
     */
    public void setContinent(String continent) {
        this.continent = continent;
    }

    /**
     * 获取大洲代码
     *
     * @return continent_code - 大洲代码
     */
    public String getContinentCode() {
        return continentCode;
    }

    /**
     * 设置大洲代码
     *
     * @param continentCode 大洲代码
     */
    public void setContinentCode(String continentCode) {
        this.continentCode = continentCode;
    }

    /**
     * 获取国家代码
     *
     * @return country_code - 国家代码
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 设置国家代码
     *
     * @param countryCode 国家代码
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * 获取国家
     *
     * @return country - 国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国家
     *
     * @param country 国家
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 获取所在时区
     *
     * @return time_zone - 所在时区
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * 设置所在时区
     *
     * @param timeZone 所在时区
     */
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * 获取区域代码
     *
     * @return subdivision_code - 区域代码
     */
    public String getSubdivisionCode() {
        return subdivisionCode;
    }

    /**
     * 设置区域代码
     *
     * @param subdivisionCode 区域代码
     */
    public void setSubdivisionCode(String subdivisionCode) {
        this.subdivisionCode = subdivisionCode;
    }

    /**
     * 获取区域
     *
     * @return subdivision - 区域
     */
    public String getSubdivision() {
        return subdivision;
    }

    /**
     * 设置区域
     *
     * @param subdivision 区域
     */
    public void setSubdivision(String subdivision) {
        this.subdivision = subdivision;
    }

    /**
     * 获取城市代码
     *
     * @return city_code - 城市代码
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * 设置城市代码
     *
     * @param cityCode 城市代码
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /**
     * 获取1.打开 2 关闭
     *
     * @return location_open - 1.打开 2 关闭
     */
    public Integer getLocationOpen() {
        return locationOpen;
    }

    /**
     * 设置1.打开 2 关闭
     *
     * @param locationOpen 1.打开 2 关闭
     */
    public void setLocationOpen(Integer locationOpen) {
        this.locationOpen = locationOpen;
    }

    /**
     * 获取城市
     *
     * @return city - 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置城市
     *
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city;
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

    /**
     *
     * @return
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserLocation{");
        sb.append("id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", longitude='").append(longitude).append('\'');
        sb.append(", latitude='").append(latitude).append('\'');
        sb.append(", ip='").append(ip).append('\'');
        sb.append(", continent='").append(continent).append('\'');
        sb.append(", continentCode='").append(continentCode).append('\'');
        sb.append(", countryCode='").append(countryCode).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", timeZone='").append(timeZone).append('\'');
        sb.append(", subdivisionCode='").append(subdivisionCode).append('\'');
        sb.append(", subdivision='").append(subdivision).append('\'');
        sb.append(", cityCode='").append(cityCode).append('\'');
        sb.append(", locationOpen=").append(locationOpen);
        sb.append(", city='").append(city).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append('}');
        return sb.toString();
    }
}
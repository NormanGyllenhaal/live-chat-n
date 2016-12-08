package com.rcplatform.livechat.model;



import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_admin")

public class Admin implements Serializable {

    public Admin() {
    }


    public Admin(Integer id, String password) {
        this.id = id;
        this.password = password;
    }

    public Admin(String password, String email) {
        this.password = password;
        this.email = email;
    }

    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 管理员用户名
     */
    @Column(name = "user_name")

    private String userName;

    /**
     * 管理员密码
     */

    private String password;

    /**
     * 管理员邮箱
     */

    private String email;

    /**
     * 创建时间
     */
    @Column(name = "create_time")

    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")

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
     * 获取管理员用户名
     *
     * @return user_name - 管理员用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置管理员用户名
     *
     * @param userName 管理员用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取管理员密码
     *
     * @return password - 管理员密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置管理员密码
     *
     * @param password 管理员密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取管理员邮箱
     *
     * @return email - 管理员邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置管理员邮箱
     *
     * @param email 管理员邮箱
     */
    public void setEmail(String email) {
        this.email = email;
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
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userName=").append(userName);
        sb.append(", password=").append(password);
        sb.append(", email=").append(email);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
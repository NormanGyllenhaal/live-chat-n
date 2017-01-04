package com.rcplatform.livechat.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "rc_admin_function")
public class AdminFunction implements Serializable {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 管理员角色id
     */
    @Column(name = "role_id")
    private Integer roleId;

    /**
     * 图标
     */
    private String icon;

    /**
     * 功能名称
     */
    private String name;

    /**
     * 功能url
     */
    private String url;

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
     * 获取管理员角色id
     *
     * @return role_id - 管理员角色id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 设置管理员角色id
     *
     * @param roleId 管理员角色id
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取图标
     *
     * @return icon - 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图标
     *
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取功能名称
     *
     * @return name - 功能名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置功能名称
     *
     * @param name 功能名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取功能url
     *
     * @return url - 功能url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置功能url
     *
     * @param url 功能url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleId=").append(roleId);
        sb.append(", icon=").append(icon);
        sb.append(", name=").append(name);
        sb.append(", url=").append(url);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
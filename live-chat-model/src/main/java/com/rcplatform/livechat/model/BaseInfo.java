package com.rcplatform.livechat.model;



import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "rc_base_info")

public class BaseInfo implements Serializable {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 名称
     */

    private String name;

    /**
     * 类型  1 语言 2 国家
     */

    private Integer type;

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
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取类型  1 语言 2 国家
     *
     * @return type - 类型  1 语言 2 国家
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型  1 语言 2 国家
     *
     * @param type 类型  1 语言 2 国家
     */
    public void setType(Integer type) {
        this.type = type;
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
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
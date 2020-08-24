package com.sy.yuanfei.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 角色表(AuRole)实体类
 *
 * @author makejava
 * @since 2020-08-24 11:59:47
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuRole implements Serializable {
    private static final long serialVersionUID = 991544232140870500L;
    /**
    * 主键ID
    */
    private Long id;
    /**
    * 角色编码
    */
    private String rolecode;
    /**
    * 角色名称
    */
    private String rolename;
    /**
    * 创建日期
    */
    private Object createdate;
    /**
    * 是否启用（0、未启用1、启用）
    */
    private Integer isstart;
    /**
    * 创建者
    */
    private String createby;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRolecode() {
        return rolecode;
    }

    public void setRolecode(String rolecode) {
        this.rolecode = rolecode;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public Object getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Object createdate) {
        this.createdate = createdate;
    }

    public Integer getIsstart() {
        return isstart;
    }

    public void setIsstart(Integer isstart) {
        this.isstart = isstart;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby;
    }

}
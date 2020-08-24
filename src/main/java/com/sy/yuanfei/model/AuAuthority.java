package com.sy.yuanfei.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 角色权限关联表(AuAuthority)实体类
 *
 * @author makejava
 * @since 2020-08-24 11:59:47
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuAuthority implements Serializable {
    private static final long serialVersionUID = -95635068226100894L;
    /**
    * 主键ID
    */
    private Long id;
    /**
    * 角色ID
    */
    private Long roleid;
    /**
    * 功能ID
    */
    private Long functionid;
    /**
    * 创建时间
    */
    private Date creationtime;
    /**
    * 创建者
    */
    private String createdby;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public Long getFunctionid() {
        return functionid;
    }

    public void setFunctionid(Long functionid) {
        this.functionid = functionid;
    }

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

}
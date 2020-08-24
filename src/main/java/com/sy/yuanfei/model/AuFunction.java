package com.sy.yuanfei.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 权限表(AuFunction)实体类
 *
 * @author makejava
 * @since 2020-08-24 11:59:47
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuFunction implements Serializable {
    private static final long serialVersionUID = 264002801849954767L;
    /**
    * 主键ID
    */
    private Long id;
    /**
    * 功能编码
    */
    private String funccode;
    /**
    * 功能名称
    */
    private String funcname;
    /**
    * 功能URL
    */
    private String funcurl;
    
    private Long parentid;
    /**
    * 创建时间
    */
    private Date creationtime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFunccode() {
        return funccode;
    }

    public void setFunccode(String funccode) {
        this.funccode = funccode;
    }

    public String getFuncname() {
        return funcname;
    }

    public void setFuncname(String funcname) {
        this.funcname = funcname;
    }

    public String getFuncurl() {
        return funcurl;
    }

    public void setFuncurl(String funcurl) {
        this.funcurl = funcurl;
    }

    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

}
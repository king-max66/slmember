package com.sy.yuanfei.model;

import java.util.Date;
import java.io.Serializable;

/**
 * 购物车(Shopcart)实体类
 *
 * @author makejava
 * @since 2020-08-24 11:59:47
 */
public class Shopcart implements Serializable {
    private static final long serialVersionUID = 868233742829883110L;
    
    private Long id;
    /**
    * 关联用户名
    */
    private Long userid;
    /**
    * 购物车中商品总价
    */
    private Object totalprice;
    /**
    * 创建人,读自用户表
    */
    private String createby;
    /**
    * 最后修改时间
    */
    private Date lastupdatetime;
    /**
    * 创建时间
    */
    private Date createtime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Object getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Object totalprice) {
        this.totalprice = totalprice;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby;
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

}
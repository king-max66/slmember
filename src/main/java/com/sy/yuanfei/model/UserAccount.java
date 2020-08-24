package com.sy.yuanfei.model;

import java.util.Date;
import java.io.Serializable;

/**
 * 金钱账户表(UserAccount)实体类
 *
 * @author makejava
 * @since 2020-08-24 11:59:47
 */
public class UserAccount implements Serializable {
    private static final long serialVersionUID = 334148412003771111L;
    
    private Long id;
    /**
    * 关联用户表
    */
    private Long userid;
    /**
    * 账户余额
    */
    private Double balance;
    
    private Date createtime;
    
    private Date lastupdatetime;
    
    private String createby;
    /**
    * 0锁定,1锁定
    */
    private Integer status;


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

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
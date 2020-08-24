package com.sy.yuanfei.model;

import java.util.Date;
import java.io.Serializable;

/**
 * 会员人数报表(Report)实体类
 *
 * @author makejava
 * @since 2020-08-24 11:59:47
 */
public class Report implements Serializable {
    private static final long serialVersionUID = 505714182503510005L;
    
    private Long id;
    /**
    * 相应会员类型对应的人数
    */
    private Integer usernum;
    /**
    * 关联角色表
    */
    private Long roleid;
    /**
    * 会员类型
    */
    private String rolename;
    
    private Date createtime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUsernum() {
        return usernum;
    }

    public void setUsernum(Integer usernum) {
        this.usernum = usernum;
    }

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

}
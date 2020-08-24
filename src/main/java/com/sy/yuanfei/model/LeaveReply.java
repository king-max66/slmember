package com.sy.yuanfei.model;

import java.util.Date;
import java.io.Serializable;

/**
 * (LeaveReply)实体类
 *
 * @author makejava
 * @since 2020-08-24 11:59:47
 */
public class LeaveReply implements Serializable {
    private static final long serialVersionUID = 379500078860448304L;
    /**
    * 主键ID
    */
    private Long id;
    /**
    * 留言ID（主表）
    */
    private Long messageid;
    /**
    * 回复内容
    */
    private String replycontent;
    /**
    * 回复人
    */
    private String createdby;
    /**
    * 回复时间
    */
    private Date createtime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMessageid() {
        return messageid;
    }

    public void setMessageid(Long messageid) {
        this.messageid = messageid;
    }

    public String getReplycontent() {
        return replycontent;
    }

    public void setReplycontent(String replycontent) {
        this.replycontent = replycontent;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

}
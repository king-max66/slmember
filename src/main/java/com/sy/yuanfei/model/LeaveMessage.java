package com.sy.yuanfei.model;

import java.util.Date;
import java.io.Serializable;

/**
 * (LeaveMessage)实体类
 *
 * @author makejava
 * @since 2020-08-24 11:59:47
 */
public class LeaveMessage implements Serializable {
    private static final long serialVersionUID = -25285370266284090L;
    /**
    * 主键ID
    */
    private Long id;
    /**
    * 留言用户code
    */
    private String createdby;
    /**
    * 留言编码
    */
    private String messagecode;
    /**
    * 留言标题
    */
    private String messagetitle;
    /**
    * 留言内容
    */
    private String messagecontent;
    /**
    * 状态（1、已回复0、未回复）
    */
    private Integer state;
    /**
    * 留言时间
    */
    private Date createtime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public String getMessagecode() {
        return messagecode;
    }

    public void setMessagecode(String messagecode) {
        this.messagecode = messagecode;
    }

    public String getMessagetitle() {
        return messagetitle;
    }

    public void setMessagetitle(String messagetitle) {
        this.messagetitle = messagetitle;
    }

    public String getMessagecontent() {
        return messagecontent;
    }

    public void setMessagecontent(String messagecontent) {
        this.messagecontent = messagecontent;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

}
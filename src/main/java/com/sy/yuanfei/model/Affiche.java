package com.sy.yuanfei.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 公告表(Affiche)实体类
 *
 * @author makejava
 * @since 2020-08-24 11:59:47
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Affiche implements Serializable {
    private static final long serialVersionUID = 868067721387533350L;
    /**
    * 主键ID
    */
    private Long id;
    /**
    * 标题
    */
    private String title;
    /**
    * 内容
    */
    private String content;
    /**
    * 发布人
    */
    private String publisher;
    /**
    * 发布时间
    */
    private Date publishtime;
    /**
    * 生效时间
    */
    private Date starttime;
    /**
    * 失效时间
    */
    private Date endtime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

}
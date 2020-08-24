package com.sy.yuanfei.model;

import java.io.Serializable;

/**
 * 数据字典(DataDictionary)实体类
 *
 * @author makejava
 * @since 2020-08-24 11:59:47
 */
public class DataDictionary implements Serializable {
    private static final long serialVersionUID = 795920563370792390L;
    /**
    * 主键ID
    */
    private Long id;
    /**
    * 类型编码
    */
    private String typecode;
    /**
    * 类型名称
    */
    private String typename;
    /**
    * 类型值ID
    */
    private Integer valueid;
    /**
    * 类型值Name
    */
    private String valuename;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypecode() {
        return typecode;
    }

    public void setTypecode(String typecode) {
        this.typecode = typecode;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public Integer getValueid() {
        return valueid;
    }

    public void setValueid(Integer valueid) {
        this.valueid = valueid;
    }

    public String getValuename() {
        return valuename;
    }

    public void setValuename(String valuename) {
        this.valuename = valuename;
    }

}
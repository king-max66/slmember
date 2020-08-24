package com.sy.yuanfei.model;

import java.util.Date;
import java.io.Serializable;

/**
 * 销售额报表(Report2)实体类
 *
 * @author makejava
 * @since 2020-08-24 11:59:47
 */
public class Report2 implements Serializable {
    private static final long serialVersionUID = -32034730671471587L;
    
    private Long id;
    /**
    * 销售额度
    */
    private Double totalmoney;
    
    private Date createtime;
    /**
    * 0会员销售,1商品销售
    */
    private Integer type;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(Double totalmoney) {
        this.totalmoney = totalmoney;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

}
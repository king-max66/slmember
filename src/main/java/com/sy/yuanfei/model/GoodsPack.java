package com.sy.yuanfei.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 把数据放在ES中(GoodsPack)实体类
 *
 * @author makejava
 * @since 2020-08-24 11:59:47
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsPack implements Serializable {
    private static final long serialVersionUID = 522168310121232531L;
    /**
    * 主键ID
    */
    private Long id;
    /**
    * 套餐名称
    */
    private String goodspackname;
    /**
    * 套餐编码
    */
    private String goodspackcode;
    /**
    * 套餐类型ID
    */
    private Integer typeid;
    /**
    * 套餐类型NAME
    */
    private String typename;
    /**
    * 套餐总价（系统生成，保存时根据相关商品的优惠价*数量计算生成）
    */
    private Object totalprice;
    /**
    * 状态（1、上架2、下架）
    */
    private Integer state;
    /**
    * 备注说明
    */
    private String note;
    /**
    * 库存数量
    */
    private Integer num;
    /**
    * 创建人
    */
    private String createdby;
    /**
    * 创建时间
    */
    private Date createtime;
    /**
    * 最后更新时间
    */
    private Date lastupdatetime;




}
package com.sy.yuanfei.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

/**
 * 权限表(AuFunctionMapper)实体类
 *
 * @author makejava
 * @since 2020-08-24 11:59:47
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "AU_FUNCTION")
public class AuFunction implements Serializable {
    private static final long serialVersionUID = 264002801849954767L;
    /**
    * 主键ID
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
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



}
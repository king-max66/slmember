package com.sy.yuanfei.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

/**
 * 角色权限关联表(AuAuthority)实体类
 *
 * @author makejava
 * @since 2020-08-24 11:59:47
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "AU_AUTHORITY")
public class AuAuthority implements Serializable {
    private static final long serialVersionUID = -95635068226100894L;
    /**
    * 主键ID
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
    * 角色ID
    */
    private Integer roleid;
    /**
    * 功能ID
    */
    private Integer functionid;
    /**
    * 创建时间
    */
    private Date creationtime;
    /**
    * 创建者
    */
    private String createdby;




}
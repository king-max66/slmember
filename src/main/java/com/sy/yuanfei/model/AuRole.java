package com.sy.yuanfei.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 角色表(AuRole)实体类
 *
 * @author makejava
 * @since 2020-08-24 11:59:47
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "AU_ROLE")
public class AuRole implements Serializable {
    private static final long serialVersionUID = 991544232140870500L;
    /**
    * 主键ID
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
    * 角色编码
    */
    private String rolecode;
    /**
    * 角色名称
    */
    private String rolename;
    /**
    * 创建日期
    */
    @JsonFormat(pattern = "yyyy-MM-hh HH:mm:ss")
    private Date createdate;
    /**
    * 是否启用（0、未启用1、启用）
    */
    private Integer isstart;
    /**
    * 创建者
    */
    private String createby;



}
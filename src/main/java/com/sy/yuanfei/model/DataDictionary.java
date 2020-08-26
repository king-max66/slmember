package com.sy.yuanfei.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 数据字典(DataDictionary)实体类
 *
 * @author makejava
 * @since 2020-08-24 11:59:47
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "DATA_DICTIONARY")
public class DataDictionary implements Serializable {
    private static final long serialVersionUID = 795920563370792390L;
    /**
    * 主键ID
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
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




}
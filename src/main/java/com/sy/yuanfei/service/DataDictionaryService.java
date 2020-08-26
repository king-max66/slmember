package com.sy.yuanfei.service;

import com.sy.yuanfei.model.DataDictionary;

import java.util.List;

public interface DataDictionaryService {

    List<DataDictionary> findAll()throws Exception;

    DataDictionary save(DataDictionary dataDictionary)throws Exception;

    void removeById(int id)throws Exception;
}

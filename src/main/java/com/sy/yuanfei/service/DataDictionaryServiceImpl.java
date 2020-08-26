package com.sy.yuanfei.service;

import com.sy.yuanfei.mapper.DataDictionaryMapper;
import com.sy.yuanfei.model.DataDictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class DataDictionaryServiceImpl implements DataDictionaryService {

    @Autowired
    private DataDictionaryMapper dataDictionaryMapper;
    @Override
    public List<DataDictionary> findAll() throws Exception {
        return dataDictionaryMapper.findAll();
    }

    @Override
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    public DataDictionary save(DataDictionary dataDictionary) throws Exception {
        return dataDictionaryMapper.save(dataDictionary);
    }

    @Override
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    public void removeById(int id) throws Exception {
        dataDictionaryMapper.deleteById(id);
    }
}

package com.sy.yuanfei.service;

import com.sy.yuanfei.mapper.AuFunctionMapper;
import com.sy.yuanfei.model.AuFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class AuFunctionServiceImpl implements AuFunctionService {

    @Autowired
    private AuFunctionMapper auFunctionMapper;

    @Override
    public List<AuFunction> findAll() throws Exception {
        return auFunctionMapper.findAll();
    }
}

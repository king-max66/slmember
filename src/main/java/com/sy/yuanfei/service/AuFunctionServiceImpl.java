package com.sy.yuanfei.service;

import com.sy.yuanfei.mapper.AuFunctionMapper;
import com.sy.yuanfei.model.AuFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
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

    @Override
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    public AuFunction saveAuFunction(AuFunction auFunction) throws Exception {
        return auFunctionMapper.save(auFunction);
    }

    @Override
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    public void removeById(int id) throws Exception {
        auFunctionMapper.deleteById(id);
    }
}

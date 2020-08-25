package com.sy.yuanfei.service;

import com.sy.yuanfei.mapper.AuRoleMapper;
import com.sy.yuanfei.model.AuRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class AuRoleServiceImpl implements AuRoleService {

    @Autowired
    private AuRoleMapper auRoleMapper;

    @Override
    public  Page<AuRole> findAll(Pageable pageable) throws Exception {
        Page<AuRole> page = auRoleMapper.findAll(pageable);
        return page;
    }

    @Override
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    public void removeById(int id) throws Exception {
        auRoleMapper.deleteById(id);
    }
}

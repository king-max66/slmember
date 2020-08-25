package com.sy.yuanfei.service;

import com.sy.yuanfei.mapper.AuRoleMapper;
import com.sy.yuanfei.model.AuRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;



@Service
public class AuRoleServiceImpl implements AuRoleService {

    @Autowired
    private AuRoleMapper auRoleMapper;

    @Override
    public  Page<AuRole> findAll(Pageable pageable) throws Exception {
        Page<AuRole> page = auRoleMapper.findAll(pageable);
        return page;
    }
}

package com.sy.yuanfei.service;

import com.sy.yuanfei.mapper.AuRoleMapper;
import com.sy.yuanfei.model.AuRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuRoleServiceImpl implements AuRoleService {

    @Autowired
    private AuRoleMapper auRoleMapper;

    @Override
    public List<AuRole> findAll() throws Exception {
        return auRoleMapper.findAll();
    }
}

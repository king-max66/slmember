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

import java.util.Optional;

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

    @Override
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    public AuRole addRole(AuRole auRole) throws Exception {
        AuRole save = auRoleMapper.save(auRole);
        return save;
    }

    @Override
    public AuRole findById(int id) throws Exception {
        Optional<AuRole> byId = auRoleMapper.findById(id);
        System.out.println(id+"========================");
        AuRole auRole = byId.get();
        System.out.println(auRole+"---------------"+id);
        return auRole;
    }
}

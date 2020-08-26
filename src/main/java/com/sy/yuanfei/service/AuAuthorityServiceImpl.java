package com.sy.yuanfei.service;

import com.sy.yuanfei.mapper.AuAuthorityMapper;
import com.sy.yuanfei.model.AuAuthority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional(readOnly = true)
public class AuAuthorityServiceImpl implements AuAuthorityService{
    @Autowired
    private AuAuthorityMapper auAuthorityMapper;

    @Override
    public List<AuAuthority> findByFunctionId(int fid) throws Exception {
        return auAuthorityMapper.findByFunctionid(fid);
    }
}

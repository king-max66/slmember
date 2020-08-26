package com.sy.yuanfei.service;

import com.sy.yuanfei.model.AuAuthority;

import java.util.List;

public interface AuAuthorityService {

    List<AuAuthority> findByFunctionId(int id)throws Exception;
}

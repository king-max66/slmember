package com.sy.yuanfei.service;

import com.sy.yuanfei.model.AuRole;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AuRoleService {

    Page<AuRole> findAll(Pageable pageable)throws  Exception;

    void removeById(int id)throws Exception;
}

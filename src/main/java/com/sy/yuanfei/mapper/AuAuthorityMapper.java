package com.sy.yuanfei.mapper;

import com.sy.yuanfei.model.AuAuthority;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuAuthorityMapper extends JpaRepository<AuAuthority,Integer> {


    List<AuAuthority> findByFunctionid(int functionid);
}

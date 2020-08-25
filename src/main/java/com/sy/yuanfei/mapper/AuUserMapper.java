package com.sy.yuanfei.mapper;

import com.sy.yuanfei.model.AuUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuUserMapper extends JpaRepository<AuUser,Long> {

}

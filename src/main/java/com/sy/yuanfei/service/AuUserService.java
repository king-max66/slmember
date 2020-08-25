package com.sy.yuanfei.service;

import com.sy.yuanfei.model.AuUser;

public interface AuUserService {

    AuUser login(String username)throws  Exception;
}

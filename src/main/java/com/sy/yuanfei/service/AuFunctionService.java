package com.sy.yuanfei.service;



import com.sy.yuanfei.model.AuFunction;

import java.util.List;

public interface AuFunctionService {

    List<AuFunction> findAll()throws Exception;

    AuFunction saveAuFunction(AuFunction auFunction)throws Exception;

    void removeById(int id)throws Exception;
}

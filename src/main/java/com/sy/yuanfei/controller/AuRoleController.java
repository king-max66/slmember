package com.sy.yuanfei.controller;

import com.sy.yuanfei.model.AuRole;
import com.sy.yuanfei.model.base.Result;
import com.sy.yuanfei.service.AuRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/auRole")
public class AuRoleController {

    @Autowired
    private AuRoleService auRoleService;


    @RequestMapping("/findAll.do")
    public Result findAll(Pageable pageable,Integer pageSize,Integer pageNow)throws Exception{
        Page<AuRole> list1 = auRoleService.findAll(pageable);
        List<AuRole> list = list1.getContent();
        Pageable of = PageRequest.of(pageNow-1, pageSize);
        Page<AuRole> all = auRoleService.findAll(of);
        List<AuRole> list2 = all.getContent();
        Result result= new Result();
        if (!list2.isEmpty()){
            result.setData(list2);
            result.setCount(list1.getNumberOfElements());
            result.setCode(Result.CODE_SUCCESS);
            result.setMsg(Result.MSG_SUCCESS);
        }else {
            result.setCode(Result.CODE_FAILED);
            result.setMsg(Result.MSG_FAILED);
        }
        return result;
    }
}

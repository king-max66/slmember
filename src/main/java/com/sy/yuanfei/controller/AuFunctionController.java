package com.sy.yuanfei.controller;

import com.sy.yuanfei.model.AuFunction;
import com.sy.yuanfei.model.base.Result;
import com.sy.yuanfei.service.AuFunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/auFunction")
public class AuFunctionController {

    @Autowired
    private AuFunctionService auFunctionService;

    @RequestMapping("findAll.do")
    public Result findAll()throws Exception{
        List<AuFunction> list = auFunctionService.findAll();
        Result result= new Result();
        if (!list.isEmpty()){
            result.setData(list);
            result.setCode(Result.CODE_SUCCESS);
            result.setMsg(Result.MSG_SUCCESS);
        }else {
            result.setCode(Result.CODE_FAILED);
            result.setMsg(Result.MSG_FAILED);
        }
        return result;
    }
}

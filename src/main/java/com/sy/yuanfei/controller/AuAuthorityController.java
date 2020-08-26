package com.sy.yuanfei.controller;

import com.sy.yuanfei.model.AuAuthority;
import com.sy.yuanfei.model.AuRole;
import com.sy.yuanfei.model.base.Result;
import com.sy.yuanfei.service.AuAuthorityService;
import com.sy.yuanfei.service.AuRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/auAuthority")
public class AuAuthorityController {

    @Autowired
    private AuAuthorityService auAuthorityService;
    @Autowired
    private AuRoleService auRoleService;

    @RequestMapping("/findByFunctionId.do")
    public Result findByFid(int fid)throws Exception{
        Result result= new Result();
        List list1= new ArrayList();
        List<AuAuthority> list = auAuthorityService.findByFunctionId(fid);
        for (AuAuthority auAuthority : list) {
            AuRole byId = auRoleService.findById(auAuthority.getRoleid());
            list1.add(byId);
        }
        if (!list1.isEmpty()){
            result.setCode(Result.CODE_SUCCESS);
            result.setMsg(Result.MSG_SUCCESS);
        }else {
            result.setCode(Result.CODE_FAILED);
            result.setMsg(Result.MSG_FAILED);
        }
        return result;
    }
}

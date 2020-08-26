package com.sy.yuanfei.controller;

import com.sy.yuanfei.model.DataDictionary;
import com.sy.yuanfei.model.base.Result;
import com.sy.yuanfei.service.DataDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dataDictionary")
public class DataDictionaryController {

    @Autowired
    private DataDictionaryService dataDictionaryService;

    @RequestMapping("/findAll.do")
    public Result findAll() throws Exception {
        Result result = new Result();
        List<DataDictionary> list = dataDictionaryService.findAll();
        if (!list.isEmpty()) {
            result.setData(list);
            result.setCode(Result.CODE_SUCCESS);
            result.setMsg(Result.MSG_SUCCESS);
        } else {
            result.setCode(Result.CODE_FAILED);
            result.setMsg(Result.MSG_FAILED);
        }
        return result;
    }

    @RequestMapping("/save.do")
    public Result save(DataDictionary dataDictionary) throws Exception {
        Result result = new Result();
        DataDictionary save = dataDictionaryService.save(dataDictionary);
        if (save != null) {
            result.setCode(Result.CODE_SUCCESS);
            result.setMsg(Result.MSG_SUCCESS);
        } else {
            result.setCode(Result.CODE_FAILED);
            result.setMsg(Result.MSG_FAILED);
        }
        return result;
    }

    @RequestMapping("/remove.do")
    public Result remove(int id) throws Exception {
        Result result = new Result();
        dataDictionaryService.removeById(id);
        result.setCode(Result.CODE_SUCCESS);
        result.setMsg(Result.MSG_SUCCESS);
        return result;
    }
}

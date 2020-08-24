package com.sy.yuanfei.common.exception;


import com.sy.yuanfei.model.base.Result;
import org.apache.shiro.authz.UnauthorizedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 通用异常处理器
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result doException(Exception e){

        //1.记录日志
        LOGGER.error(e.getMessage(), e);

        //2.响应JSON
        Result baseResult = new Result();
        if(e instanceof UnauthorizedException){
            baseResult.setCode(Result.CODE_FAILED);
            baseResult.setMsg("你没有权限，请联系管理员！");
            return baseResult;
        }
        baseResult.setCode(Result.CODE_FAILED);
        baseResult.setMsg(Result.MSG_FAILED);
        return baseResult;
    }
}

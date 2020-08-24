package com.sy.yuanfei.controller;

import com.sy.yuanfei.model.AuUser;
import com.sy.yuanfei.model.base.Result;
import com.sy.yuanfei.service.AuUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/auuser")
public class AuUserController {

    @Autowired
    private AuUserService auUserService;

    @RequestMapping("/login.do")
    public Result login(String username, String password, String captcha, HttpSession session)throws Exception{
        AuUser login = auUserService.login(username, password);
        String text = (String)session.getAttribute("captcha");
        Result result= new Result();
        if(!text.toLowerCase().equals(captcha)){
            result.setCode(Result.CODE_FAILED);
            System.out.println(text.toLowerCase());
            result.setMsg("验证码不正确");
        }else if (login!=null){
            session.setAttribute("sessionUser",login);
            result.setCode(Result.CODE_SUCCESS);
            result.setMsg(Result.MSG_SUCCESS);
        }else {
            result.setCode(Result.CODE_FAILED);
            result.setMsg(Result.MSG_FAILED);
        }
        return result;
    }

    /**
     * 会话验证
     * @param session
     * @return
     */
    @RequestMapping("/session.do")
    public Result findSessionUser(HttpSession session){
        Result baseResult = new Result();
        AuUser sessionUser = (AuUser) session.getAttribute("sessionUser");
        if(sessionUser==null){
            baseResult.setMsg("请登录");
            baseResult.setCode(Result.CODE_FAILED);
        }else{
            baseResult.setMsg(Result.MSG_SUCCESS);
            baseResult.setCode(Result.CODE_SUCCESS);
            baseResult.setData(sessionUser);
        }
        return baseResult;
    }

    @RequestMapping("/logout.do")
    public Result logout(){
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        Result baseResult = new Result();
        baseResult.setCode(Result.CODE_SUCCESS);
        baseResult.setMsg(Result.MSG_SUCCESS);
        return baseResult;
    }
}

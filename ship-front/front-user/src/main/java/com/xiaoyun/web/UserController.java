package com.xiaoyun.web;

import com.xiaoyun.pojo.UserPojo;
import com.xiaoyun.service.IUserService;
import com.xiaoyun.utils.ResponseMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    IUserService userService;

    @RequestMapping("checkName")
    @ResponseBody
    public ResponseMsg checkName(String vName){
       String v=userService.checkName(vName);
       ResponseMsg msg=new ResponseMsg();
        if(v==null){
            msg.setCode(1);
            msg.setMessage("恭喜您,用户名可用");
            return msg;
        }
        msg.setCode(0);
        msg.setMessage("请换一个名字试试");
        return msg;
    }
    @RequestMapping("register")
    @ResponseBody
    public ResponseMsg register(UserPojo userPojo){
        boolean flg=userService.register(userPojo);
        ResponseMsg msg=new ResponseMsg();
        if(flg){
            msg.setCode(2);
            msg.setMessage("恭喜您,可以去登录了");
            return msg;
        }
        msg.setCode(3);
        msg.setMessage("网络不好,请稍后再试");
        return msg;
    }
    @RequestMapping("login")
    @ResponseBody
    public ResponseMsg login(UserPojo userPojo, HttpSession session){
        UserPojo userPojo1=userService.login(userPojo);
        ResponseMsg msg=new ResponseMsg();
        if(userPojo1!=null){
            session.setAttribute("user",userPojo1);
            msg.setCode(4);
            msg.setMessage("登陆成功");
            return msg;
        }
        msg.setCode(5);
        msg.setMessage("账户或密码有误");
        return msg;
    }

}

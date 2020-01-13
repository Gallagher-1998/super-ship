package com.xiaoyun.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @GetMapping("index")
    @ResponseBody
    public String index(){
        return "index";
    }

}

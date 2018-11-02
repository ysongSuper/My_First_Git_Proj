package com.springboot.controller;

import com.springboot.bean.Account;
import com.springboot.service.JpaTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by yangsong on 2018/6/15.
 */

@Controller
public class JpaTestController {


    @Autowired
    private JpaTestService jpaTestService;
    @Value("${spring.mvc.view.prefix}")
    private String url;

    @RequestMapping(value = "/findAllInfos",method = RequestMethod.POST)
    @ResponseBody
    public List<Account> findAllInfos(){
        List<Account> accountList=jpaTestService.findAllInfos();
        return accountList;
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String  index(){
        return "user/index";
    }

    @RequestMapping(value = "/testUrl",method = RequestMethod.GET)
    @ResponseBody
    public String url(){
        System.out.print(url);
        return url;
    }


}

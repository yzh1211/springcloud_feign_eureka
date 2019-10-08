package com.example.clientdemo.controller;

import com.example.clientdemo.service.FeignClientService;
import com.example.clientdemo3.domain.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumeController {

    @Autowired
    private FeignClientService feignClientService;

    //feign
    @RequestMapping(value ="select",method = RequestMethod.GET)
    public UserVo select(UserVo userVo){
        return feignClientService.add(userVo.getName());
    }
}

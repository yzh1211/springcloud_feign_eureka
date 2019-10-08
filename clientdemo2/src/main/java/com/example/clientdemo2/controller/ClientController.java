package com.example.clientdemo2.controller;

import com.example.clientdemo3.domain.UserVo;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClientController {
    @RequestMapping(value = "add",method = RequestMethod.GET)
    public UserVo service(@RequestParam String name){
        System.out.println("调用了该服务 clientdemo2");
        return new UserVo().setName(name);
    }
}

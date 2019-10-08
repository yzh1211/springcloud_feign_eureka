package com.example.clientdemo.service;

import com.example.clientdemo3.domain.UserVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("COMPUTE-SERVICE")
public interface FeignClientService {
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    UserVo add(@RequestParam(value = "name")String name);
}

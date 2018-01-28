package com.weitongming.springribbon.controller;

import com.weitongming.springribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tim.wei on 2018/1/28.
 */

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService ;


    @RequestMapping("/hiRibbon")
    public String call(@RequestParam String name ){
        return helloService.hi(name);
    }


}

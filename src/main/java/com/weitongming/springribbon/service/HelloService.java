package com.weitongming.springribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

/**
 * Created by tim.wei on 2018/1/28.
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate ;

    public String hi(String name){
        String result = null;
        try {
             result=  restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
        }catch (Exception e){
            result = new String(((HttpServerErrorException) e).getResponseBodyAsString());
            e.getMessage();
        }
        return "i am ribbon  ,call result = :  " + result;
    }
}

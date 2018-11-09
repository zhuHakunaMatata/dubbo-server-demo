package com.my.service;

/**
 * Created by kyle on 2018/11/9.
 */
public class HelloServiceImpl implements IHelloService {
    @Override
    public String sayHello(String msg) {
        System.out.println("---------" + msg);
        return " ----  " + msg ;
    }
}

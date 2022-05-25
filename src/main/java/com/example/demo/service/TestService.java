package com.example.demo.service;

import com.example.demo.config.SpringContext;

public class TestService {
    private PrintService printService;

    public TestService(){
        printService = SpringContext.getBean(PrintService.class);
    }

    public void test(){
        printService.printLog();
    }

}

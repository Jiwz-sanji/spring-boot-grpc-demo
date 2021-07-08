package com.tncet.demo.web;


import javax.annotation.Resource;

import com.tncet.demo.enums.StdStatus;
import com.tncet.demo.service.grpc.HelloWorldClientService;
import com.tncet.demo.utils.StdResult;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrpcTestController {
    @Resource
    private HelloWorldClientService helloWorldClientService;

    @RequestMapping(value = "/grpctests", method = RequestMethod.GET)
    public StdResult<String> testGrpc() {
        String result = helloWorldClientService.receiveGreeting("bighansen");
        System.out.println("result");
        System.out.println(result);
        return new StdResult<>(StdStatus.STATUS_200, result);
    }
}
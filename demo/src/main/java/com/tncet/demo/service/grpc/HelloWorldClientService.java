package com.tncet.demo.service.grpc;
import org.springframework.stereotype.Service;
import net.devh.boot.grpc.client.inject.GrpcClient;




@Service
public class HelloWorldClientService {
    
    // 见resources/application.yml的服务端口配置
    @GrpcClient("remote-server")
    private HelloWorldServiceGrpc.HelloWorldServiceBlockingStub blockingStub;

    public String receiveGreeting(String name) {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(name);
        HelloRequest request = HelloRequest.newBuilder()
                .setName(name)
                .build();
        System.out.println(request);
        return blockingStub.sayHello(request).getMessage();
    }
    
}
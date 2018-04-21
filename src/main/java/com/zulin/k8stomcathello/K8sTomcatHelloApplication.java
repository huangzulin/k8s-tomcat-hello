package com.zulin.k8stomcathello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class K8sTomcatHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(K8sTomcatHelloApplication.class, args);
    }

    @GetMapping("/")
    public String index(){
        return "Hello from tomcat-hello /";
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello from tomcat-hello /hello";
    }
}

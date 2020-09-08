package cn.jiyun.jiyungateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaServer
public class JiyunGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(JiyunGatewayApplication.class, args);
    }

}

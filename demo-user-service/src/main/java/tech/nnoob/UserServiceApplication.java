package tech.nnoob;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @CreateTime: 2022/6/10 3:07 下午
 * @Author: nnoobnie
 * @Description: UserServiceApplication
 */

@RestController
@EnableAutoConfiguration
@EnableDiscoveryClient
@RefreshScope // 配置文件更新时，配置会立即生效
public class UserServiceApplication {
    public static void main(String[] args) {

        SpringApplication.run(UserServiceApplication.class, args);

    }

    @Value("${admin.name}")
    private String adminName;

    @GetMapping("/hello")
    public String hello() {
        return "hello niezhiqiang";
    }

    @GetMapping("/echo")
    public String echo() {
        return "hello nacos Discovery";
    }

    @GetMapping("/getAdminName")

    public String getAdminName(){

        return adminName;
    }



}

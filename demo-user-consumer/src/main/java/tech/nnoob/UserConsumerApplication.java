package tech.nnoob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @CreateTime: 2022/6/10 3:59 下午
 * @Author: nnoobnie
 * @Description: UserConsumerApplication
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UserConsumerApplication {

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(UserConsumerApplication.class, args);
    }

    @RestController
    public static class TestController {

        private final RestTemplate restTemplate;

        @Autowired
        public TestController(RestTemplate restTemplate) {
            this.restTemplate = restTemplate;
        }

        @RequestMapping(value = "/echo", method = RequestMethod.GET)
        public String echo() {
            System.out.println("echo client");
            return restTemplate.getForObject("http://user-provider/user/echo/", String.class);
        }
    }
}

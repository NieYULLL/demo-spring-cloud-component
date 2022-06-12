package tech.nnoob.order.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tech.nnoob.user.service.api.UserService;

import java.io.IOException;

/**
 * @CreateTime: 2022/6/12 3:02 下午
 * @Author: nnoobnie
 * @Description: OrderApplication
 */
public class OrderApplication {

    public static void main(String[] args) throws IOException {


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:consumer.xml");

        UserService userService = (UserService) applicationContext.getBean("userService");

        System.out.println(userService.getUserNameById(1158632730L));
        System.in.read();
    }
}

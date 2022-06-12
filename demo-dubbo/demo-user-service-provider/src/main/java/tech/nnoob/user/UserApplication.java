package tech.nnoob.user;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @CreateTime: 2022/6/12 2:40 下午
 * @Author: nnoobnie
 * @Description: UserApplication
 */
public class UserApplication {


    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:provider.xml");
        context.start();

        System.in.read();
    }
}

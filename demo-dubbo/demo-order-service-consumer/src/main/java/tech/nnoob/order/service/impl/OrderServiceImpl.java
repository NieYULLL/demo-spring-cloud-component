package tech.nnoob.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.nnoob.order.service.OrderService;
import tech.nnoob.user.service.api.UserService;

/**
 * @CreateTime: 2022/6/12 11:24 上午
 * @Author: nnoobnie
 * @Description: OrderServiceImpl
 */

@Service
public class OrderServiceImpl implements OrderService {


    private final UserService userService;

    @Autowired
    public OrderServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void addOrder(String orderName) {

        String userNameById = userService.getUserNameById(1158632730L);
        System.out.println(userNameById);

    }
}

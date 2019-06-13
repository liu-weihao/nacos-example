package com.dx.ss.example.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping
public class OrderController {

    @Autowired
    private OrderConfig config;

    @Autowired
    private UserRpcService userRpcService;

    @PostMapping(value = "/order")
    public String placeOrder(@RequestParam(name = "num", defaultValue = "1") Integer num) {
        if (!"enable".equals(userRpcService.getUserStatus())) return "该用户已被禁用，暂不能下单";
        if (num <= 0) return "购买数量有误";
        if (!config.isOnSale()) return "商品未上架";
        if (num > config.getMaxNum()) return "购买数量超限";
        return "OK";
    }
}

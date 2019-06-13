package com.dx.ss.example.order;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "user")
public interface UserRpcService {

    @GetMapping("/user/status")
    String getUserStatus();
}

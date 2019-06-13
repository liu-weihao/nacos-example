package com.dx.ss.example.user;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "user")
public class UserConfig {

    /**
     * 用户状态：enable-启用，disable-禁用
     */
    private String status;
}

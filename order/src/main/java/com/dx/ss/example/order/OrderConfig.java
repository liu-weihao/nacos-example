package com.dx.ss.example.order;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "order")
public class OrderConfig {

    /**
     * 最大购买数量
     */
    private int maxNum = Integer.MAX_VALUE;

    /**
     * 是否上架
     */
    private boolean onSale = true;
}

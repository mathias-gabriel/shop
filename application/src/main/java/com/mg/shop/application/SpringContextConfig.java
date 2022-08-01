package com.mg.shop.application;

import com.mg.shop.order.infra.config.OrderSpringConfig;
import com.mg.shop.product.infra.config.ProductSpringConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        OrderSpringConfig.class,
        ProductSpringConfig.class
})
public class SpringContextConfig {

}

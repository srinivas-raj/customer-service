package com.veda.customer.client;

import com.veda.customer.domain.OrderData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "order-service")
public interface OrderClient {

    @RequestMapping(method = RequestMethod.GET, value = "/order")
    OrderData getOrders();
}

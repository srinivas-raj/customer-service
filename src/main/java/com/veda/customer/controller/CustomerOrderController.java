package com.veda.customer.controller;

import com.veda.customer.client.OrderClient;
import com.veda.customer.domain.CustomerData;
import com.veda.customer.domain.OrderData;
import com.veda.customer.repo.CustomerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerOrderController {
    private final OrderClient orderClient;
    private final CustomerRepo customerRepo;

    @GetMapping("/orders/{name}")
    public OrderData getMessage(@PathVariable String name) {
        return orderClient.getOrders();
    }

}

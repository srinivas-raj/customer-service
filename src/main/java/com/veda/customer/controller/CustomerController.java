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
public class CustomerController {
    private final OrderClient orderClient;
    private final CustomerRepo customerRepo;

   // @GetMapping("/{name}")
    public OrderData getMessage(@PathVariable String name) {
        return orderClient.getOrders();
    }

    @GetMapping
    public List<CustomerData> list() {
        return List.of(CustomerData.builder()
                .name("srini").id("c12")
                .orders(List.of(orderClient.getOrders())).
                build());
    }

    @PostMapping
    public CustomerData save(@RequestBody CustomerData customerData){
       return customerRepo.save(customerData);
    }

    @GetMapping("/{id}")
    public CustomerData get(@PathVariable String id){

        return customerRepo.findById(id);
    }
}

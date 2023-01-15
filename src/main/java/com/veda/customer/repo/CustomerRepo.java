package com.veda.customer.repo;

import com.veda.customer.domain.CustomerData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepo {

    public static final String HASH_KEY_NAME = "CUST";

    @Autowired
    private RedisTemplate redisTemplate;

    public CustomerData save(CustomerData customerData) {
        redisTemplate.opsForHash().put(HASH_KEY_NAME,customerData.getId(),customerData);
        return customerData;
    }
    public CustomerData findById(String id){
        return (CustomerData) redisTemplate.opsForHash().get(HASH_KEY_NAME,id);
    }
}

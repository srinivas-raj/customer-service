package com.veda.customer.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.util.List;

@Builder
@Data
@RedisHash("Customer")
public class CustomerData implements Serializable {
    private String name;
    @Id
    private String id;
    private List<OrderData> orders;
}

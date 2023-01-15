package com.veda.customer.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderData {
    private String id;
    private String orderName;
}

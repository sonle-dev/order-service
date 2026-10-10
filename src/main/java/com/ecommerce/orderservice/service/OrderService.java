package com.ecommerce.orderservice.service;

import com.ecommerce.orderservice.dto.request.OrderCreateRequest;
import com.ecommerce.orderservice.dto.response.OrderResponse;

public interface OrderService {
    String getHealthStatus();
    OrderResponse createOrder(OrderCreateRequest request);
    OrderResponse getOrderByCode(String orderCode);
}
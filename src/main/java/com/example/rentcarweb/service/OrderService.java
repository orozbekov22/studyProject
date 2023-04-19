package com.example.rentcarweb.service;

import com.example.rentcarweb.model.Order;

public interface OrderService {
    Order save(Order order);
    Order findById(Long id);
}

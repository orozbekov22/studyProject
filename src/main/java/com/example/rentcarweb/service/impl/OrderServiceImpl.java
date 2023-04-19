package com.example.rentcarweb.service.impl;

import com.example.rentcarweb.model.Order;
import com.example.rentcarweb.repository.OrderRepo;
import com.example.rentcarweb.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepo orderRepo;
    @Override
    public Order save(Order order) {
        return orderRepo.save(order);
    }

    @Override
    public Order findById(Long id) {
        return orderRepo.findById(id).get();
    }
}

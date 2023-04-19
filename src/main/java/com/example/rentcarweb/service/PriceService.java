package com.example.rentcarweb.service;

import com.example.rentcarweb.model.Price;

import java.util.List;

public interface PriceService {
    Price save(Price price);
    Price findById(Long id);
    List<Price> findAll();
    void removeById(Long id);
}

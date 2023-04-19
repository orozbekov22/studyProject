package com.example.rentcarweb.service;

import com.example.rentcarweb.model.Price;

import java.util.Optional;

public interface PriceService {
    Price save(Price price);
    Price findById(Long id);
}

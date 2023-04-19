package com.example.rentcarweb.service.impl;

import com.example.rentcarweb.model.Price;
import com.example.rentcarweb.repository.PriceRepo;
import com.example.rentcarweb.service.PriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PriceServiceImpl implements PriceService {
    private final PriceRepo priceRepo;
    @Override
    public Price save(Price price) {
        return priceRepo.save(price);
    }

    @Override
    public Price findById(Long id) {
        return priceRepo.findById(id).get();
    }

    @Override
    public List<Price> findAll() {
        return priceRepo.findAll();
    }

    @Override
    public void removeById(Long id) {
        priceRepo.deleteById(id);
    }
}

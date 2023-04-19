package com.example.rentcarweb.service.impl;

import com.example.rentcarweb.model.Price;
import com.example.rentcarweb.repository.PriceRepo;
import com.example.rentcarweb.service.PriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
}

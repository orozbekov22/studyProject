package com.example.rentcarweb.service.impl;

import com.example.rentcarweb.model.Discount;
import com.example.rentcarweb.repository.DiscountRepo;
import com.example.rentcarweb.service.DiscountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DiscountServiceImpl implements DiscountService {
    private final DiscountRepo discountRepo;
    @Override
    public Discount save(Discount discount) {
        return discountRepo.save(discount);
    }

    @Override
    public Discount findById(Long id) {
        return discountRepo.findById(id).orElseThrow(()->
                new RuntimeException("Discount not found - " + id));
    }

    @Override
    public List<Discount> findAll() {
        return discountRepo.findAll();
    }

    @Override
    public void removeById(Long id) {
        discountRepo.deleteById(id);
    }
}

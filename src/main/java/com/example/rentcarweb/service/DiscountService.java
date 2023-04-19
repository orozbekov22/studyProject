package com.example.rentcarweb.service;

import com.example.rentcarweb.model.Discount;

import java.util.List;

public interface DiscountService {
    Discount save(Discount discount);
    Discount findById(Long id);

    List<Discount> findAll();
    void removeById(Long id);

}

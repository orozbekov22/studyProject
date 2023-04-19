package com.example.rentcarweb.service;

import com.example.rentcarweb.model.Discount;

public interface DiscountService {
    Discount save(Discount discount);
    Discount findById(Long id);

}

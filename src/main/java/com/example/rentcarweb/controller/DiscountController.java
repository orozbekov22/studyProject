package com.example.rentcarweb.controller;

import com.example.rentcarweb.model.Discount;
import com.example.rentcarweb.service.DiscountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rentcar/discount")
@RequiredArgsConstructor
public class DiscountController {
    private final DiscountService discountService;

    @GetMapping
    public List<Discount> findAll(){
        return discountService.findAll();
    }
    @GetMapping("/{id}")
    public Discount getById(@PathVariable Long id){
        return discountService.findById(id);
    }
    @PostMapping("/save")
    public Discount save(@RequestBody Discount discount){
        return discountService.save(discount);
    }

    @DeleteMapping("/remove")
    public void removeById(@RequestBody Discount discount){
        discountService.removeById(discount.getId());
    }

}

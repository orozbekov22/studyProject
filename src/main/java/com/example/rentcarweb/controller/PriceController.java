package com.example.rentcarweb.controller;

import com.example.rentcarweb.model.Price;
import com.example.rentcarweb.service.PriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rentcar/price")
@RequiredArgsConstructor
public class PriceController {

    private final PriceService priceService;

    @GetMapping
    public List<Price> findAll(){
        return priceService.findAll();
    }
    @GetMapping("/{id}")
    public Price getById(@PathVariable Long id){
        return priceService.findById(id);
    }

    @PostMapping("/save")
    public Price save(@RequestBody Price price){
        return priceService.save(price);
    }

    @DeleteMapping("/remove")
    public void removeById(@RequestBody Price price){
        priceService.removeById(price.getId());
    }
}

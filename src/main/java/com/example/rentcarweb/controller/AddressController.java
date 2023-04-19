package com.example.rentcarweb.controller;


import com.example.rentcarweb.model.Address;
import com.example.rentcarweb.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rentcar/address")
@RequiredArgsConstructor
public class AddressController {
    private final AddressService addressService;

    @GetMapping
    public List<Address> findAll(){
        return addressService.findAll();
    }
    @GetMapping("/{id}")
    public Address getById(@PathVariable Long id){
        return addressService.findById(id);
    }


    @PostMapping("/save")
    public Address save(@RequestBody Address address){
        return addressService.save(address);
    }
    @DeleteMapping("/remove")
    public void removeById(@RequestBody Address address){
        addressService.removeById(address.getId());
    }

}

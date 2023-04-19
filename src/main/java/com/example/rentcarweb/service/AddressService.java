package com.example.rentcarweb.service;

import com.example.rentcarweb.model.Address;

import java.util.List;

public interface AddressService {
    Address save(Address address);
    Address findById(Long id);

    List<Address> findAll();
    void removeById(Long id);
}

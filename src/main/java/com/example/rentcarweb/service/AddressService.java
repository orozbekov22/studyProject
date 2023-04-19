package com.example.rentcarweb.service;

import com.example.rentcarweb.model.Address;

public interface AddressService {
    Address save(Address address);
    Address findById(Long id);
}

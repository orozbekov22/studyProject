package com.example.rentcarweb.service.impl;

import com.example.rentcarweb.model.Address;
import com.example.rentcarweb.repository.AddressRepo;
import com.example.rentcarweb.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {
    private final AddressRepo addressRepo;
    @Override
    public Address save(Address address) {
        return addressRepo.save(address);
    }

    @Override
    public Address findById(Long id) {
        return addressRepo.findById(id).orElseThrow(() ->
                new RuntimeException("Address not found - " + id));
    }

    @Override
    public List<Address> findAll() {
        return addressRepo.findAll();
    }

    @Override
    public void removeById(Long id) {
        addressRepo.deleteById(id);
    }
}

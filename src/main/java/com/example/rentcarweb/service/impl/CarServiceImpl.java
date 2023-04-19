package com.example.rentcarweb.service.impl;

import com.example.rentcarweb.model.Car;
import com.example.rentcarweb.repository.CarRepo;
import com.example.rentcarweb.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {
    private final CarRepo carRepo;
    @Override
    public Car save(Car car) {
        return carRepo.save(car);
    }

    @Override
    public Car findById(Long id) {
        return carRepo.findById(id).get();
    }
}

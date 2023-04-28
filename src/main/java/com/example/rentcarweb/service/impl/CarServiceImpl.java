package com.example.rentcarweb.service.impl;

import com.example.rentcarweb.model.Car;
import com.example.rentcarweb.repository.CarRepo;
import com.example.rentcarweb.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return carRepo.findById(id).orElseThrow( () ->
        new RuntimeException("Car not found - " + id));
    }

    @Override
    public List<Car> findAll() {
        return carRepo.findAll();
    }

    @Override
    public void removeById(Long id) {
        carRepo.deleteById(id);
    }
}

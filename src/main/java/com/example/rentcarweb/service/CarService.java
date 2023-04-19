package com.example.rentcarweb.service;

import com.example.rentcarweb.model.Car;

import java.util.List;

public interface CarService {
    Car save(Car car);
    Car findById(Long id);

    List<Car> findAll();
    void removeById(Long id);
}

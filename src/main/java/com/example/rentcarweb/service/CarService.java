package com.example.rentcarweb.service;

import com.example.rentcarweb.model.Car;

public interface CarService {
    Car save(Car car);
    Car findById(Long id);
}

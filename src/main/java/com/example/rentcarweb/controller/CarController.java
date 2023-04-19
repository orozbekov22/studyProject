package com.example.rentcarweb.controller;

import com.example.rentcarweb.model.Car;
import com.example.rentcarweb.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rentcar/car")
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;
    @GetMapping
    public List<Car> findAll(){
        return carService.findAll();
    }
    @GetMapping("/{id}")
    public Car getById(@PathVariable Long id){
        return carService.findById(id);
    }

    @PostMapping("/save")
    public Car save(@RequestBody Car car){
        return carService.save(car);
    }

    @DeleteMapping("/remove")
    public void removeById(@RequestBody Car car){
        carService.removeById(car.getId());
    }
}

package com.example.rentcarweb.model.dto;

import com.example.rentcarweb.model.Car;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class CarDetailDto {
    private Car car;
    private List<LocalDate> reservedDates;
}

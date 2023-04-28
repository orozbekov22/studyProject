package com.example.rentcarweb.mappers;


import com.example.rentcarweb.model.Address;
import com.example.rentcarweb.model.Car;
import com.example.rentcarweb.model.dto.AddressDto;
import com.example.rentcarweb.model.dto.CarDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CarMapper {
    Car toEntity(CarDto carDto);
    CarDto toDTO(Car car);

    List<Car> toEntity(List<CarDto> carsDto);
    List<CarDto> toDTO(List<Car> cars);
}

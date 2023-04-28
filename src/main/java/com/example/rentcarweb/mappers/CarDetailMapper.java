package com.example.rentcarweb.mappers;

import com.example.rentcarweb.model.Car;
import com.example.rentcarweb.model.dto.CarDetailDto;
import com.example.rentcarweb.model.dto.CarDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CarDetailMapper {
    Car toEntity(CarDetailDto carDetailDto);
    CarDetailDto toDTO(Car car);

    List<Car> toEntity(List<CarDetailDto> carDetailsDto);
    List<CarDetailDto> toDTO(List<Car> cars);
}

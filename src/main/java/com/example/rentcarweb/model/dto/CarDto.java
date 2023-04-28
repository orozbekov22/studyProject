package com.example.rentcarweb.model.dto;

import com.example.rentcarweb.enums.Category;
import com.example.rentcarweb.enums.ColorCar;
import com.example.rentcarweb.enums.EngineType;
import com.example.rentcarweb.enums.Transmission;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;


@Data
public class CarDto {
    private String       model;
    @JsonFormat(pattern = "yyyy")
    private LocalDate mnfYear;

    private String       description;
    private Integer      gasPer100;
    private Integer      engineVolume;

    @Enumerated(EnumType.STRING)
    private ColorCar     color;
    @Enumerated(EnumType.STRING)
    private EngineType   engineType;
    @Enumerated(EnumType.STRING)
    private Category     category;
    @Enumerated(EnumType.STRING)
    private Transmission transmission;

}

package com.example.rentcarweb.model;

import com.example.rentcarweb.enums.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
@Table(name = "tb_car")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long         id;

    private String       model;

    @JsonFormat(pattern = "yyyy")
    private LocalDate    mnfYear;

    private String       description;
    private Integer      gasPer100;
    private Integer      engineVolume;

    private ColorCar     color;
    private EngineType   engineType;
    private Category     category;
    private Transmission transmission;

    private Boolean      isAvailable;
    private BigDecimal   price;
}

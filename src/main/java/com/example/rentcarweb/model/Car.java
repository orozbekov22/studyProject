package com.example.rentcarweb.model;

import com.example.rentcarweb.enums.Category;
import com.example.rentcarweb.enums.ColorCar;
import com.example.rentcarweb.enums.EngineType;
import com.example.rentcarweb.enums.Transmission;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
@Table(schema = "tb_car")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long         id;

    private String       model;
    private LocalDate    mnfYear;
    private String       description;
    private Integer      gasPer100;
    private Integer      engineVolume;

    private ColorCar     color;
    private EngineType   engineType;
    private Category     category;
    private Transmission transmission;

    private Boolean      isAvailable;
    private BigDecimal   price;   //OneToMany
}

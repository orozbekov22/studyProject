package com.example.rentcarweb.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@Table(schema = "tb_order")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long          id;

    private String        clientName;
    private String        clientPhone;
    private String        clientEmail;


    private Address       getAddress;
    private Address       returnAddress;

    private LocalDateTime dateTimeFrom;
    private LocalDateTime dateTimeTo;
    private Boolean       babySeat;
    private Boolean       withDriver;
    private BigDecimal    priceBeforeDiscount;
    private BigDecimal    priceWithDiscount;

    @OneToMany(cascade = CascadeType.ALL)
        @JoinColumn(name = "car_id", referencedColumnName = "id")
    private List<Car>           cars;

}

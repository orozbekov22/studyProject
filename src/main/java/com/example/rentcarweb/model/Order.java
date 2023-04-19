package com.example.rentcarweb.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@Table(name = "tb_order")
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

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime dateTimeFrom;
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime dateTimeTo;

    private Boolean       babySeat;
    private Boolean       withDriver;
    private BigDecimal    priceBeforeDiscount;
    private BigDecimal    priceWithDiscount;

    @OneToMany(cascade = CascadeType.ALL)
        @JoinColumn(name = "car_id", referencedColumnName = "id")
    private List<Car>           cars;

    @OneToMany
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private List<Address> address;


      /*@OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address       getAddress;
    @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address       returnAddress;*/

}

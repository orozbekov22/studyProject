package com.example.rentcarweb.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "tb_price")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long       id;

    private BigDecimal price;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate  startDate;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate  endDate;

    @ManyToOne
        @JoinColumn(name = "car_id", referencedColumnName = "id")
    private Car        car;
}

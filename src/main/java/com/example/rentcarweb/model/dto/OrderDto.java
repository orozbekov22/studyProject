package com.example.rentcarweb.model.dto;


import com.example.rentcarweb.model.Address;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class OrderDto {
    private String clientName;
    private String clientPhone;
    private String clientEmail;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime dateTimeFrom;
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime dateTimeTo;

    private BigDecimal priceBeforeDiscount;
    private BigDecimal priceWithDiscount;

    @ManyToOne()
    @JoinColumn(name = "get_address", referencedColumnName = "id")
    private Address getAddress;

    @ManyToOne()
    @JoinColumn(name = "return_address", referencedColumnName = "id")
    private Address returnAddress;

}

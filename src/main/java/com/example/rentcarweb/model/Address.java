package com.example.rentcarweb.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(schema = "tb_address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long   id;

    private String city;
    private String street;
    private String buildingNum;

    @ManyToOne
        @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Order  order;

}

package com.example.rentcarweb.repository;

import com.example.rentcarweb.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepo extends JpaRepository<Price,Long> {
}

package com.example.rentcarweb.mappers;

import com.example.rentcarweb.model.Discount;
import com.example.rentcarweb.model.dto.DiscountDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface DiscountMapper {
    Discount toEntity(DiscountDto discountDto);
    DiscountDto toDTO(Discount discount);

    List<Discount> toEntity(List<DiscountDto> discountsDto);
    List<DiscountDto> toDTO(List<Discount> discounts);
}

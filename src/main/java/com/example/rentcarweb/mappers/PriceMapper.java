package com.example.rentcarweb.mappers;

import com.example.rentcarweb.model.Address;
import com.example.rentcarweb.model.Price;
import com.example.rentcarweb.model.dto.AddressDto;
import com.example.rentcarweb.model.dto.PriceDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface PriceMapper {
    Price toEntity(PriceDto priceDto);
    PriceDto toDTO(Price price);

    List<Price> toEntity(List<PriceDto> pricesDto);
    List<PriceDto> toDTO(List<Price> prices);

}

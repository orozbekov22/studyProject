package com.example.rentcarweb.mappers;

import com.example.rentcarweb.model.Address;
import com.example.rentcarweb.model.dto.AddressDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface AddressMapper {
    Address toEntity(AddressDto addressDto);
    AddressDto toDTO(Address address);

    List<Address> toEntity(List<AddressDto> addressesDto);
    List<AddressDto> toDTO(List<Address> addresses);
}

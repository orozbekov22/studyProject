package com.example.rentcarweb.mappers;

import com.example.rentcarweb.model.Address;
import com.example.rentcarweb.model.Order;
import com.example.rentcarweb.model.dto.AddressDto;
import com.example.rentcarweb.model.dto.OrderDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    Order toEntity(OrderDto orderDto);
    OrderDto toDTO(Order order);

    List<Order> toEntity(List<OrderDto> ordersDto);
    List<OrderDto> toDTO(List<Order> orders);
}

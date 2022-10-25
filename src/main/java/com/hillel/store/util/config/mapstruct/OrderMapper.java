package com.hillel.store.util.config.mapstruct;

import com.hillel.store.domain.Order;
import com.hillel.store.dto.order.OrderReadDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    Order createOrderFromDto(OrderReadDto orderCreateDto);

    OrderReadDto productCreateDto(Order order);

    OrderReadDto orderReadDto(Order order);

    List<OrderReadDto> orderReadListDto(List<Order> orderList);

    Order orderFromDto(OrderReadDto orderReadDto);
}

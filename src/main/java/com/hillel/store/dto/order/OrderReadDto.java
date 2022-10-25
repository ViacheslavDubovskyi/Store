package com.hillel.store.dto.order;

import com.hillel.store.dto.cart.CartReadDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public class OrderReadDto {

    public Integer id;
    public Double deliveryPrice;
    public CartReadDto cartDto;
}

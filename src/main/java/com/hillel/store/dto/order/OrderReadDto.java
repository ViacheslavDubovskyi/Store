package com.hillel.store.dto.order;

import com.hillel.store.domain.Cart;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public class OrderReadDto {

    public Integer id;
    public Double deliveryPrice;
    public Cart cart;
}

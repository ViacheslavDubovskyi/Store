package com.hillel.store.dto.order;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public class OrderCreateDto {

    private Integer id;
    private Double deliveryPrice;
}

package com.hillel.store.dto.cart;

import com.hillel.store.dto.product.ProductReadDto;
import java.util.ArrayList;
import java.util.List;

public class CartReadDto {

    public Double totalPrice;
    public List<ProductReadDto> productsDtoList = new ArrayList<>();
}

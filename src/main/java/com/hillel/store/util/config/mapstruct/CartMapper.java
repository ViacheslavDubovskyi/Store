package com.hillel.store.util.config.mapstruct;

import com.hillel.store.domain.Cart;
import com.hillel.store.dto.cart.CartReadDto;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel = "spring")
public interface CartMapper {

    Cart createCartFromDto(CartReadDto cartReadDto);

    CartReadDto cartCreateDto(Cart cart);

    CartReadDto cartReadDto(Cart cart);

    List<CartReadDto> cartReadListDto(List<Cart> cartList);

    Cart cartFromDto(CartReadDto cartReadDto);
}

package com.hillel.store.util.config.mapstruct;

import com.hillel.store.domain.Product;
import com.hillel.store.dto.product.ProductCreateDto;
import com.hillel.store.dto.product.ProductReadDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    Product createProductFromDto(ProductCreateDto productCreateDto);

    ProductCreateDto productCreateDto(Product product);

    ProductReadDto productReadDto(Product product);

    List<ProductReadDto> productReadListDto(List<Product> productList);

    Product productFromDto(ProductReadDto productReadDto);
}

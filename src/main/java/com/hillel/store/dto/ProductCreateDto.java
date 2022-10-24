package com.hillel.store.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ProductCreateDto {

    @NotNull(message = "Product name may not be null")
    @Size(min = 2, max = 30, message = "Product name must be between 2 and 30 characters long")
    @Schema(description = "Name of product", example = "T-shirt", required = true)
    private String productName;

    @NotNull(message = "Category name may not be null")
    @Size(min = 2, max = 30, message = "Category name must be between 2 and 30 characters long")
    @Schema(description = "Category name", example = "Clothes", required = true)
    private String category;

    @NotNull(message = "Price may not be null")
    @Size(min = 1, max = 10, message = "Price must be between 1 and 10 characters long")
    @Schema(description = "Product price", example = "99", required = true)
    private Double price;
}

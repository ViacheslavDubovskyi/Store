package com.hillel.store.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AddressCreateDto {

    @NotNull(message = "Country may not be null")
    @Size(min = 3, max = 20, message = "Country must be between 3 and 20 characters long")
    @Schema(description = "Country of customer", example = "Ukraine", required = true)
    private String country;

    @NotNull(message = "City may not be null")
    @Size(min = 3, max = 20, message = "City must be between 3 and 20 characters long")
    @Schema(description = "City of customer", example = "Dnipro", required = true)
    private String city;

    @NotNull(message = "Zip Code may not be null")
    @Size(min = 5, max = 5, message = "Zip Code must be 5 characters long")
    @Schema(description = "Zip Code of customer", example = "49130", required = true)
    private Integer zipCode;
}

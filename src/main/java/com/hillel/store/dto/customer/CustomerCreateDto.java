package com.hillel.store.dto.customer;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class CustomerCreateDto {

    @NotNull(message = "Name may not be null")
    @Size(min = 2, max = 20, message = "Name must be between 2 and 20 characters long")
    @Schema(description = "Name of customer", example = "Brad", required = true)
    private String firstName;

    @NotNull(message = "Surname may not be null")
    @Size(min = 2, max = 20, message = "Name must be between 2 and 20 characters long")
    @Schema(description = "Name of customer", example = "Pitt", required = true)
    private String surname;

    @NotNull(message = "DateOfBirth may not be null")
    @Schema(description = "Date of Birth", example = "2001-05-27", required = true)
    private LocalDate dateOfBirth;

    @Email
    @NotNull
    @Schema(description = "Email address of customer.", example = "brad@mail.com", required = true)
    private String email;

    @NotNull(message = "Customer phone number may not be null")
    @Size(min = 9, max = 12, message = "Phone number must be between 9 and 12 characters long")
    @Schema(description = "Phone number of customer", example = "380952145870", required = true)
    private Long phoneNumber;
}

package com.hillel.store.dto;

import java.sql.Date;
import java.time.LocalDate;

public class CustomerCreateDto {

    private String firstName;
    private String surname;
    private LocalDate dateOfBirth;
    private Date dateOfRegistration;
    private String email;
    private Long phoneNumber;
}

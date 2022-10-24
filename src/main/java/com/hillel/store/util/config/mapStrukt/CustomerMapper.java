package com.hillel.store.util.config.mapStrukt;

import com.hillel.store.domain.Customer;
import com.hillel.store.dto.CustomerCreateDto;
import com.hillel.store.dto.CustomerReadDto;
import com.hillel.store.dto.CustomerUpdateDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerCreateDto customerCreateDto(Customer customer);
    CustomerReadDto customerReadDto(Customer customer);
    CustomerUpdateDto customerUpdateDto(Customer customer);
}

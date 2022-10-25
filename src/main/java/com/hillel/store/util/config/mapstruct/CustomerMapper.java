package com.hillel.store.util.config.mapstruct;

import com.hillel.store.domain.Customer;
import com.hillel.store.dto.customer.CustomerCreateDto;
import com.hillel.store.dto.customer.CustomerReadDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    Customer createCustomerFromDto(CustomerCreateDto customerCreateDto);

    CustomerCreateDto customerCreateDto(Customer customer);

    CustomerReadDto customerReadDto(Customer customer);

    List<CustomerReadDto> customerReadListDto(List<Customer> customerList);

    Customer customerFromDto(CustomerReadDto customerreadDto);
}

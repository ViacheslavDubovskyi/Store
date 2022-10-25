package com.hillel.store.util.config.mapstruct;

import com.hillel.store.domain.Address;
import com.hillel.store.dto.address.AddressCreateDto;
import com.hillel.store.dto.address.AddressReadDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    Address createAddressFromDto(AddressCreateDto addressCreateDto);

    AddressCreateDto productCreateDto(Address address);

    AddressReadDto addressReadDto(Address address);

    List<AddressReadDto> addressReadListDto(List<Address> addressList);

    Address addressFromDto(AddressReadDto addressReadDto);
}

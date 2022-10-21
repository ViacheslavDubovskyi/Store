package com.hillel.store.service.address;

import com.hillel.store.domain.Address;
import com.hillel.store.repository.AddressRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@AllArgsConstructor
public class AddressServiceBean implements AddressService {

    private final AddressRepository addressRepository;

    @Override
    public Address create(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public List<Address> getAll() {
        return addressRepository.findAll();
    }

    @Override
    public Address getById(Integer id) {
        return addressRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Address with id " + id + " was not found"));
    }

    @Override
    public Address updateById(Integer id, Address address) {
        return addressRepository.findById(id)
                .map(a -> {
                    a.setCountry(address.getCountry());
                    a.setCity(address.getCity());
                    a.setZipCode(address.getZipCode());
                    return addressRepository.save(a);
                })
                .orElseThrow(() -> new EntityNotFoundException("Address with id " + id + " was not found"));
    }

    @Override
    public void removeById(Integer id) {
        addressRepository.deleteById(id);
    }
}

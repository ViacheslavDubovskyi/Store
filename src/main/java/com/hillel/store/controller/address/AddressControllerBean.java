package com.hillel.store.controller.address;

import com.hillel.store.domain.Address;
import com.hillel.store.service.address.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/store_api", produces = MediaType.APPLICATION_JSON_VALUE)
public class AddressControllerBean implements AddressController {

    private final AddressService addressService;

    @Override
    @PostMapping("/address")
    public Address create(@RequestBody Address address) {
        return addressService.create(address);
    }

    @Override
    @GetMapping("/address")
    public List<Address> getAll() {
        return addressService.getAll();
    }

    @Override
    @GetMapping("/address/{customer_id}")
    public Address getById(@PathVariable Integer customer_id) {
        return addressService.getById(customer_id);
    }

    @Override
    @PutMapping("/address/{customer_id}")
    public Address updateById(@PathVariable("customer_id") Integer id, @RequestBody Address address) {
        return addressService.updateById(id, address);
    }

    @Override
    @PatchMapping("/address/{customer_id}")
    public void removeById(@PathVariable Integer customer_id) {
        addressService.removeById(customer_id);
    }
}

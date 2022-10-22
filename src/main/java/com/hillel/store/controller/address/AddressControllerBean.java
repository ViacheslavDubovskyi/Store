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
    @GetMapping("/address/id}")
    public Address getById(@PathVariable Integer id) {
        return addressService.getById(id);
    }

    @Override
    @PutMapping("/address/{id}")
    public Address updateById(@PathVariable("id") Integer id, @RequestBody Address address) {
        return addressService.updateById(id, address);
    }

    @Override
    @PatchMapping("/address/{id}")
    public void removeById(@PathVariable Integer id) {
        addressService.removeById(id);
    }
}

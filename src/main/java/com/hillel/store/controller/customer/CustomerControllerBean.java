package com.hillel.store.controller.customer;

import com.hillel.store.domain.Customer;
import com.hillel.store.service.customer.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/store_api", produces = MediaType.APPLICATION_JSON_VALUE)
public class CustomerControllerBean implements CustomerController {

    private final CustomerService customerService;

    @Override
    @PostMapping("/customer")
    public Customer create(@RequestBody Customer customer) {
        return customerService.create(customer);
    }

    @Override
    @GetMapping("/customer")
    public List<Customer> getAll() {
        return customerService.getAll();
    }

    @Override
    @GetMapping("/customer/{id}")
    public Customer getById(@PathVariable Integer id) {
        return customerService.getById(id);
    }

    @Override
    @PutMapping("/customer/{id}")
    public Customer updateById(@PathVariable("id") Integer id, Customer customer) {
        return customerService.updateById(id, customer);
    }

    @Override
    @PatchMapping("/customer/{id}")
    public void removeById(@PathVariable Integer id) {
        customerService.removeById(id);
    }
}

package com.hillel.store.service.customer;

import com.hillel.store.domain.Customer;
import com.hillel.store.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@AllArgsConstructor
public class CustomerServiceBean implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public Customer create(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getById(Integer id) {
        return customerRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Customer with id " + id + " was not found"));
    }

    @Override
    public Customer updateById(Integer id, Customer customer) {
        return customerRepository.findById(id)
                .map(o -> {
                    o.setDateOfBirth(customer.getDateOfBirth());
                    o.setDateOfRegistration(customer.getDateOfRegistration());
                    o.setEmail(customer.getEmail());
                    o.setFirstName(customer.getFirstName());
                    o.setPhoneNumber(customer.getPhoneNumber());
                    o.setSurname(customer.getSurname());
                    return customerRepository.save(o);
                }).orElseThrow(() -> new EntityNotFoundException("Customer with id " + id + " was not found"));
    }

    @Override
    public void removeById(Integer id) {
        customerRepository.deleteById(id);
    }

}

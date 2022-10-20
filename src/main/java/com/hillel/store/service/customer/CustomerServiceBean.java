package com.hillel.store.service.customer;

import com.hillel.store.domain.Customer;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerServiceBean implements CustomerService {

    @Override
    public Customer create(Customer customer) {
        return null;
    }

    @Override
    public List<Customer> getAll() {
        return null;
    }

    @Override
    public Customer getById(Integer id) {
        return null;
    }

    @Override
    public Customer updateById(Integer id, Customer object) {
        return null;
    }

    @Override
    public void removeById(Integer id) {

    }

}

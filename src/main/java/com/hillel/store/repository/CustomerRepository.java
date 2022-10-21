package com.hillel.store.repository;

import com.hillel.store.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
@org.springframework.stereotype.Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {


}

package com.hillel.store.repository.customer;

import com.hillel.store.domain.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@org.springframework.stereotype.Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    // TODO add and redo methods when create column is_deleted

    @Query("select c from Customer c where c.firstName = ?1")
    Page<Customer> findByName(String name, Pageable pageable);
}

package com.hillel.store.repository;

import com.hillel.store.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;
@org.springframework.stereotype.Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
}

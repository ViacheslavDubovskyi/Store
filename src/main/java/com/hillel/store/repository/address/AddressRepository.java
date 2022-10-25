package com.hillel.store.repository.address;

import com.hillel.store.domain.Address;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@org.springframework.stereotype.Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

    // TODO add and redo methods when create column is_deleted

}

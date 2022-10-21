package com.hillel.store.repository;

import com.hillel.store.domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
@org.springframework.stereotype.Repository

public interface CartRepository extends JpaRepository<Cart, Integer> {
}

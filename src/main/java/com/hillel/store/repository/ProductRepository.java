package com.hillel.store.repository;

import com.hillel.store.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}

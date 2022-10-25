package com.hillel.store.repository.product;

import com.hillel.store.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    // TODO add and redo methods when create column is_deleted

}

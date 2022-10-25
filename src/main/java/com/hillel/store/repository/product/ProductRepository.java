package com.hillel.store.repository.product;

import com.hillel.store.domain.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@org.springframework.stereotype.Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    // TODO add and redo methods when create column is_deleted

    @Query("select p from Product p where p.category = ?1")
    Page<Product> findByCategory(String category, Pageable pageable);
}

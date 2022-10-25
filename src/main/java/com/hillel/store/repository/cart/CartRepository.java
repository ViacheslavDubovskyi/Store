package com.hillel.store.repository.cart;

import com.hillel.store.domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
@org.springframework.stereotype.Repository

public interface CartRepository extends JpaRepository<Cart, Integer> {

    // TODO add and redo methods when create column is_deleted

}

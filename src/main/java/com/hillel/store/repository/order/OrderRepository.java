package com.hillel.store.repository.order;

import com.hillel.store.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
@org.springframework.stereotype.Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

    // TODO add and redo methods when create column is_deleted

}

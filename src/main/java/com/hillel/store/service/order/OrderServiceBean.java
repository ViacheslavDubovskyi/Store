package com.hillel.store.service.order;

import com.hillel.store.domain.Order;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderServiceBean implements OrderService {

    @Override
    public Order create(Order object) {
        return null;
    }

    @Override
    public List<Order> getAll() {
        return null;
    }

    @Override
    public Order getById(Integer id) {
        return null;
    }

    @Override
    public Order updateById(Integer id, Order object) {
        return null;
    }

    @Override
    public void removeById(Integer id) {

    }
}

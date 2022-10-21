package com.hillel.store.service.order;

import com.hillel.store.domain.Order;
import com.hillel.store.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@AllArgsConstructor
public class OrderServiceBean implements OrderService {

    OrderRepository orderRepository;

    @Override
    public Order create(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order getById(Integer id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Order with id " + id + " was not found"));
    }

    @Override
    public Order updateById(Integer id, Order order) {
        return orderRepository.findById(id)
                .map(o -> {
                    o.setDeliveryPrice(order.getDeliveryPrice());
                    o.setTotalPrice(order.getTotalPrice());
                    o.setCart(order.getCart());
                    return o;
                })
                .orElseThrow(() -> new EntityNotFoundException("Order with id " + id + " was not found"));
    }

    @Override
    public void removeById(Integer id) {
        orderRepository.deleteById(id);
    }
}

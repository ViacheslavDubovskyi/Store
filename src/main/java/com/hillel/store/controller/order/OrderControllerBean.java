package com.hillel.store.controller.order;

import com.hillel.store.domain.Address;
import com.hillel.store.domain.Order;
import com.hillel.store.service.order.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/store_api", produces = MediaType.APPLICATION_JSON_VALUE)
public class OrderControllerBean implements OrderController {

    private final OrderService orderService;

    @Override
    @PostMapping("/order")
    public Order create(@RequestBody Order order) {
        return orderService.create(order);
    }

    @Override
    @GetMapping("/order")
    public List<Order> getAll() {
        return orderService.getAll();
    }

    @Override
    @GetMapping("/order/{customer_id}")
    public Order getById(@PathVariable Integer customer_id) {
        return orderService.getById(customer_id);
    }

    @Override
    @PutMapping("/order/{customer_id}")
    public Order updateById(@PathVariable("customer_id") Integer id, @RequestBody Order order) {
        return orderService.updateById(id, order);
    }

    @Override
    @PatchMapping("/order/{customer_id}")
    public void removeById(@PathVariable Integer customer_id) {
        orderService.removeById(customer_id);
    }
}

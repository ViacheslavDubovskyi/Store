package com.hillel.store.controller.order;

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
    @GetMapping("/order/{id}")
    public Order getById(@PathVariable Integer id) {
        return orderService.getById(id);
    }

    @Override
    @PutMapping("/order/{id}")
    public Order updateById(@PathVariable("id") Integer id, @RequestBody Order order) {
        return orderService.updateById(id, order);
    }

    @Override
    @PatchMapping("/order/{id}")
    public void removeById(@PathVariable Integer id) {
        orderService.removeById(id);
    }
}

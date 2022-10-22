package com.hillel.store.controller.cart;

import com.hillel.store.domain.Cart;
import com.hillel.store.service.cart.CartService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/store_api", produces = MediaType.APPLICATION_JSON_VALUE)
public class CartControllerBean implements CartController {

    private final CartService cartService;

    @Override
    @PostMapping("/cart")
    public Cart create(@RequestBody Cart cart) {
        return cartService.create(cart);
    }

    @Override
    @GetMapping("/cart")
    public List<Cart> getAll() {
        return cartService.getAll();
    }

    @Override
    @GetMapping("/cart/{id}")
    public Cart getById(@PathVariable Integer id) {
        return cartService.getById(id);
    }

    @Override
    @PutMapping("/cart/{id}")
    public Cart updateById(@PathVariable("id") Integer id, @RequestBody Cart cart) {
        return cartService.updateById(id, cart);
    }

    @Override
    @PatchMapping("/cart/{id}")
    public void removeById(@PathVariable Integer id) {
        cartService.removeById(id);
    }
}

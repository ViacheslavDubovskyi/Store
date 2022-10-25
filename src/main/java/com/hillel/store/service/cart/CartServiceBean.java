package com.hillel.store.service.cart;

import com.hillel.store.domain.Cart;
import com.hillel.store.repository.cart.CartRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@AllArgsConstructor
public class CartServiceBean implements CartService {

    private final CartRepository cartRepository;

    @Override
    public Cart create(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public List<Cart> getAll() {
        return cartRepository.findAll();
    }

    @Override
    public Cart getById(Integer id) {
        return cartRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Cart with id " + id + " was not found"));
    }

    @Override
    public Cart updateById(Integer id, Cart cart) {
        return cartRepository.findById(id)
                .map(o -> {
                    o.setTotalPrice(cart.getTotalPrice());
                    return cartRepository.save(o);
                })
                .orElseThrow(() -> new EntityNotFoundException("Order with id " + id + " was not found"));
    }

    @Override
    public void removeById(Integer id) {
        cartRepository.deleteById(id);
    }
}

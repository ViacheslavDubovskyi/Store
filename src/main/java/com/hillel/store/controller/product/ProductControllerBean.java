package com.hillel.store.controller.product;

import com.hillel.store.domain.Address;
import com.hillel.store.domain.Product;
import com.hillel.store.service.order.OrderService;
import com.hillel.store.service.product.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/store_api", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductControllerBean implements ProductController {

    private final ProductService productService;

    @Override
    @PostMapping("/product")
    public Product create(@RequestBody Product product) {
        return productService.create(product);
    }

    @Override
    @GetMapping("/product")
    public List<Product> getAll() {
        return productService.getAll();
    }

    @Override
    @GetMapping("/product/{cart_id}")
    public Product getById(@PathVariable Integer cart_id) {
        return productService.getById(cart_id);
    }

    @Override
    @PutMapping("/product/{cart_id}")
    public Product updateById(@PathVariable("cart_id") Integer id, @RequestBody Product product) {
        return productService.updateById(id, product);
    }

    @Override
    @PatchMapping("/product/{cart_id}")
    public void removeById(@PathVariable Integer cart_id) {
        productService.removeById(cart_id);
    }
}

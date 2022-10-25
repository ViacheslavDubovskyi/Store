package com.hillel.store.service.product;

import com.hillel.store.domain.Product;
import com.hillel.store.repository.product.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@AllArgsConstructor
@Service
public class ProductServiceBean implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product getById(Integer id) {
        return productRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Product with id " + id + " was not found"));
    }

    @Override
    public Product updateById(Integer id, Product product) {
        return productRepository.findById(id)
                .map(o -> {
                    o.setProductName(product.getProductName());
                    o.setCategory(product.getCategory());
                    o.setIsAvailable(product.getIsAvailable());
                    o.setPrice(product.getPrice());
                    return productRepository.save(o);
                }).orElseThrow(() -> new EntityNotFoundException("Product with id " + id + " was not found"));
    }

    @Override
    public void removeById(Integer id) {
        productRepository.deleteById(id);
    }
}

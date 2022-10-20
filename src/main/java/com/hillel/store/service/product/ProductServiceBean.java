package com.hillel.store.service.product;

import com.hillel.store.domain.Product;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductServiceBean implements ProductService {

    @Override
    public Product create(Product object) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public Product getById(Integer id) {
        return null;
    }

    @Override
    public Product updateById(Integer id, Product object) {
        return null;
    }

    @Override
    public void removeById(Integer id) {

    }
}

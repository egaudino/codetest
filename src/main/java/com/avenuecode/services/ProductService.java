package com.avenuecode.services;

import com.avenuecode.domain.Product;
import org.springframework.context.annotation.Bean;


/**
 * Created by cod- on 7/6/2017.
 */
public interface ProductService {
    Iterable<Product> listProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);

    void deleteProduct(Integer id);
}

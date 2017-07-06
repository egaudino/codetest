package com.avenuecode.controllers;

import com.avenuecode.domain.Product;
import com.avenuecode.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


/**
 * Created by cod- on 7/6/2017.
 */

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) { this.productService = productService; }


    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Product> list(Product product){
        return productService.listProducts();

    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Product getProductById(@PathVariable("id") Integer id) {
        return productService.getProductById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Product newProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.POST)
    public Product updateProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteProduct(@PathVariable("id") Integer id) {
        productService.deleteProduct(id);
    }




}

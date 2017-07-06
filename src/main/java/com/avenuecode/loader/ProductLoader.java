package com.avenuecode.loader;

import com.avenuecode.domain.Image;
import com.avenuecode.domain.Product;
import com.avenuecode.repositories.ImageRepository;
import com.avenuecode.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cod- on 7/6/2017.
 */
@Component
public class ProductLoader implements ApplicationListener<ContextRefreshedEvent> {

    private ProductRepository productRepository;
    private ImageRepository imageRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Autowired
    public void setImageRepository(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        /*List<Image> images = new ArrayList<Image>();

        // Image 1
        Image image = new Image();
        image.setUrl("urlTeste");
        images.add(image);
        //image.setProduct(product1);
        imageRepository.save(image);

        // Product 1
        Product product1 = new Product();
        product1.setName("Product 1");
        product1.setImages(images);
        productRepository.save(product1);*/


    }

}

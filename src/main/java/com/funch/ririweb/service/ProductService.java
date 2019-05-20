package com.funch.ririweb.service;

import com.funch.ririweb.domain.product.Product;
import com.funch.ririweb.domain.product.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class ProductService {

    private ProductRepository productRepository;

    @Transactional
    public void enroll(Product product) {
        Product origin = productRepository.findByNameAndCompany(product.getName(), product.getCompany());

        if(origin == null) {
            productRepository.save(product);
        }
    }

}

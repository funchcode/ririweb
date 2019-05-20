package com.funch.ririweb.web;

import com.funch.ririweb.domain.product.ProductDTO;
import com.funch.ririweb.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/product")
public class ProductRestController {

    private ProductService productService;

    @PostMapping("/enroll")
    public void enrollProduct(@RequestBody ProductDTO product) {
        productService.enroll(product.toEntity());
    }
}

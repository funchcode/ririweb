package com.funch.ririweb.service;

import com.funch.ririweb.domain.product.Product;
import com.funch.ririweb.domain.product.ProductDTO;
import com.funch.ririweb.domain.product.ProductRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ProductServiceTests {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductRepository productRepository;

    /*상품 등록(origin/new)*/
    @Test
    public void 상품_등록() {
        // given
        Product product = Product.builder().name("립스틱").company("리리네일").inPrice(2000).salePrice(3000)
                .state("").stock(10).memo("샘플입니다.").build();

        // when
        productService.enroll(product);

        // then
        Product origin = productRepository.findByNameAndCompany(product.getName(), product.getCompany());
        Assert.assertEquals(product.getName(), origin.getName());
    }
}

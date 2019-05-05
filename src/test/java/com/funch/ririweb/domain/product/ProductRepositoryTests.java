package com.funch.ririweb.domain.product;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ProductRepositoryTests {
    @Autowired
    ProductRepository productRepository;

    @Test
    public void 판매_물건_등록() {
        // given
        Product product = Product.builder().name("핸드크림").inPrice(3000)
                .salePrice(5000).stock(30).build();
        List<Product> result;

        // when
        productRepository.save(product);
        result = productRepository.findAll();

        // then
        Assert.assertEquals(result.get(0).getName(), product.getName());
    }
}

package com.funch.ririweb.domain.category;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CategoryRepositoryTests {
    @Autowired
    CategoryRepository categoryRepository;

    @Test
    public void 카테고리_등록_테스트() {
        // given
        Category category = Category.builder().name("패디").useYn('Y').build();
        List<Category> result;

        // when
        categoryRepository.save(category);
        result = categoryRepository.findAll();

        // then
        Assert.assertEquals(result.get(0).getName(), category.getName());
    }
}

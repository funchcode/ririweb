package com.funch.ririweb.service;

import com.funch.ririweb.domain.category.Category;
import com.funch.ririweb.domain.category.CategoryRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/*
    카테고리 등록, 카테고리 가져오기, 카테고리 사용안함
*/
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class CategoryServiceTests {
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

    @Test
    public void 카테고리_사용안함() { // 사용자가 1차 분류인 카테고리를 더 이상 사용하길 원치않음
        // given
        long categoryNo = 13;
        Category category;

        // when
        category = categoryRepository.findById(categoryNo).get();
        category.setUseYn('N');
        categoryRepository.save(category);

        // then
        Assert.assertEquals(category.getUseYn(), 'N');
    }

    @Test
    public void 카테고리_메뉴_불러오기() { // 2차 메뉴 생성과 결제 시에 1차메뉴를 불러와야한다.
        // given
        List<Category> result;

        // when
        result = categoryRepository.findAll();

        // then
        Assert.assertEquals(result.size(), 1);
    }
}

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

        // when

        // then

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

    @Test
    public void 카테고리_중복항목_불러오기() {
        // given

        // when

        // then
    }

    @Test
    public void 사용하는_카테고리_불러오기() {
        // given
        List<Category> lists;
        Category category;

        // when
        lists = categoryRepository.findAllByUseYnEquals('Y');
        category = lists.get(0);

        // then
        Assert.assertEquals(category.getName(), "패디");
    }
}

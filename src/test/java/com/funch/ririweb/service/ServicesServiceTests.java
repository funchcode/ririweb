package com.funch.ririweb.service;

import com.funch.ririweb.domain.category.Category;
import com.funch.ririweb.domain.services.Services;
import com.funch.ririweb.domain.services.ServicesRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ServicesServiceTests {
    @Autowired
    ServicesRepository servicesRepository;

    @Test
    public void 메뉴_등록_테스트() {   // 1차(카테고리) 선택 후 등록가능하다.
        // given
        long categoryNo = 13;
        Services services = Services.builder().categoryNo(categoryNo).name("젤 제거").price(20000).build();
        List<Services> result;

        // when
        servicesRepository.save(services);
        result = servicesRepository.findAll();

        // then
        Assert.assertEquals(result.get(0).getName(), services.getName());
    }

    @Test
    public void 메뉴_사용안함() {     // 2차 메뉴를 사용안함
        // given
        long servicesNo = 14;
        Services services;

        // when
        services = servicesRepository.findById(servicesNo).get();
        services.setUseYn('N');
        servicesRepository.save(services);

        // then
        Assert.assertEquals(services.getUseYn(), 'N');
    }

    @Test
    public void 카테고리_메뉴에_해당하는_메뉴_불러오기() {     // 2차 메뉴를 불러와야한다.
        // given
        long categoryNo = 13; // 테스트 당시 "패디메뉴"
        List<Services> results;

        // when
        results = servicesRepository.findByCategoryNoOrderByServiceNoAsc(categoryNo);

        // then
        Assert.assertEquals(results.size(), 1);
    }
}

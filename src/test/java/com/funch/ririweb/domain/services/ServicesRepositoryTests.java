package com.funch.ririweb.domain.services;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ServicesRepositoryTests {
    @Autowired
    ServicesRepository servicesRepository;

    @Test
    public void 시술_등록_테스트() {
        // given
        Services services = Services.builder().name("패디젤").build();
        List<Services> result;

        // when
        servicesRepository.save(services);
        result = servicesRepository.findAll();

        // then
        Assert.assertEquals(result.get(0).getName(), services.getName());
    }
}

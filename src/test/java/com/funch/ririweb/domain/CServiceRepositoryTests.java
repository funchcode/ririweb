package com.funch.ririweb.domain;

import com.funch.ririweb.domain.cservice.CService;
import com.funch.ririweb.domain.cservice.CServiceRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CServiceRepositoryTests {

    @Autowired
    private CServiceRepository cServiceRepository;

    @Before
    public void 전처리() {

    }

    @Test
    public void 히스토리_등록() {
        // TODO given
        CService cService = new CService(1, "TEST1", 1000);

        // TODO when
        cServiceRepository.save(cService);
        CService recent = cServiceRepository.findTopByCname(cService.getCname());

        // TODO then
        Assert.assertEquals(cService.getCname(), recent.getCname());
    }

    @After
    public void 후처리() {

    }

}

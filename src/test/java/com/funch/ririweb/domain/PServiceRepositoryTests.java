package com.funch.ririweb.domain;

import com.funch.ririweb.domain.pservice.PService;
import com.funch.ririweb.domain.pservice.PServiceRepository;
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
public class PServiceRepositoryTests {

    @Autowired
    private PServiceRepository pServiceRepository;

    @Before
    public void 전처리() {

    }

    @Test
    public void 히스토리_등록() {
        // TODO given
        PService pService = new PService("TEST01");

        // TODO when
        pServiceRepository.save(pService);
        PService recent = pServiceRepository.findTopByPname(pService.getPname());

        // TODO then
        Assert.assertEquals(pService.getPname(), recent.getPname());
    }

    @After
    public void 후처리() {

    }

}

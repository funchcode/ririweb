package com.funch.ririweb.domain;

import com.funch.ririweb.domain.cservicehistory.CServiceHistory;
import com.funch.ririweb.domain.cservicehistory.CServiceHistoryRepository;
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
public class CServiceHistoryRepositoryTests {

    @Autowired
    private CServiceHistoryRepository cServiceHistoryRepository;

    @Before
    public void 전처리() {

    }

    @Test
    public void 히스토리_등록() {
        // TODO given
        CServiceHistory cServiceHistory = new CServiceHistory(
                1, 1, 1000, 1500
        );

        // TODO when
        cServiceHistoryRepository.save(cServiceHistory);
        CServiceHistory recent = cServiceHistoryRepository.findTopByOrderByCserviceNoDesc();

        // TODO then
        Assert.assertEquals(cServiceHistory.getPayment(), recent.getPayment());
    }

    @After
    public void 후처리() {

    }

}

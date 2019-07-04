package com.funch.ririweb.domain;


import com.funch.ririweb.domain.goods.Creditor;
import com.funch.ririweb.domain.goods.CreditorRepository;
import com.funch.ririweb.domain.services.ServiceChild;
import com.funch.ririweb.domain.services.ServiceChildRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.ws.Service;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceChildRepositoryTests {

    @Autowired
    private ServiceChildRepository serviceChildRepository;

    @Before
    public void 전처리() {

    }

    @Test
    public void 매입처_등록() {
        // TODO given
        ServiceChild serviceChild = new ServiceChild(
            1, "젤네일", 50000
        ).setMemo("여름");

        // TODO when
        serviceChildRepository.save(serviceChild);
        ServiceChild recentData = serviceChildRepository.findTopByOrderByChildPkDesc();

        // TODO then
        Assert.assertEquals(serviceChild.getChildNm(), recentData.getChildNm());
    }

    @After
    public void 후처리() {

    }
}

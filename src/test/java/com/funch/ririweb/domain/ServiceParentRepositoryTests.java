package com.funch.ririweb.domain;


import com.funch.ririweb.domain.goods.Goods;
import com.funch.ririweb.domain.goods.GoodsRepository;
import com.funch.ririweb.domain.services.ServiceParent;
import com.funch.ririweb.domain.services.ServiceParentRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceParentRepositoryTests {
    @Autowired
    private ServiceParentRepository serviceParentRepository;

    @Before
    public void 전처리() {

    }

    @Test
    public void 서비스_등록() {
        // TODO given
        ServiceParent serviceParent = new ServiceParent("패디");

        // TODO when
        serviceParentRepository.save(serviceParent);
        ServiceParent recentData = serviceParentRepository.findTopByOrderByParentPkDesc();

        // TODO then
        Assert.assertEquals(serviceParent.getParentNm(), recentData.getParentNm());
    }

    @Test
    public void 서비스_모두_가져오기() {
        String usedGb = "";
        List<ServiceParent> list
                = serviceParentRepository.findAllByUsedGbOrderByParentPkDesc(usedGb);

        Assert.assertNotEquals(list, null);
    }

    @Test
    public void 서비스_가져오기() {
        int parentPk = 2;
        ServiceParent parent =
                serviceParentRepository.findByParentPk(parentPk);

        Assert.assertNotEquals(parent, null);
    }

    @After
    public void 후처리() {

    }

}

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

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceParentRepositoryTests {
    @Autowired
    private ServiceParentRepository serviceParentRepository;

    @Before
    public void 전처리() {

    }

    @Test
    public void 상품_등록() {
        // TODO given
        ServiceParent serviceParent = new ServiceParent("패디");

        // TODO when
        serviceParentRepository.save(serviceParent);
        ServiceParent recentData = serviceParentRepository.findTopByOrderByParentPkDesc();

        // TODO then
        Assert.assertEquals(serviceParent.getParentNm(), recentData.getParentNm());
    }

    @After
    public void 후처리() {

    }

}

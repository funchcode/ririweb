package com.funch.ririweb.domain;

import com.funch.ririweb.domain.goods.Goods;
import com.funch.ririweb.domain.goods.GoodsRepository;
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
public class GoodRepositoryTests {

    @Autowired
    private GoodsRepository goodRepository;

    @Before
    public void 전처리() {

    }

    @Test
    public void 상품_등록() {
        // TODO given
        Goods good = new Goods("젤", 1000, 1500, 20, "끈적임", 2);

        // TODO when
        goodRepository.save(good);
        Goods recentData = goodRepository.findTopByOrderByGoodPkDesc();

        // TODO then
        Assert.assertEquals(good.getGoodNm(), recentData.getGoodNm());
    }

    @After
    public void 후처리() {

    }

}

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

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodsRepositoryTests {

    @Autowired
    private GoodsRepository goodsRepository;

    @Before
    public void 전처리() {

    }

    @Test
    public void 상품_등록() {
        // TODO given
        Goods good = new Goods("젤", 1000, 1500, 20, "끈적임", 2);

        // TODO when
        goodsRepository.save(good);
        Goods recentData = goodsRepository.findTopByOrderByGoodsPkDesc();

        // TODO then
        Assert.assertEquals(good.getGoodsNm(), recentData.getGoodsNm());
    }

    @Test
    public void 상품_가져오기() {
        String usedGb = "YES";
        List<Goods> list = goodsRepository.findAllByUsedGbOrderByGoodsPk(usedGb);

        Assert.assertEquals(list.size(), 1);
    }

    @Test
    public void 특정_상품_가져오기() {
        int goodsPk = 1;
        Goods goods = goodsRepository.findByGoodsPk(goodsPk);

        Assert.assertEquals(goods, null);
    }

    @After
    public void 후처리() {

    }

}

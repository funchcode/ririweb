package com.funch.ririweb.domain;

import com.funch.ririweb.domain.creditor.Creditor;
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
    public void 매입처등록() {
        // given
        Goods goods = new Goods(5, "T E S T 3", 2000, 3000, 10)
                .setMemo("Memo test").setUsed('n');

        // when
        goodsRepository.save(goods);
        List<Goods> list = goodsRepository.findAll();

        // then
        Assert.assertEquals(goods.getGoodsNo(), list.get(0).getGoodsNo());
    }

    @Test
    public void 디폴트값_등록() {
        // given
        Goods goods = new Goods(
                5, "T E S T 4", 2000, 3000, 10
        );

        // when
        goodsRepository.save(goods);
        List<Goods> list = goodsRepository.findAll();

        // then
        Assert.assertEquals(goods.getGoodsNo(), list.get(0).getGoodsNo());
    }

    @After
    public void 후처리() {

    }

}

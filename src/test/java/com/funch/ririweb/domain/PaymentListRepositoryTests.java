package com.funch.ririweb.domain;

import com.funch.ririweb.domain.goods.Goods;
import com.funch.ririweb.domain.goods.GoodsRepository;
import com.funch.ririweb.domain.payments.list.PaymentList;
import com.funch.ririweb.domain.payments.list.PaymentListRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PaymentListRepositoryTests {


    @Autowired
    private PaymentListRepository paymentListRepository;

    @Before
    public void 전처리() {

    }

    @Test
    public void 상품_등록() {
        // TODO given
        PaymentList paymentList = new PaymentList.Builder(1000, 1300, 1, 1)
                .goodFk(1).build();

        // TODO when
        paymentListRepository.save(paymentList);
        PaymentList recentData = paymentListRepository.findTopByOrderByHisListPkDesc();

        // TODO then
        Assert.assertEquals(paymentList.getCreatedAt(), recentData.getCreatedAt());
    }

    @After
    public void 후처리() {

    }

}
